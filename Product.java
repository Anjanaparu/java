class Product {
    int pcode;
    String pname;
    double price;

    Product(int c, String n, double p) {
        pcode = c;
        pname = n;
        price = p;
    }

    void display() {
        System.out.println(pcode + "\t\t" + pname + "\t\t" + price);
    }

    static void findLowest(Product p1, Product p2, Product p3) {
        Product lowest = p1;

        if (p2.price < lowest.price) {
            lowest = p2;
        }
        if (p3.price < lowest.price) {
            lowest = p3;
        }

        System.out.println("\nLowest Priced Product:");
        lowest.display();
    }
}

public class ProductDemo {
    public static void main(String[] args) {

        Product obj1 = new Product(101, "Product_1", 100.0);
        Product obj2 = new Product(102, "Product_2", 128.40);
        Product obj3 = new Product(103, "Product_3", 790.00);

        System.out.println("Product Information");
        System.out.println("-----------------");
        System.out.println("Product_Code\tProduct_Name\tProduct_price");

        obj1.display();
        obj2.display();
        obj3.display();

        Product.findLowest(obj1, obj2, obj3);
    }
}
