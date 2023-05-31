import java.util.Scanner;
public class UserController {

    Scanner sc=new Scanner(System.in);
    User[] users=new User[5];

    int index=0;
    public void create()
    {
        System.out.println("Enter Name,Age,Salary,City & Department res");
        String name=sc.next();
        int age=sc.nextInt();
        float salary=sc.nextFloat();
        String city=sc.next();
        String department=sc.next();

        users[index]=new User(name,age,salary,city,department);
        index++;

    }

    public void displayUsers()
    {
        for(int i=0;i<index;i++)
        {
            System.out.println(users[i]);
        }
    }



}
