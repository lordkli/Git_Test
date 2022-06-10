package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir string giriniz: ");
        String str = scanner.nextLine();

        System.out.println("Bir sayi giriniz : ");
        int sayi = scanner.nextInt();

         System.out.println(ilkVeSonHarf(str, sayi));;
        List<String> ilkVeSonHarf = new ArrayList<String>();



    }

    public static String ilkVeSonHarf(String str, int sayi) {
        String s = str.substring(0,1) + str.substring(str.length() - 1);
        String b = "";

        for (int i = 0; i <sayi;i++){
            b +=s;
        }

        return b;
    }
}
