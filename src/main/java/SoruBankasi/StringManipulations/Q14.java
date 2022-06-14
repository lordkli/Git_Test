package SoruBankasi.StringManipulations;

public class Q14 {
//    14) Type code to check if a String has a specific single character or not in three different ways
public static void main(String[] args) {
    String a = "Java";
    Boolean result1 = a.contains("a");
    System.out.println(result1);


    Boolean result2 = a.replaceAll( "[^v]","").length()>0;
    System.out.println(result2);


    Boolean result3 = a.indexOf("v") != -1;
    System.out.println(result3);


}
}
