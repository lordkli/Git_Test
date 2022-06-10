package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array25 {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,4,4,3,3,2,1,0,77};
        List<Integer> tekrarsizList = new ArrayList<Integer>();
        for (Integer s:arr){
            if (!tekrarsizList.contains(s)){
                    tekrarsizList.add(s);
            }
        }
        Collections.sort(tekrarsizList);
        int tekrarsizArray[] = new int[tekrarsizList.size()];
        for (int i = 0; i < tekrarsizList.size(); i++){
            tekrarsizArray[i]= tekrarsizList.get(i);
        }
        System.out.println(Arrays.toString(tekrarsizArray));
    }
}
