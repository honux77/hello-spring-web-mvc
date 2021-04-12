package honux;

public class Car {
    private Tire tire;

    public Car(Tire t) {
        this.tire = t;
    }

    public String run() {
        return tire.getBrand() + "로 씽씽 달림";
    }
}
