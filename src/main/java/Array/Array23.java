package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array23 {
    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi ", "Sali ", "Carsamba ", "Persembe ", "Cuma ", "Cumartesi ", "Pazar "));
    static List<Double> gunlukKazanclar = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static double ciro;

    public static void main(String[] args) {
        int gun = 0;
        while (gun < 7) {
            System.out.println(gunler.get(gun) + "gunun kazancini giriniz : ");
            double gunlukKazanc = scanner.nextDouble();
            gunlukKazanclar.add(gunlukKazanc);
            ciro += gunlukKazanc;
            gun++;

        }

        System.out.println("gunluk kazanclar : " + gunlukKazanclar);
        System.out.println("Hafta toplami : " + ciro);
        System.out.println("Haftalik ortalama : " + getOrtalamaKazanc());
        System.out.println("Ortalama ustu kazanc getiren gunler :" + getOrtalamaninUstundeKazancGunleri());

    }

    private static String getOrtalamaninUstundeKazancGunleri() {
        String ortalamaUstuGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {

            if (gunlukKazanclar.get(i) > getOrtalamaKazanc()) {
                ortalamaUstuGun += gunler.get(i);
            }

        }
        return ortalamaUstuGun;
    }

    private static double getOrtalamaKazanc() {
        double ortalamaKazanc = ciro / 7;
        return ortalamaKazanc;
    }
}
