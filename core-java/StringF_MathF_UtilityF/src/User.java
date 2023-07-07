import java.util.Scanner;

public class User {


    String name;
    int age;

    String planet;

    Scanner scanner=new Scanner(System.in);


    public void getDetails()
    {
        System.out.println("Enter Name");
        this.name = scanner.next();

        System.out.println("Enter Age");
        this.age=scanner.nextInt();




    }

    public void someRandom()
    {
        System.out.println("hi");
        System.out.println("hello");

    }

    public void printDetails()
    {
        System.out.println("The name is "+name);
        System.out.println("The age is "+age);
        System.out.println(planet.repeat(3));
    }


}
