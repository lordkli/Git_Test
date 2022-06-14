package SoruBankasi.StringManipulations;

public class Q13 {
//    13) Type code to check if a password is valid or not for the following conditions;
//    Password must have at least 8 characters different from space character
//    Password must have at least 1 symbol
//    Example: For ‘A2b!’ your code should print false on the console
//    For ‘A2b3cdef’ your code should print false on the console
//    For ‘!1a23b4’ your code should print false on the console
//    For ‘!1a23b4?es’ your code should print true on the console
//    For ‘! a b 3 k’ your code should print false on the console
public static void main(String[] args) {
    String a = "sASDAS ASDASDSA??";
    Boolean check1 = a.replaceAll("\\s","").length() >= 8;
    Boolean check2 = a.replaceAll("[A-Za-z0-9]","").replaceAll("\\s","").length() >0;

    System.out.println("result : " + (check1 && check2));

}
}
