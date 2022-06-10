package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Listin uzunlugunu giriniz : ");
        int listUzunlugunu = scanner.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Girdiginiz list uzunlugu kadar sayi giriniz");

        for (int i = 0; i < listUzunlugunu; i++){
            list.add(scanner.nextInt());
        }
        System.out.println(list);
    }

    }

