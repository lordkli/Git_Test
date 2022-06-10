package SoruBankasi.ArraysSoruBankasi;

public class Q07 {
    //7) Find the number of vowels in a String
    public static void main(String[] args) {
        String a = "Apex is an object oriented programming language";
        String arr [] = a.toLowerCase().split("");
        int counter = 0;

        for (String w : arr){
            switch(w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }

        }
        System.out.println("The number of vowels is " + counter);
    }

}
