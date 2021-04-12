package honux;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    @Autowired
    private Tire tire;

    public String run() {
        return tire.getBrand() + "로 씽씽 달림";
    }
}
