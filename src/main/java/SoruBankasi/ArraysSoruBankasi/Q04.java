package SoruBankasi.ArraysSoruBankasi;

public class Q04 {
//    4) Get the initials of the elements in a String array, if the String ends with 'n' or 'k'
//    Example: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Output is JJM
public static void main(String[] args) {
    String [] a = {"Kemal", "Jonathan", "Mark" , "Jackson" , "Ali"};
    String sum = "";
    for (String w : a) {
        if (w.endsWith("n") || w.endsWith("l")){
            sum +=w.toUpperCase().charAt(0);
        }
    }
    System.out.println(sum);

}


}

