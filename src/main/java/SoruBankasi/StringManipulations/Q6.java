package SoruBankasi.StringManipulations;

public class Q6 {
//    6) Create a String variable and find the sum of the ASCII values of the first and the last
//    characters of the String.

    public static void main(String[] args) {
        String a = "asdasda";
        int asciiIlkHarf = a.charAt(0);
        int asciiSonHarf = a.charAt(a.length()-1);
        int sum = asciiIlkHarf + asciiSonHarf;
        System.out.println(sum);
    }

}
