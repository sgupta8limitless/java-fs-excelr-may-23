import java.util.Scanner;

public class Loops {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

//        While
//        do while
//        for



//        System.out.println("Enter a number");
//        int num=sc.nextInt();
//

//        int num=9;
//        int a=1;
//
//          while(a<=10)
//            {
//
//               System.out.println(num+" * "+a+" = "+a*num);
//               a++;
//            }


//            int a = 67;

//            a=67

//            do
//            {
//                System.out.println(a);
//                a++;
//            }
//            while(a<=10);


//        i=3

//       for(int i=1;i<=10;i++)
//       {
//           System.out.println("i am a for loop "+i);
//       }


//        break

//        i=1

//        for(int i=1;i<=20;i++)
//        {
//
//            if(i==5)
//            {
//                continue;
//            }
//
//            System.out.println(i);
//
//        }

//        num = 0;
//        fact = 24 ;

//        System.out.println("Enter a number for factorial");
//        int num=sc.nextInt();
//
//
//        int fact=1;
//
//        while(num>=1)
//        {
//
//            fact=fact*num;
//            num--;
//        }
//
//        System.out.println(fact);
//
//        for(int i=num;i>=1;i--)
//        {
//            fact=fact*i;
//        }
//
//




//        int j=1;
//
//        do
//        {
//            System.out.println("Hello");
//            if(j==6)
//            {
//                break;
//            }
//            j++;
//        }
//        while (j<=10);




        // take a number from user
//        print its table and factorial


        System.out.println("Enter the number of rows");

        int rows=sc.nextInt();


        for(int i=1;i<=rows;i++)
        {

            for(int j=1;j<=i;j++)
            {

                System.out.print(" * ");

            }



            System.out.println("");


        }










    }

}
