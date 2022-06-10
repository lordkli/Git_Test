package Array;

import java.util.Arrays;

public class Array21 {
    public static void main(String[] args) {
        String str = "ade1r4d35";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i].charAt(0))) {
                toplam += Integer.valueOf(arr[i]);

            }
        }
        System.out.println(toplam);


    }
}
