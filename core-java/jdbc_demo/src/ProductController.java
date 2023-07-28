import java.util.ArrayList;
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

        boolean status=productGateway.insert(product);

        if(status==true)
        {
            System.out.println("Product Inserted");
        }
        else
        {
            System.out.println("Some Problem");
        }

    }

    public void deleteProduct()
    {

        ArrayList<Product> products=productGateway.index();

        this.displayProducts(products);

        System.out.println("Choose an option");
        int n=scanner.nextInt();

        Product product=products.get(n-1);

        boolean status=productGateway.delete(product.getId());

        if(status==true)
        {
        System.out.println("Product Deleted");
        }
        else
        {
        System.out.println("Some Problem");
        }


    }


    public void updateProduct()
    {
        ArrayList<Product> products=productGateway.index();

        this.displayProducts(products);

        System.out.println("Choose a product to update");
        int n=scanner.nextInt();

        Product product=products.get(n-1);



        System.out.println(product.getName()+" "+product.getPrice()+" "+product.getCategory()+" "+product.getQuantity());

        int option;



        do {


            System.out.println("1.Name");
            System.out.println("2.Price");
            System.out.println("3.Category");
            System.out.println("4.Quantity");
            System.out.println("Choose the column to update");
            int cn = scanner.nextInt();

            switch (cn) {
                case 1: {
                    System.out.println("Enter New Name");
                    String newname = scanner.nextLine();
                    product.setName(newname);
                    break;
                }
                case 2: {
                    System.out.println("Enter New Price");
                    int newprice = scanner.nextInt();
                    product.setPrice(newprice);
                    break;
                }

                case 3: {
                    System.out.println("Enter New Category");
                    String newcategory = scanner.nextLine();
                    product.setCategory(newcategory);
                    break;
                }
                case 4: {
                    System.out.println("Enter New Quantity");
                    int newquantity = scanner.nextInt();
                    product.setQuantity(newquantity);
                    break;
                }
            }


            System.out.println(product.getName() + " " + product.getPrice() + " " + product.getCategory() + " " + product.getQuantity());

            System.out.println("Continue updating columns - 1 / final Update - 2");
            option=scanner.nextInt();
        }
        while (option==1);


        boolean status= productGateway.update(product);


        if(status==true)
        {
            System.out.println("Product Updated");
        }
        else
        {
            System.out.println("Some Problem");
        }



    }



    public void getAllProducts()
    {

        ArrayList<Product> products = productGateway.index();
        this.displayProducts(products);



    }

    public void displayProducts(ArrayList<Product> products)
    {
        int srno=1;

        for(Product product : products)
        {
            System.out.println(srno+" "+product.getName()+" "+product.getPrice());
            srno++;
        }
    }




}
