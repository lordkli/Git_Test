package Array;

import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {
        int arr [] = new int[8];
        Scanner scanner = new Scanner(System.in);
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1) + ". degeri giriniz ");
            arr[i] = scanner.nextInt();
            if (arr[i] % 3 == 0) {
                sayac++;
            }
        }
        System.out.println("3´e bölünen sayilarin toplami: " + sayac);


    }
}
