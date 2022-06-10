package SoruBankasi.ArraysSoruBankasi;

public class Q06 {
   // 6) Count how many words start with 'a' or 'A' in a given String
   public static void main(String[] args) {
       String s = "Apex is an object oriented programming language";
       String [] arr = s.split(" ");
       String sum = "";

       for (String w : arr){
           if (w.startsWith("a") || w.startsWith("A")){
               sum +=w;
               sum += " ";
           }
       }
       System.out.println(sum + " ");
   }
}
