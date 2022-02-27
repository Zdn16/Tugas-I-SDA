import java.util.ArrayList;
import java.util.List;

public class Soal3{

    public static void main(String[] args) {
        
        ArrayList<String> namaku = new ArrayList<String>(4);

        //get(0),get(2),get(6),get(-3)

        namaku.add("A");
        namaku.add("M");
        namaku.add("B");
        namaku.add("I");
        
        System.out.println(namaku.get(0));
        System.out.println(namaku.get(2));
        System.out.println(namaku.get(6));
        System.out.println(namaku.get(-3));
    }
}