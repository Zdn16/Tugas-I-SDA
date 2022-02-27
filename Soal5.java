import java.util.ArrayList;
import java.util.List;

public class Soal5{
    
    //remove(0),remove(3),remove(2)

    public static void main(String[] args) {
       ArrayList<String> namaku = new ArrayList<String>(4);

        namaku.add("A");
        namaku.add("M");
        namaku.add("B");
        namaku.add("I");

        System.out.println(namaku.remove(0));
        System.out.println(namaku.remove(3));
        System.out.println(namaku.remove(2));
    }
}