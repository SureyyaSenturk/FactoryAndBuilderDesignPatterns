package Kaskolar;

public class Kasko {

    private   int standartPaket;
    private  int lüxPaket;
    private  int premiumPaket;



    public int getStandartPaket() {
        return standartPaket;
    }

    public int getLüxPaket() {
        return lüxPaket;
    }

    public int getPremiumPaket() {
        return premiumPaket;
    }

  public  Kasko(KaskoBuilder kaskoBuilder){
   this.standartPaket= kaskoBuilder.getStandartPaket();
   this.lüxPaket= kaskoBuilder.getLüxPaket();
   this.premiumPaket= kaskoBuilder.getPremiumPaket();

 }
}
