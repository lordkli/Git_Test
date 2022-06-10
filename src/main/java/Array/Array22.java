package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array22 {
    static List<String> urunListesi = new ArrayList<String>();
    static List<Double> urunFiyatlari = new ArrayList<Double>();
    static double toplamOdeme ;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        urunListesi.add("domates - urun kodu: 1 ");
        urunListesi.add("muz - urun kodu: 2 ");
        urunListesi.add("cilek - urun kodu: 3 ");
        urunListesi.add("portakal - urun kodu: 4 ");
        urunListesi.add("erik - urun kodu: 5 ");

        urunFiyatlari.add(15.00);
        urunFiyatlari.add(18.00);
        urunFiyatlari.add(8.00);
        urunFiyatlari.add(47.00);
        urunFiyatlari.add(27.00);

        System.out.println(urunListesi);
        musteriSecimi();


    }

    private static void musteriSecimi() {
        System.out.print("Sectiginiz urunun kodunu giriniz: ");
        int secimi = scanner.nextInt();
        System.out.print("Sectiginiz urunden kac kilo alacaksiniz: ");
        double kilo = scanner.nextDouble();
        double urunFiyati = kilo * urunFiyatlari.get(secimi - 1 ) ;
        toplamOdeme += urunFiyati;
        System.out.print("devam etmek istiyorsaniz 1`e ; kasaya gitmek icin 2'e tiklayiniz: ");
        int dewamkee = scanner.nextInt();
        if (dewamkee == 1){
            musteriSecimi();
        }
        else kasa();

    }

    private static void kasa() {
        System.out.println("Odemeniz gereken tutar: " + toplamOdeme);
        System.out.println("Yine bekleriz... ");
    }
}
