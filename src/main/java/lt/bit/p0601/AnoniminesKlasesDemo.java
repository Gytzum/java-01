package lt.bit.p0601;

import java.util.Arrays;

public class AnoniminesKlasesDemo {

    public static void main(String[] args) {

        int[] numbers = {2,5,6,3,8,-5};
        System.out.println("Pradines reiksmes: " + Arrays.toString(numbers));

        dvigubinti(numbers, 2);

        System.out.println("Padvigubintas: " + Arrays.toString(numbers));

        dvigubinti(numbers,2);
        dvigubinti(numbers,2);
        System.out.println("Padvigubintas 2x: " + Arrays.toString(numbers));

        prideti(numbers, -10);
        System.out.println("Prideti -10: " + Arrays.toString(numbers));

        dauginti(numbers, 3);
        System.out.println("Dauginame is *3: " + Arrays.toString(numbers));

        dalinti(numbers, 2 );
        System.out.println("Daliname is 2: " + Arrays.toString(numbers));

        sudetingasVeiksmas (numbers);

        sudetingasVeiksmas(numbers, new SudetingasVeiksmas());
        System.out.println("Dauginame is *10: " + Arrays.toString(numbers));
        sudetingasVeiksmas(numbers, new SudetingasVeiksmasKitas());
        System.out.println("Prideti 10: " + Arrays.toString(numbers));


        class KazkoksVeiksmas implements Function{
            @Override
            public int apply(int x) {
                return x*x/100000;
            }
        }
        sudetingasVeiksmas(numbers, new KazkoksVeiksmas());
        System.out.println("x*x/100000: " + Arrays.toString(numbers));

        Function f = new SudetingasVeiksmas();

        f = new Function() {
            @Override
            public int apply(int x) {
                return 0;
            }
        };
        System.out.println(f.getClass().getName());

        f = new SudetingasVeiksmas(){ };
        System.out.println(f.getClass().getName());
    }

    private static void sudetingasVeiksmas(int[] numbers) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = sudetingoVeiksmoFunkcija(numbers[i]);
        }
    }

    private static int sudetingoVeiksmoFunkcija(int number) {
        return (number*3-10)- number;
    }

    private static void dalinti(int[] numbers, int x) {
        for(int i = 0;i< numbers.length;i++)
            numbers[i] /= x;
    }

    private static void dauginti(int[] numbers, int x) {
        for(int i = 0;i< numbers.length;i++)
            numbers[i] *= x;
    }

    private static void prideti(int[] numbers, int x) {
        for(int i = 0;i< numbers.length;i++)
            numbers[i] += x;
    }

    private static void dvigubinti(int[] numbers, int x){
        for(int i = 0;i< numbers.length;i++)
            numbers[i] *= x;
    }

    private static void sudetingasVeiksmas(int[] numbers, Function op){
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = op.apply(numbers[i]);
        }
    }

}

interface Function {
    int apply(int x);
}

class SudetingasVeiksmas implements Function{

    @Override
    public int apply(int x) {
        return x*10;
    }
}

class SudetingasVeiksmasKitas implements Function{

    @Override
    public int apply(int x) {
        return x+10;
    }
}