package Araba;

public class Bmw implements Araba{
    @Override
    public void arabaMarkası() {
        System.out.println("Araba markası Bmw");
    }

    @Override
    public void arabaModeli() {
        System.out.println("Araba modeli BMW i4");
    }

    @Override
    public void motorHacmi() {
        System.out.println("Motor hacmi 1620 Beygir");
    }
}
