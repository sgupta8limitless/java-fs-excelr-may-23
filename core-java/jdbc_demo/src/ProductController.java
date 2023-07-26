import java.util.Scanner;

public class ProductController {

    private Scanner scanner=new Scanner(System.in);
    private ProductGateway productGateway=new ProductGateway();

    public void createProduct()
    {
        System.out.println("Enter name,price,category,quantity res");
        String name=scanner.nextLine();
        int price=scanner.nextInt();
        scanner.nextLine();
        String category=scanner.nextLine();
        int quantity=scanner.nextInt();


        Product product=new Product(name,price,category,quantity);

        boolean st=productGateway.insert(product);

        if(st==true)
        {
            System.out.println("Product Inserted");
        }
        else
        {
            System.out.println("Some Problem");
        }

    }


}
