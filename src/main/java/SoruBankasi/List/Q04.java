package SoruBankasi.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q04 {
//    4) Check if elements are in descending order in a list
//    Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
//            (Yellow, Red, Green, Blue) ==> Output: It is in descending order
public static void main(String[] args) {
    List<String> list = new ArrayList<>(List.of("Yellow","Red", "Green", "Blue"));
    List<String> list1 = new ArrayList<>(List.of("Red", "Green", "Blue","Yellow"));
    List<String> list2 = new ArrayList<>(List.of("Yellow","Red", "Green", "Blue"));
    if (list.equals(list1)) {
        System.out.println("It is in descending order");
    }
    else {
        System.out.println("It is not in descending order");
    }
}
}
