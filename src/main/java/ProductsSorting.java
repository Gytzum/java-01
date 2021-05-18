import java.util.Objects;

//Isrusiuoti produktus pagal valid > qty > name;
public class ProductsSorting {

    public void main(String[] args) {

        Product obuoliai = new Product();
        Product bananai = new Product("bananai");
        Product apelsinai = new Product("apelsinai", 50);
        Product pomidorai = new Product("pomidorai", 100, true);
        Product kriauses = new Product("kriauses", 150, false);
        Product vysnios = new Product("vysnios", 500, true);
        Product arbuzai = new Product("pomidorai", 26, false);
        Product vynuoges = new Product("vynuoges", 2, true);
        Product mandarinai = new Product("mandarinai", 26, true);

    }
class Product {
    String name;
    double qty;
    boolean valid;


    Product(String name, int qty, boolean valid){
        this.name = name;
        this.qty = qty;
        this.valid = true;
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
}

