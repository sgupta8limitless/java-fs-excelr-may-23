import java.sql.SQLOutput;
import java.util.Scanner;
public class UserController {

    Scanner sc=new Scanner(System.in);
    User[] users=new User[10];

    int count=0;
    public void create()
    {
        System.out.println("Enter Id,Name,Age,Salary,City & Department res");
        int id=sc.nextInt();
        String name=sc.next();
        int age=sc.nextInt();
        float salary=sc.nextFloat();
        String city=sc.next();
        String department=sc.next();

        users[count]=new User(id,name,age,salary,city,department);
        count++;

    }

    public void displayUsers()
    {
        for(int i=0;i<count;i++)
        {
            System.out.println(users[i]);
        }
    }

    public void deleteUser(int id)
    {
         for(int i=0;i<count;i++)
        {
            if(users[i].getId()==id)
            {
                users[i]=null;
                break;
            }


        }
    }

    public void searchBySalary()
    {
        System.out.println("Enter min and max salary");
        float minsal=sc.nextFloat();
        float maxsal=sc.nextFloat();

        for(int i=0;i<count;i++)
        {
            if(users[i].getSalary()>minsal && users[i].getSalary()<maxsal)
            {
                System.out.println(users[i]);
            }
        }

    }



}


//write a program to search a number in a array of numbers if that number is
//present in the array print found otherwise not found


//write a program to loop through array and print all the numbers which are on odd indexes


//write a program to have array of products (name,price,category)
//loop through the array and only print product names
