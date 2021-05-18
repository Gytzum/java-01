import java.util.Arrays;

//Isrusiuoti produktus pagal valid > qty > name;
public class ProductsSorting {

    public static void main(String[] args) {

        Product obuoliai = new Product();
        Product bananai = new Product("bananai");
        Product apelsinai = new Product("apelsinai", 50);
        Product pomidorai = new Product("pomidorai", 100, false);
        Product kriauses = new Product("kriauses", 150, true);
        Product vysnios = new Product("vysnios", 500, false);
        Product arbuzai = new Product("arbuzai", 26, true);
        Product vynuoges = new Product("vynuoges", 2, true);
        Product mandarinai = new Product("mandarinai", 26, true);
        Product braskes = new Product("braskes", 312, true);

        Product[] prekes = {obuoliai, bananai, apelsinai, pomidorai
                , kriauses, vysnios, arbuzai, vynuoges, mandarinai, braskes};

        sortByValid(prekes);
        sortByQty(prekes);
//        sortByName(prekes);

    }

    public static void sortByValid(Product[] prekes) {
        for (int i = 1; i < prekes.length; i++) {
            Product current = prekes[i];
            int j = i - 1;
            int first = current.valid ? 1 : 0;
            int second = prekes[j].valid ? 1 : 0;
            while (j >= 0 && first > second) {
                prekes[j + 1] = prekes[j];
                j--;
            }
            prekes[j + 1] = current;

        }
        for (int i = 0; i < prekes.length; i++)
            System.out.println(prekes[i].name + "--> "+ prekes[i].valid);
    }

    public static void sortByQty(Product[] prekes) {
        for (int i = 1; i < prekes.length; i++) {
            Product current = prekes[i];
            int j = i - 1;
            while (j >= 0 && current.qty > prekes[j].qty) {
                prekes[j + 1] = prekes[j];
                j--;
            }
            prekes[j + 1] = current;
        }
        for (int i = 0; i < prekes.length; i++)
            System.out.println(prekes[i].name + "--> "+ prekes[i].qty);
    }

//    public static void sortByName(Product[] prekes) {
//        Product temp;
//        for(int i = 0; i<prekes.length-1; i++) {
//            for (int j = i+1; j<prekes.length-i; j++) {
//                if(prekes[i].name.compareTo(prekes[j].name)>0) {
//                     temp = prekes[i];
//                    prekes[i] = prekes[j];
//                    prekes[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < prekes.length; i++) {
//            System.out.println(prekes[i].name);
//        }
//    }

}
class Product {
    String name ;
    double qty ;
    boolean valid = false;


    Product(String name, int qty, boolean valid){
        this.name = name;
        this.qty = qty;
        this.valid = valid;
    }
    Product(String name, int qty){
        this.name = name;
        this.qty = qty;
    }
    Product(String name){
        this.name = name;
    }
    Product(){
    }
    boolean sortByValid(){
        this.valid = valid;

        return valid;
    }

}


