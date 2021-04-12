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
        Tire kt = (Tire) ctx.getBean("tire", KoreaTire.class);
        Car c1 = (Car) ctx.getBean("car", Car.class);
        c1.setTire(kt);

        Tire mt = (Tire) ctx.getBean("michelinTire", MichelinTire.class);
        Car c2 = (Car) ctx.getBean("car", Car.class);
        c2.setTire(mt);

        System.out.println(c1.run());
        System.out.println(c2.run());
    }
}
