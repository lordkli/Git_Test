package Array;

public class Array17Takvim {
    public static void main(String[] args) {
        int tageImMonat [] = {31, 28, 31, 30, 31, 30,
                              31, 31, 30, 31, 30, 31  }   ;
        int dattag = 13, datmonat =2;

        int tage = 0;
        for (int i = 0; i < datmonat-1; i++){
            tage += tageImMonat[i];
        }
        tage += dattag;
        System.out.println(tage);

    }
}
