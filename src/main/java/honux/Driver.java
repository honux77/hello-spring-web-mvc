package honux;

public class Driver {
    public void drive() {
        KoreaTire kt = new KoreaTire();
        Car car = new Car(kt);
        System.out.println(car.run());
    }
}
