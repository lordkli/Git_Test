package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array12 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Listin uzunlugunu giriniz : ");
//        int listUzunlugunu = scanner.nextInt();
//
//        List<Integer> list = new ArrayList<Integer>();
//        System.out.println("Girdiginiz list uzunlugu kadar sayi giriniz");
//        List<Integer> listIc = new ArrayList<Integer>();
//
//        for (int i = 0; i < listUzunlugunu; i++){
//            list.add(scanner.nextInt());
//            for (int j = 0; j < listIc.get(i); j++){
//
//            }
//        }
//        System.out.println(list);
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Listin uzunlugunu giriniz : ");
        int listUzunluk = scanner.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        System.out.println("girdiginiz list uzunlugu kadar sayi giriniz : ");

        for (int i = 0; i < listUzunluk; i++){
            list.add(scanner.nextInt());

        }
        tekrarliEleman(list);
    }

    private static void tekrarliEleman(List<Integer> list) {
        List <Integer> tekrarliList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++){
            for (int j = i+1;j<list.size();j++){
                if (list.get(i) == list.get(j) && !tekrarliList.contains(list.get(i))) {
                    tekrarliList.add(list.get(i));

                }
            }
        }
        System.out.println("Tekrar edenler " + tekrarliList);
    }


}
