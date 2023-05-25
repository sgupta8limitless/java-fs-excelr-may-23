import java.util.Scanner;

public class InterestCalculator {

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);


        System.out.println("Enter Your salary");
        int salary = sc.nextInt();

        System.out.println("Enter your name");
        String name=sc.next();

//        ask  for invested amount

        System.out.println("The name is "+name);
        System.out.println("The salary is "+salary);


        float tax;


//        if investment > 10000   15% off
//            > 5000   10% off
//
//            >2000  3% off


        if(salary>100000)
        {

            tax= 0.1f*salary;

        }
        else if(salary>70000 && salary<=100000)
        {
            tax=0.08f*salary;

        }
        else if(salary>40000 && salary<=70000)
        {
            tax=0.05f*salary;

        }
        else
        {
            tax=0;
        }

        System.out.println("The tax you have to pay is "+tax);


















    }

}
