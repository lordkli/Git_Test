package SoruBankasi.StringManipulations;

public class Q12 {
//    12) Type code to check if a String has an uppercase initial and dot at the end.
//            Example: For ‘Ali’ your code should print false on the console
//    For ‘ali.’ your code should print false on the console
//    For ‘ Ali. ’ your code should print false on the console
//    For ‘Ali.’ your code should print true on the console
//    For ‘ALI.’ your code should print true on the console
public static void main(String[] args) {
    String a = "Ali.";
    Boolean check1 = a.charAt(0)>= 'A' && a.charAt(0) <= 'Z';
    Boolean check2 = a.charAt(a.length()-1) == '.' ;
    Boolean check3 = check1&&check2;
    System.out.println(check3);

}
}
