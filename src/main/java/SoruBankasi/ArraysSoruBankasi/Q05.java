package SoruBankasi.ArraysSoruBankasi;

public class Q05 {
//    Find the total number of characters used in String array elements
//    Example: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Output is 26
    public static void main(String[] args) {
        String[] a = { "Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int sum = 0;
        for(String w : a){
            sum += w.length();

        }
        System.out.println(sum);

    }
}
