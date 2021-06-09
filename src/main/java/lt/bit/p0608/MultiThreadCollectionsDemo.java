package lt.bit.p0608;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MultiThreadCollectionsDemo {
    public static void main(String[] args) {
        List<Integer> listas = new ArrayList<>();
        MultiThreadCollectionsDemo obj = new MultiThreadCollectionsDemo();

//        obj.add(listas);
//        obj.add(listas);
//        obj.add(listas);
//        obj.add(listas);
//        obj.add(listas);
    List<Thread> threads = new ArrayList<>();
            for (int i = 0; i < 5 ; i ++)
                obj.add(listas);
        threads.forEach(thread ->{});
//        System.out.println(listas);
        System.out.println(listas.size());
    }

    void add (List<Integer> listas) {
        Random random = new Random();
        for(int i = 0; i< 100;i++)
            listas.add(random.nextInt());
    }
}
