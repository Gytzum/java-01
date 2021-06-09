package lt.bit.p0607.Uzdavinys;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Zmogus> map1 = new TreeMap<>();

        Zmogus z1 = new Zmogus("A1","B1", "ak1");
        Zmogus z2 = new Zmogus("A2","B2", "ak2");
        Zmogus z3 = new Zmogus("A3","B3", "ak3");
        Zmogus z4 = new Zmogus("A4","B4", "ak4");
        Zmogus z31 = new Zmogus("A31","B31", "ak3");


        map1.put(z1.getAk(), z1);
        map1.put(z4.getAk(), z4);
        map1.put(z2.getAk(), z2);
        map1.put(z3.getAk(), z3);
        map1.put(z31.getAk(), z31);


        Collection<Zmogus> zmones =  map1.values();
        for ( Zmogus z : zmones){
            System.out.println(z);
        }

        Set<String> akodai =  map1.keySet();
        for ( String ak : akodai){
            System.out.println(ak + ":" + map1.get(ak));
        }

    }
}
