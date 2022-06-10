package Array;

import java.util.Scanner;

public class Array16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        boolean asalMi = true;


        if (sayi >= 2) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) {
                System.out.println("sayi asaldir");
            } else System.out.println("sayi asal degildir");

        }
        else System.out.println("Lutfen gecerli bir sayi giriniz");
    }


}
