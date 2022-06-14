package SoruBankasi.StringManipulations;

import java.util.Locale;

public class Q09 {
//    9) Create a String variable and print all characters except the first character and the last
////    character on the console in uppercases.
////    Example:If the String is ‘Java’ you should print ‘AV’ on the console.

    public static void main(String[] args) {
        String a = "Javasdada";

        String b = a.substring(1,a.length()-1).toUpperCase();
        System.out.println(b);
    }

}
