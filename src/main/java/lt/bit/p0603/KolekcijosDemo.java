package lt.bit.p0603;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class KolekcijosDemo {
    public static void main(String[] args) {

        List<String> listas = new ArrayList<>(1000);
        List<String> listas2 = new LinkedList<>();

        listas.add("Abc 0");
        listas.add(0,"Abc 1");
        System.out.println(listas.size());
        System.out.println(listas);
        listas.remove("Abc 0");
        listas.add("Abc 0");
        listas.add("Abc 0");
        listas.remove("Abc 0");

        System.out.println(listas);
        System.out.println("--for each loop------------");
        for (String s : listas) {
            System.out.println(s);
        }
        System.out.println("-for each--------------");
        listas.forEach(s-> System.out.println(s));
    }
}
