import java.util.ArrayList;
import java.util.List;

public class Soal6{

    //add(0,e),add(2,f),add(3,g),add(4,h),add(6,h),add(-3,j),

    public static void main(String[] args) {
        ArrayList<String> namaku = new ArrayList<String>();

        namaku.add("A");
        namaku.add("M");
        namaku.add("B");
        namaku.add("I");

        System.out.println("before operation: " + namaku);
        namaku.add(0,"e");
        System.out.println("after char was added" + namaku);
        namaku.add(2,"f");
        System.out.println("after char was added" + namaku);
        namaku.add(3,"g");
        System.out.println("after char was added" + namaku);
        namaku.add(4,"h");
        System.out.println("after char was added" + namaku);
        namaku.add(6,"h");
        System.out.println("after char was added" + namaku);
        namaku.add(-3,"j");
        System.out.println("after char was added" + namaku);
    }
}