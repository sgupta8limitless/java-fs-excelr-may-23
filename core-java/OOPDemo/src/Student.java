import java.util.Scanner;

public class Student {

    private String name;
    private String city;
    private String course;
    private int yob;

    void getDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name,city,course and yob res");
        name=sc.next();
        city=sc.next();
        course=sc.next();
        yob=sc.nextInt();
    }

    int calculateAge()
    {
        int age=2023-yob;
        return age;

    }

    void printDetails()
    {
        System.out.println(name);
        System.out.println(city);
        System.out.println(course);
        System.out.println(yob);
    }

    void printName(String firstname,int weight)
    {

        System.out.println("Hello "+firstname+" your weight is "+weight);
        System.out.println(city);
    }




}


