package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir string giriniz: ");
        String string = scanner.nextLine();
        List<String> harfleAyir = new ArrayList<String>();

        String [] arr = string.split("");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int sayac = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1].equals(arr[i])) {
                sayac++;
            }
            else {
                System.out.println(arr[i-1] + " sayisi " + (sayac+1));
                sayac = 0;
            }
            if (i == arr.length - 1) {
                System.out.println(arr[i] + " sayisi " + (sayac+1));
            }



            }






    }


}
