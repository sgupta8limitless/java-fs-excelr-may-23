import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {


        ProductController productController=new ProductController();

//        productController.create();

//        productController.delete();

        productController.getAll();


    }
}