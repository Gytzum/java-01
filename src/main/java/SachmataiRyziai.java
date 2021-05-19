import java.math.BigInteger;

public class SachmataiRyziai {
    public static void main(String[] args) {
        int a = 8;
        int b = 16;
        int c = 32;
        int d = 64;
        skaiciavimas(d);
    }

    public static void  skaiciavimas(int d) {
        BigInteger count = new BigInteger("1");
        for (int i =2; i<= d; i++){
                count = count.multiply(new BigInteger("2"));
                System.out.println(i + "-->" + count);
        }
        BigInteger total = count.multiply(new BigInteger("2")).add(new BigInteger("-1"));
        System.out.println("total = " + total);
    }
}

//        BigInteger a = new BigInteger("2");
//        BigInteger result = a.pow(d).add(BigInteger.valueOf(-1));
//        System.out.println(result);