package honux;

public class Car {
    private Tire tire;

    public void setTire(Tire t) {
        this.tire = t;
    }

    public String run() {
        return tire.getBrand() + "로 씽씽 달림";
    }
}
