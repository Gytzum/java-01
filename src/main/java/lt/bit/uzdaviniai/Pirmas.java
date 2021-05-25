package lt.bit.uzdaviniai;

public class Pirmas {
    public static void main(String[] args) {
        int[] masyvas= {-10,0,2,9,-5};
        int number;
        for (int i = 0; i < masyvas.length; i++) {
            for (int j = i+1; j < masyvas.length; j++) {
                if(masyvas[i]< masyvas[j]){
                    number = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = number;
                }
            }
        }

    }

}
