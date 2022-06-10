package SoruBankasi.ArraysSoruBankasi;

import java.util.Arrays;
import java.util.Scanner;

public class Q12 {
//    12) Create an integer array by getting the elements from the user then print the difference
//    between the smallest and the greatest elements on the console.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the length of the array");
    int len = scanner.nextInt();
    int[] arr = new int[len];
    int smallest = 0 ;
    int greatest = 0;
    for (int i = 0; i < len; i++) {
        System.out.print(i + ". degeri giriniz: ");
        arr[i] = scanner.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr);
    smallest = arr[0];
    greatest = arr[arr.length-1];
    System.out.println(greatest - smallest);
}

}
