package SoruBankasi.StringManipulations;

public class Q08 {
//    8) Create a String variable and print all characters except the last character on the console in
//    uppercases.
//    Example:If the String is ‘Java’ you should print ‘JAV’ on the console.
public static void main(String[] args) {
    String a = "Javaasead";
    int b = a.length()-1;
    String newA = a.substring(0,b).toUpperCase();
    System.out.println(newA);

}
}
