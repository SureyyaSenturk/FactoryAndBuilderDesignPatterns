package Araba;

public class Mercedes implements Araba{
    @Override
    public void arabaMarkası() {
        System.out.println("Araba markası Mercedes");

    }

    @Override
    public void arabaModeli() {
        System.out.println("Araba modeli Mercedes-AMG G63");

    }

    @Override
    public void motorHacmi() {
        System.out.println("Motor hacmi 630 Beygir ");

    }
}
