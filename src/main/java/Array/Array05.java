package Array;

public class Array05 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7};
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        double ortalama = toplam/arr.length;
        System.out.println("Ortalama = " + ortalama);
        System.out.println("Ortalamadan büyük olan elemanlar : ");
        for (int i = 0; i < arr.length; i++) {
            if (ortalama < arr[i]) {
                System.out.print(arr[i] + " ");
            }
        }
    }

}
