package Kaskolar;

public  class KaskoBuilder {

    private    int standartPaket;
    private int lüxPaket;
    private    int premiumPaket;

public KaskoBuilder(){

}

    public int getStandartPaket() {
        return standartPaket;
    }

    public int getLüxPaket() {
        return lüxPaket;
    }

    public int getPremiumPaket() {
        return premiumPaket;
    }

    public KaskoBuilder setStandartPaket(int standartPaket) {
        this.standartPaket = standartPaket;
        return this;
    }

    public KaskoBuilder setLüxPaket(int lüxPaket) {
        this.lüxPaket = lüxPaket;
        return this;
    }

    public KaskoBuilder setPremiumPaket(int premiumPaket) {
        this.premiumPaket = premiumPaket;
        return this;
    }

    public Kasko buildKasko(){
    return new Kasko(this);
}

}
