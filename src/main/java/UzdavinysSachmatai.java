
import java.math.BigInteger;
import java.util.Arrays;

public class UzdavinysSachmatai {

    public static void main(String[] args) {
        for (int i = 1; i <= 1; i++) { //i<= 64
            System.out.println(i + " " + suma3(i));

        }
           ManoDidelisSkaicius a =  new ManoDidelisSkaicius(157);
    }

    public static ManoDidelisSkaicius suma3(long x) {
        ManoDidelisSkaicius number = new ManoDidelisSkaicius(1);
        ManoDidelisSkaicius langelis = new ManoDidelisSkaicius(2); // turi but 1 bet test su 2
        for (int i = 2; i <= x; i++) {
            langelis.multiply(2); // langelis * 2
//            number.add(langelis);
        }
//
        return langelis; // return number
    }
}

// int x = 123234;
// String y = "" + x; // "123234"
// char[] x = y.toCharArray() // ['1','2','3',...]
// 0 1 2 3 4 5 6 7 8 9

// int x = 123234;
// int y = x % 10; // 4
// int z = x / 10; // 12323

class ManoDidelisSkaicius {

    private byte[] skaitmenys = new byte[100];

    public ManoDidelisSkaicius(int x) {

        for (int i = 0; i < skaitmenys.length; i++){
            int y = x % 10;
            skaitmenys[i] = (byte) y;
            x /=10;
        }
        System.out.println( Arrays.toString(skaitmenys));
    }

    public void multiply(int y) {
        var result = 0;
        for (int i = skaitmenys.length; i > 0;i--){
            if(skaitmenys[i] % y >0){
                var likutis = skaitmenys[i] % y;
                var likutisSum = skaitmenys[i-1] + likutis;
            } else {result = skaitmenys[i] * y;}
        }
//        System.out.println(Arrays.toString(result));
    }

    public void add(int x) {
        var result = 0;
        for (int i = skaitmenys.length; i > 0;i--){
            if(skaitmenys[i] +x > 0){
                var likutis = (skaitmenys[i] + x) % 10 ;
                var likutisSum = skaitmenys[i-1] + likutis;
            } else {result = skaitmenys[i] + x;}
        }
        System.out.println(result);
    }

}