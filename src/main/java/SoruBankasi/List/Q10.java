package SoruBankasi.List;

import java.util.ArrayList;
import java.util.List;


public class Q10 {
//    11) Check if all elements are unique in an integer List by using loops
public static void main(String[] args) {
   List<Integer> list = new ArrayList<Integer>(List.of(50,15,23,44,57,50,15));

   int counter = 0;
   for (Integer w : list){
       for (Integer k : list) {
           if (w == k){
               counter++;

           }
       }
   }
   if (counter == list.size()){
       System.out.println("There is no repeated element");

   }
   else System.out.println("At least one element was repeated");


}
}
