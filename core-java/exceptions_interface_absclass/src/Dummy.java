import java.util.InputMismatchException;
import java.util.Scanner;

public class Dummy {

    Scanner sc=new Scanner(System.in);
        public void doSomething() throws ArithmeticException,InputMismatchException,Exception
        {
            int a=34;

            System.out.println("hello");

            System.out.println("Enter the number u want to divide with");
            int d=sc.nextInt();
            float ans = a / d;
            System.out.println("the number is " + ans);


            System.out.println("bye");


        }


}
