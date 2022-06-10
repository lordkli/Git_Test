package Array;

public class Array07 {
   /* public static void main(String[] args) {
        String str = "HeySiri";
        str = str.replace("Hey","Bye");
        System.out.println(str);
    }*/

    public static void main(String[] args) {
        String str = "HeySiri";
        String yeniStr [] = str.split("y");
        yeniStr [0] = "Bye";
        str = yeniStr[0] + yeniStr[1];
        System.out.println(str);
    }

}
