package SoruBankasi.StringManipulations;

public class Q11 {
//    11) Type code to check if a String does not have any space character at the beginning and at
//    the end?
//    Example: For β Ali β your code should print false on the console
//    For βAliβ your code should print true on the console
public static void main(String[] args) {
    String a = " Ali ";
    String b = a.trim();
    Boolean c = a.equals(b);
    System.out.println(c);

}

}
