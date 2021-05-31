package lt.bit.uzdaviniai.tournamentUzdavinys;

public class UzdavinysTurnyras {

    public static void main(String[] args) {

        Vardas[] games = sukurtiMokinius();
        int ratoNr = 1;
//        spausdinti(0,games);

        while(games.length >= 2) {
            games = ratas(games);
            spausdinti(0, games);
            ratoNr++;
        }
    }

    private static void spausdinti(int ratoNr, Vardas[] poros) {
        System.out.println(ratoNr + " ratas:");
        for (Vardas pora : poros) {
            System.out.println(pora.game());
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
//                new Mokinys("V9", "P9"),
//                new Mokinys("V10", "P10"),
//                new Mokinys("V11", "P11"),
//                new Mokinys("V12", "P12"),
//                new Mokinys("V13", "P13"),
//                new Mokinys("V14", "P14"),
//                new Mokinys("V15", "P15"),
//                new Mokinys("V16", "P16")
        };
    }

    public static Pora[] ratas(Vardas[] poros) {
        Pora[] games = new Pora[poros.length/2];
            for (int i = 0; i < poros.length; i+=2 )
            games[i/2] = new Pora(poros[i], poros[i+1]);
        return games;
    }

}
