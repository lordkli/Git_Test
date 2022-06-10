package SoruBankasi.ArraysSoruBankasi;

public class Q10 {
    //    Type code to find sum of the number of characters of array elements
    public static void main(String[] args) {
        String a = "alabam apick sos sets pex";
        String [] arr = a.split(" ");
        int sum = 0;
        for (String w : arr){
            sum += w.length();
        }
        System.out.println(sum);
    }
}
