package text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text {

    public static void main(String[] args) {



        List<String> list = new ArrayList<>();

        list.add("HEllo");
        list.add("Ez bizony egy hosszu szoveg lenne, de nem bizti hogy jo");


        System.out.println(Arrays.asList(list));

    }


    public static void setList(List<String> list) {
        for (String actual : list) {
            if (actual.length() < 25) {
                System.out.println("Ez egy rövid szöveg.");
            } else {
                System.out.println("Ez egy hosszú szöveg, aminek a hossza több mint 25 karakter.");
            }
        }

    }
}
