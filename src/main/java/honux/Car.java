package honux;

public class Car {
    private Tire tire;

    public Car() {
        this.tire = new KoreaTire();
    }

    public String run() {
        return tire.getBrand() + "로 씽씽 달림";
    }
}
