package Araba;

public class Jeep implements Araba{
    @Override
    public void arabaMarkası() {
        System.out.println("Araba markası Jeep");
    }

    @Override
    public void arabaModeli() {
        System.out.println("Araba modeli Jeep Compas");
    }

    @Override
    public void motorHacmi() {
        System.out.println("Motor hacmi 120 HP ");

    }
}
