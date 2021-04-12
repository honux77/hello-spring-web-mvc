package honux;

import javax.annotation.Resource;

public class Car {
    @Resource
    private Tire tire;

    public String run() {
        return tire.getBrand() + "로 씽씽 달림";
    }
}
