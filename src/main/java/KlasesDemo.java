public class KlasesDemo {

    public static void main(String[] args) {
        Man jonas = new Man("Jonas", "Jonaitis");
//        jonas.firstName = "Jonas";
//        jonas.lastName = "Jonaitis";

        System.out.println(jonas.firstName + " " + jonas.lastName);

        Man jonas2 = jonas;
        jonas2.firstName = "Jonas 2";
        System.out.println(jonas.firstName + " " + jonas.lastName);

        Product p1 = new Product();
        System.out.println(p1.name + " " + p1.qty + " " + p1.valid );

        Man Ona = new Man();
        Man Ona1 = new Man("Ona");
    }
}

class Man {
    String firstName;
    String lastName;
    Man (){

    }
    Man (String name) {   //gali tureti  keleta, java zinos kuri naudoti
        firstName = name; //pagal nurodytus duomenis kuriant nauja objekta
    }

    Man(String firstName, String lastName) {
        this.firstName = firstName;  //this reiskia lokalus kintamasis,
        this.lastName = lastName; // nebutinas jei reiksmes skirtingos.
    }
}

class Products1 {
    String name;
    double qty;
    boolean valid;

    Products1(){
        this.name = "bananai";
        this.valid = true;
    }


}

