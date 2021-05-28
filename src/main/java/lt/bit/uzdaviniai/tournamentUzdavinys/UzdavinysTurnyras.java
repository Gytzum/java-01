package lt.bit.uzdaviniai.tournamentUzdavinys;

import java.util.Arrays;

public class UzdavinysTurnyras {

    public static void main(String[] args) {

        Mokinys[] mokiniai = sukurtiMokinius();

        int ratoNr = 1;
        Pora[] poros = pirmasRatas(mokiniai);
        spausdinti(ratoNr, poros);
//        Pora[] pora= ratas(poros);
        //TODO

    }

    private static void spausdinti(int ratoNr, Pora[] poros) {
        // 1 ratas
        System.out.println(ratoNr + " ratas:");
        for (Pora pora : poros) {
            System.out.println(pora.game());
        }

//         rest ratai
//        ratas(poros);
        System.out.println(++ratoNr + " ratas:");
        for (int i = 0; i < poros.length;i+=2){
            System.out.println(poros[i].vardas() + " - " + poros[i+1].vardas());
        }

    }


    public static Mokinys[] sukurtiMokinius() {
        return new Mokinys[] {
                new Mokinys("V1", "P1"),
                new Mokinys("V2", "P2"),
                new Mokinys("V3", "P3"),
                new Mokinys("V4", "P4"),
                new Mokinys("V5", "P5"),
                new Mokinys("V6", "P6"),
                new Mokinys("V7", "P7"),
                new Mokinys("V8", "P8"),
                new Mokinys("V9", "P9"),
                new Mokinys("V10", "P10"),
                new Mokinys("V11", "P11"),
                new Mokinys("V12", "P12"),
                new Mokinys("V13", "P13"),
                new Mokinys("V14", "P14"),
                new Mokinys("V15", "P15"),
                new Mokinys("V16", "P16")
        };
    }

    public static Pora[] pirmasRatas(Mokinys[] mokiniai) {
                Pora[] poros = new Pora[mokiniai.length/2];
                int index =0;
                for(int i=0;i< mokiniai.length;i+=2 )
                    poros[index++] = new Pora(mokiniai[i], mokiniai[i+1]);
                return poros;
    }

//    public static Pora[] ratas(Pora[] poros) {
//        int index = 0;
//        int ratoNr = 2;
//        ratoNr++;
//        for (int i = 0;i< poros.length/2;i+=2){
//            poros[i].vardas();
//            poros[index++] = new Pora(poros[i], poros[i+1]);
//        }
//        return poros;
//    }

}
