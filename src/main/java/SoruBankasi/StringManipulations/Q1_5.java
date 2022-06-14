package SoruBankasi.StringManipulations;

public class Q1_5 {
    public static void practice15(String[] args) {
        byte a = Byte.valueOf("113");
        System.out.println(a+ 12);
    }

    public static void practice16(String[] args) {
        String cityName = "mIAMI";
        String cityNameUpdate = cityName.toLowerCase().trim();
        cityNameUpdate = cityNameUpdate.substring(0,1).toUpperCase() + cityNameUpdate.substring(1);
        System.out.println(cityNameUpdate);

    }

    public static void practice17(String[] args) {
        String a = "Ali Can";
        String b = " Merve Star ";
        String c = "    Mark Tom";
        Integer a1 = a.replaceAll(" ","").length();
        Integer b2 = b.replaceAll(" ","").length();
        Integer c3 = c.replaceAll(" ","").length();

        System.out.println("Total number of characters different from space: " + (a1 + b2 + c3));
    }

    public static void practice18(String[] args) {
        String a = " Miami 33018!!! ";
        a = a.replaceAll("\\W" , "");
        System.out.println(a.length());

    }

    public static void practice19(String[] args) {
        String a = "2a3B4?-!5";
        a = a.replaceAll("\\d","");
        System.out.println(a.length());
    }

    public static void main(String[] args) {
        String a = "  Ali Can  ";
        a = a.trim();
        System.out.println(a.charAt(a.length()-1));

    }
}
