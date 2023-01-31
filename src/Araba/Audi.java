package Araba;

public class Audi implements Araba {
    @Override
    public void arabaMarkası() {
        System.out.println("Araba markası Audi");
    }

    @Override
    public void arabaModeli() {
        System.out.println("Araba modeli A3");
    }

    @Override
    public void motorHacmi() {
        System.out.println("Motor hacmi 1470 Beygir");
    }
}
