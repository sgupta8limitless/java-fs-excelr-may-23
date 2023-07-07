import globals.Controller;
import product.ProductController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Controller productController=new ProductController();

        int option;

        do {
            System.out.println("1. Create Product");
            System.out.println("2. View All Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    productController.create();
                    break;
                }
                case 2: {
                    productController.show();
                    break;
                }
                case 3: {
                    productController.update();
                    break;
                }
                case 4: {
                    productController.delete();
                    break;
                }
            }

            System.out.println("Do you want to Continue 1-Yes/ Anything for no");
            option = scanner.nextInt();

        }
        while (option==1);


    }
}