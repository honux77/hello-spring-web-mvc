package honux;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloApplication {
    private static Logger logger = LoggerFactory.getLogger(HelloApplication.class);

    public static void main(String[] args) {
        logger.info("Hello App started..");
        Driver driver = new Driver();
        driver.drive();
    }
}
