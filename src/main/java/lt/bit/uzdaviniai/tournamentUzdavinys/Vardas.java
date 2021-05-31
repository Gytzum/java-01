package lt.bit.uzdaviniai.tournamentUzdavinys;

public interface Vardas {

    String vardas();
    default String game() {
        return vardas();
    }
    static  String version(){
        return "v0.1";
    }

}