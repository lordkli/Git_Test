package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz: ");
        String isim = scanner.nextLine();
        isim = isim.replaceAll(" ","");

        List<String> veriTabanindakiKullanicilar = new ArrayList<String>();
        veriTabanindakiKullanicilar.add("Ayse");
        veriTabanindakiKullanicilar.add("Abdurrahman");
        veriTabanindakiKullanicilar.add("Veli");
        veriTabanindakiKullanicilar.add("Ahmet");
        veriTabanindakiKullanicilar.add("Tacettin");
        veriTabanindakiKullanicilar.add("Huseyin");

        System.out.println("Kullanici adi giriniz");
        String userName = scanner.nextLine().replaceAll(" ","");

        boolean kullaniciIsmiVarMi = veriTabanindakiKullanicilar.contains(userName);
        if (kullaniciIsmiVarMi){
            System.out.println("Bu kullanici adi zaten alinmis...");
        }
        else System.out.println("Kullanici adini kullanabilirsiniz");

        if (kullaniciIsmiVarMi){
            int rasgeleSayi = new Random().nextInt(100000);
            userName = userName + "" +rasgeleSayi;
            System.out.println("Yeni sayi olarak bunu kullanabilirsiniz: " + userName);
        }
        else {
            System.out.println("Yeni kullanici adi: " + userName);
        }
        scanner.close();









    }
}
