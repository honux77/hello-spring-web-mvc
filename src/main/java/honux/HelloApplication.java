package honux;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class HelloApplication {
    private static Logger logger = LoggerFactory.getLogger(HelloApplication.class);

    public static void main(String[] args) {
        logger.info("Hello App started..");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/config.xml", HelloApplication.class);
        Car car = (Car) ctx.getBean("car", Car.class);
        System.out.println(car.run());
    }
}
