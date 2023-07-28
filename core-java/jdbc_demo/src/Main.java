import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {


        ProductController productController=new ProductController();
//        productController.createProduct();
//        productController.deleteProduct();

//        productController.getAllProducts();

        productController.updateProduct();

    }
}