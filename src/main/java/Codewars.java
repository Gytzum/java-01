import java.util.Arrays;
import java.util.Objects;

public class Codewars {

    public static void main(String[] args) {
        byte[] skaitmenys = new byte[100];  // main dalis
        int x = 152;
        for (int i = 0; i < skaitmenys.length; i++){
            int y = x % 10;
            skaitmenys[i] = (byte) y;
            x /=10;
        }

                //multiply dalis
            int a = 256;
            byte[] multiplySkaitmenys = new byte[100];
        for (int i = 0; i < multiplySkaitmenys.length; i++){
            int y = a % 10;
            multiplySkaitmenys[i] = (byte) y;
            a /=10;
        }
            // masyvu sudauginimas
        byte[] arrMultiply = new byte[100];
        byte likutis = 0;
        boolean b = true;
        for (int i = 0; i < arrMultiply.length; i++) {
            arrMultiply[i]= (byte) (skaitmenys[i] * multiplySkaitmenys[i]);
            b = arrMultiply[i] > 10;
            System.out.println(b);
        }


        System.out.println(Arrays.toString(arrMultiply));
//        if(skaitmenys[i] % myltiplySkaitmenys[i] >0) {
//            byte likutis = (byte) (skaitmenys[i] % myltiplySkaitmenys[i]);
//            arrMultiply[i] = (byte) (skaitmenys[i+1] + likutis);
//        } else {
//            arrMultiply[i]= (byte) (skaitmenys[i] * myltiplySkaitmenys[i]);}

    }
}
