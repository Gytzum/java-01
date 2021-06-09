package lt.bit.p0608;

import java.util.Arrays;

public class PrintDemo {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for( int j = 1 ; j <= 5; j++){
//                System.out.print(i + " x " + j + " = "+ i*j + "\t");
                System.out.printf("  %2d x %d = %2d  ", i, j, i*j);
            }
            System.out.println();
        }
    }
}
