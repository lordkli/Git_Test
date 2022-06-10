import java.util.ArrayList;
import java.util.List;

public class sdsa {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List<String> asd = new ArrayList<String>();
        asd.add("asdasd");
        asd.add("fefefe");
        list.addAll(asd);

        for(String a:list) {
            System.out.print(a);
        }
    }
}
