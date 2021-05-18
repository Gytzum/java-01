import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
public class AntrasTest {

    @Test
     void testPositive(){
        assertEquals(16.0, Antras.apvalinti(15.545678, 0), 0.1);
        assertEquals(15.5, Antras.apvalinti(15.545678, 1),0.05);
        assertEquals(15.55, Antras.apvalinti(15.545678, 2),0.005);
        assertEquals(15.546, Antras.apvalinti(15.545678, 3),0.0005);

    }
    @Test
    void testNegative(){
        assertEquals(20.0, Antras.apvalinti(15.545678, -1),1);
        assertEquals(0.0, Antras.apvalinti(15.545678, -2),0.1);
    }
}
