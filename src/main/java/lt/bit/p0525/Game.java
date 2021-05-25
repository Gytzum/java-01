package lt.bit.p0525;

import java.time.LocalDate;

public class Game {
    public static void main(String[] args) {

        Stone stone = new Stone("Puntukas");
        Lake lake = new Lake("Tauragno ez.");
        Man peasant = new Man ("Peasant", 1);
        Man king = new Man ("Adam IV", 99);
        Man queen = new Man ("Victoria",99);

        printAllTitles(stone,lake,peasant,king,queen);

        Object[] o = new Object[] {
                stone,queen,"kuku",123,false,3.14,"A",null
        };

        System.out.println(countThings(o));
        System.out.println("Viso daiktu -- > "+ countThings(o));
    }

    static void printAllTitles (Thing... things) {
        for(Thing thing : things){
            System.out.println(thing.getTitle());
        }
    }
    static int countThings(Object... objects ){
        System.out.println("***Counting things -- > ");
        int counter = 0;
        for (Object obj: objects){
            System.out.println(obj);
            if(obj instanceof Thing){
            counter++;}
        }
        return counter;
    }
}
