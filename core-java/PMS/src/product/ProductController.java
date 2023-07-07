package product;

import category.Category;
import globals.Controller;

import java.util.ArrayList;
import java.util.Scanner;


public class ProductController implements Controller {


    ArrayList<Product> products=new ArrayList();

    ArrayList<Category> categories=new ArrayList();

    Scanner scanner=new Scanner(System.in);

    public ProductController() {

        categories.add(new Category(1,"Clothing","Clothing Category"));
        categories.add(new Category(2,"Electronics","Electronics Category"));
        categories.add(new Category(3,"Sports","Sports Category"));







    }

    public void create()
    {
        System.out.println("Enter ID");
        int id=scanner.nextInt();
        System.out.println("Enter Name");
        String name=scanner.next();
        System.out.println("Enter Price");
        float price=scanner.nextFloat();
        System.out.println("Enter Brand");
        String brand=scanner.next();

        for(int i=0;i<categories.size();i++)
        {
            System.out.println(i+" "+categories.get(i).getName());
        }

        System.out.println("Select a Category by typing the index");

        int choiceIndex = scanner.nextInt();


        Category c = categories.get(choiceIndex);

        Product product=new Product(id,name,price,brand,c);

        products.add(product);


    }


    public void show()
    {
        for(Product p : products)
        {
            System.out.println(p);
        }
    }


    public void delete()
    {
        System.out.println("Enter the id of the product");
        int id= scanner.nextInt();

        for(int i=0;i<products.size();i++)
        {
            if(products.get(i).getId()==id)
            {
                products.remove(i);
                break;
            }


        }

    }

    public void update()
    {
        System.out.println("Enter the id of the product");
        int id= scanner.nextInt();

        for(int i=0;i<products.size();i++)
        {
            if(products.get(i).getId()==id)
            {

                System.out.println("Choose a property");
                System.out.println("1. Name");
                System.out.println("2. Price");
                int choice= scanner.nextInt();

                switch (choice)
                {
                    case 1:{
                        System.out.println("Enter New Name");
                        String name=scanner.next();
                        products.get(i).setName(name);
                    }
                    case 2:{
                        System.out.println("Enter New Price");
                        float price=scanner.nextFloat();
                        products.get(i).setPrice(price);
                    }
                }


                break;

            }








        }

    }



}


