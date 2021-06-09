package lt.bit.test.p0602;

import lt.bit.p0602.StringArrayList;
import lt.bit.p0602.StringList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringArrayListTest {

    @Test
    void test(){
        StringList listas = new StringArrayList();

        listas.add("Kuku");
        listas.add("Cho-cho");
        listas.add("abc");
        listas.add(1, "ha-ha-ha");

        assertEquals(4, listas.size());

        listas.remove(0);

        listas.remove(2);

        assertEquals(2, listas.size());

        assertEquals("Cho-cho", listas.get(1));
        assertEquals("ha-ha-ha", listas.get(0));

        listas.remove(1);
        assertEquals(1, listas.size());
        assertEquals("Cho-cho", listas.get(0));


    }
}
