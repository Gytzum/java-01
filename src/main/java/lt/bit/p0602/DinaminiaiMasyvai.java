package lt.bit.p0602;

import java.util.Arrays;

public class DinaminiaiMasyvai {
    public static void main(String[] args) {
        String[] zodziai = new String[100];

        StringList listas = new StringArrayList();
        listas.add("Kuku");
        listas.add("Cho-cho");
        listas.add("ha-ha-ha");
        listas.remove(0);
        System.out.println(listas.size());
        System.out.println(listas.get(0));
    }
}
