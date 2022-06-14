package SoruBankasi.List;

import java.util.ArrayList;
import java.util.List;

public class Q09 {
//    9) Find the sum of all prices given in a String list
//    Example: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
public static void main(String[] args) {
    List<String> h = new ArrayList<String>(List.of("$12.99","$23.60","$54.45"));
    double sum = 0;
    for (String w : h){
    Double price = Double.valueOf(w.replace("$",""));
    sum = sum + price;
    }
    System.out.println(sum);
}
}
