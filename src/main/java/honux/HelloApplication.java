package honux;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class HelloApplication {
    private static Logger logger = LoggerFactory.getLogger(HelloApplication.class);

    public static void main(String[] args) {
        logger.info("Hello App started..");
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml", HelloApplication.class);
        KoreaTire kt = new KoreaTire();
        MichelinTire mt = new MichelinTire();
        Car c1 = new Car(kt);
        System.out.println(c1.run());
        Car c2 = new Car(mt);
        System.out.println(c2.run());
    }
}
