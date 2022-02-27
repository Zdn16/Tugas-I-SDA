import java.util.ArrayList;
import java.util.List;

public class Soal4{

    public static void main(String[] args) {
        
        //indexOf(a),indexOf(c),indexOf(q)

        ArrayList<String> namaku = new ArrayList<String>(4);

        namaku.add("A");
        namaku.add("M");
        namaku.add("B");
        namaku.add("I");

        System.out.println(namaku.indexOf("a"));
        System.out.println(namaku.indexOf("c"));
        System.out.println(namaku.indexOf("q"));
    }
}