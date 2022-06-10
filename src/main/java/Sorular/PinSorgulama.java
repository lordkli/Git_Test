package Sorular;

import java.util.Scanner;

public class PinSorgulama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pin = "sifre.123";
        int girisHakki = 3;

        System.out.println("Hosgeldiniz....");
        System.out.println("Lutfen pini giriniz: ");
        String girilenPin = scanner.nextLine();

        while (true) {
            if (pin.equals(girilenPin)){
                System.out.println("Basarili giris yaptiniz...");
                break;
            }
            else {
                System.out.println("Yanlis giris yaptiniz..");
                girisHakki--;
                System.out.println("Kalan giris hakkiniz: " + girisHakki);

            }
            if (girisHakki == 0 ){
                System.out.println("Giris hakkiniz kalmadi... sim kartiniz bloke oldu..");
                break;
            }
        }


    }
}
