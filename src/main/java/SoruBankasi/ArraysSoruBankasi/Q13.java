package SoruBankasi.ArraysSoruBankasi;

import java.util.Arrays;
import java.util.Scanner;

public class Q13 {
//    13) Ask the user to enter 2 Strings. If the characters and the numbers of characters of the
//    Strings are the same then print "Anagram" on the console. Otherwise, print "Not Anagram"
//    on the console. Ignore cases. For example; "Mary" and "army" and "RAMY" are Anagrams.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1. string: ");
    String str1 = scanner.nextLine();
    System.out.println("2. string: ");
    String str2 = scanner.nextLine();

    String [] arr1 = str1.toLowerCase().split("");
    Arrays.sort(arr1);
    String [] arr2 = str2.toLowerCase().split("");
    Arrays.sort(arr2);
    if (Arrays.equals(arr1,arr2)){
        System.out.println("Anagram");
    }
    else System.out.println("Not Anagram");



}
}
