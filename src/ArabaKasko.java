import Araba.*;
import Kaskolar.Kasko;
import Kaskolar.KaskoBuilder;

import java.util.Scanner;

public  class ArabaKasko {

    Kasko kasko;
    Scanner scanner;

    String arabaBilgisi = "KASKO FİYAT SORGULAMA PROGRAMINA HOŞGELDİNİZ." + "\n Kasko Fiyat Bilgisi Vereceğimiz Araçlar Aşağıda Listelenmektedir." + "\n 1-AUDI" + "\n 2-BMW" + "\n 3-JEEP" + "\n 4-MERCEDES" + "\nLütfen İstediğiniz Aracı Seçiniz";

    String kaskoBilgisi = "KASKO SEÇENEKLERİMİZ" + "\n 1-Standart Paket" + "\n 2-Lüx Paket" + "\n 3-Premium Paket" + "\n Lütfen Kasko Çeşitlerinden Birini Seçiniz";

    public void runProgram() throws IllegalAccessException, InstantiationException {
        scanner = new Scanner(System.in);
        System.out.println(arabaBilgisi);
        //Factory pattern
        int arabaSecimi = scanner.nextInt();
        factoryPattern(arabaSecimi);
        //Builder pattern
        System.out.println(kaskoBilgisi);
        int kaskoSecimi = scanner.nextInt();
        kaskoBuilderPattern(kaskoSecimi);

    }

    public void factoryPattern(int arabaSecimi) throws IllegalAccessException, InstantiationException {
        while (arabaSecimi < 1 || arabaSecimi > 3) {
            System.out.println("HATALI GİRİŞ YAPTINIZ LÜTFEN TEKRAR DENEYİN");
            arabaSecimi = scanner.nextInt();
        }
        try {
        switch (arabaSecimi) {
            case 1:
                Audi audi = (Audi) ArabaFactory.createFactory(Audi.class);
                audi.arabaMarkası();
                audi.arabaModeli();
                audi.motorHacmi();
                break;
            case 2:
                Bmw bmw = (Bmw) ArabaFactory.createFactory(Bmw.class);
                bmw.arabaMarkası();
                bmw.arabaModeli();
                bmw.motorHacmi();
                break;
            case 3:
                Jeep jeep = (Jeep) ArabaFactory.createFactory(Jeep.class);
                jeep.arabaMarkası();
                jeep.arabaModeli();
                jeep.motorHacmi();
                break;
            case 4:
                Mercedes mercedes = (Mercedes) ArabaFactory.createFactory(Mercedes.class);
                mercedes.arabaMarkası();
                mercedes.arabaModeli();
                mercedes.motorHacmi();
                break;
            default:
                System.out.println("HATALI GİRİŞ YAPTINIZ");
        }

        }catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }

    }
    public void kaskoBuilderPattern(int kaskoSecimi){
        while (kaskoSecimi>4 || kaskoSecimi<1) {
            System.out.println("HATALI GİRİŞ YAPTINIZ LÜTFEN TEKRAR DENEYİN");
            kaskoSecimi = scanner.nextInt();
        }
            int standard=1;
            int lüx=2;
            int premium=3;
            int toplamPuan = 0;
            if (kaskoSecimi==1){
                kasko=new KaskoBuilder().setStandartPaket(standard).buildKasko();
                toplamPuan=kasko.getStandartPaket();
            } else if (kaskoSecimi==2) {
                kasko=new KaskoBuilder().setLüxPaket(lüx).buildKasko();
                toplamPuan=kasko.getStandartPaket()+kasko.getLüxPaket();

            } else if (kaskoSecimi==3){
                kasko=new KaskoBuilder().setPremiumPaket(premium).buildKasko();
                toplamPuan=kasko.getStandartPaket()+kasko.getLüxPaket()+kasko.getPremiumPaket();
            }
            System.out.println("Seçilen Sigorta Teklifinin Toplam Tutarı:"+toplamPuan+"Euro" +"\nHOŞÇAKALIN");



        }
        }





