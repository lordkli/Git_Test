package SoruBankasi.StringManipulations;

public class Q10 {
//    10) Type code to check if a String has just a single space character any position in the middle
//    Example: For ‘Ali Can’ your code should print false on the console
//    For ‘ Ali Can ’ your code should print false on the console
//    For ‘ Ali Can ’ your code should print false on the console
//    For ‘Ali Can’ your code should print true on the console
public static void main(String[] args) {
    String a = " asdasdasd asdasdasd  ASDASDASD asdasd";
    int counter = 0 ;
    String b = a.trim();
    String c = b.replaceAll("\\S","");
    Boolean isThereSingleSpaceInTheMiddle = c.length() == 1;
    System.out.println(("There is a space in the middle: " + isThereSingleSpaceInTheMiddle));



}
}
