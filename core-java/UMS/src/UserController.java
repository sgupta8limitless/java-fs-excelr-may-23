import java.sql.SQLOutput;
import java.util.Scanner;
public class UserController {

    Scanner sc=new Scanner(System.in);
    User[] users=new User[10];

    int userIndex=0;


    public void create()
    {
        if(userIndex<=9)
        {
            System.out.println("Enter Id,Name,Age,Salary,City & Department res");
            int id=sc.nextInt();
            String name=sc.next();
            int age=sc.nextInt();
            float salary=sc.nextFloat();
            String city=sc.next();
            String department=sc.next();

            users[userIndex]=new User(id,name,age,salary,city,department);
            userIndex++;
        }
        else
        {
            System.out.println("No More Space Left");
        }

    }

    public void displayUsers()
    {
        for(int i=0;i<userIndex;i++)
        {
            System.out.println(users[i]);
        }
    }

    public void deleteUser(int id)
    {
         for(int i=0;i<userIndex;i++)
        {
            if(users[i].getId()==id)
            {
                users[i]=null;
                System.out.println("User Deleted Successfully");


                for(int j=i;j<userIndex;j++)
                {
                    users[j]=users[j+1];
                }

                userIndex--;



                break;
            }


        }



    }

    public void searchBySalary()
    {
        System.out.println("Enter min and max salary");
        float minsal=sc.nextFloat();
        float maxsal=sc.nextFloat();

        for(int i=0;i<userIndex;i++)
        {
            if(users[i].getSalary()>minsal && users[i].getSalary()<maxsal)
            {
                System.out.println(users[i]);
            }
        }

    }


    public void updateUser(int id)
    {

        for(int i=0;i<userIndex;i++)
        {
            if(users[i].getId()==id)
            {

                System.out.println("Choose what you want to update");
                System.out.println("1. Name");
                System.out.println("2. Age");
                System.out.println("3. Salary");
                System.out.println("4. City");
                System.out.println("5. Department");
                int choice =  sc.nextInt();

                switch (choice)
                {
                    case 1:{
                        System.out.println("Enter New Name");
                        String newname=sc.next();
                        users[i].setName(newname);
                        System.out.println("Name Updated Successfully");
                        break;
                    }
                    case 2:{
                        System.out.println("Enter New Age");
                        int newage=sc.nextInt();
                        users[i].setAge(newage);
                        System.out.println("Age Updated Successfully");
                        break;
                    }
                    case 3:{
                        System.out.println("Enter New Salary");
                        float newsalary=sc.nextFloat();
                        users[i].setSalary(newsalary);
                        System.out.println("Salary Updated Successfully");
                        break;
                    }
                    case 4:{
                        System.out.println("Enter New City");
                        String newcity=sc.next();
                        users[i].setCity(newcity);
                        System.out.println("City Updated Successfully");
                        break;
                    }
                    case 5:{
                        System.out.println("Enter New Department");
                        String newdep=sc.next();
                        users[i].setDepartment(newdep);
                        System.out.println("Department Updated Successfully");
                        break;
                    }
                    default:{
                        System.out.println("Select a proper option");
                    }


                }


                break;


            }
        }

    }



}


//write a program to search a number in a array of numbers if that number is
//present in the array print found otherwise not found


//write a program to loop through array and print all the numbers which are on odd indexes


//write a program to have array of products (name,price,category)
//loop through the array and only print product names
