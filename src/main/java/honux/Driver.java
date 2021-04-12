package honux;

public class Driver {
    public void drive() {
        KoreaTire kt = new KoreaTire();
        MichelinTire mt = new MichelinTire();
        Car c1 = new Car(kt);
        System.out.println(c1.run());
        Car c2 = new Car(mt);
        System.out.println(c2.run());
    }
}
