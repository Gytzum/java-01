package lt.bit.p0607;

import lt.bit.p0607.Uzdavinys.Zmogus;

import java.util.*;

public class SetaiDemo {
    public static void main(String[] args) {
        Zmogus z1 = new Zmogus("A1","B1", "ak1");
        Zmogus z2 = new Zmogus("A2","B2", "ak2");
        Zmogus z3 = new Zmogus("A3","B3", "ak3");
        Zmogus z4 = new Zmogus("A4","B4", "ak4");
        Zmogus z31 = new Zmogus("A31","B31", "ak3");

        Collection<Zmogus> zmones = new HashSet<>();

        zmones.add(z1);
        zmones.add(z2);
        zmones.add(z3);
        zmones.add(z4);
        zmones.add(z31);
        zmones.add(z1);

        zmones.add(z3);
        zmones.add(z1);
        zmones.add(new Zmogus("A1","B1", "ak1"));


//        System.out.println("size = " + zmones.size());
        Zmogus z = new Zmogus("A1","B1", "ak1");
        System.out.println(z.equals(z1));
        System.out.println(z1.hashCode());
        System.out.println(z.hashCode());

    }
}

class MultiMap<K, V> extends HashMap<K, Set<V>> {

}

