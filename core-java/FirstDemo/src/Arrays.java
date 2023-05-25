import java.util.Scanner;
public class Arrays {

    public static void main(String[] args)
    {


        Scanner sc=new Scanner(System.in);

//        int[] nums={34,56,67,89,32,56,78,32};





//        int[] nums;
//
//
//
//       int[] nums=new int[10];
//
//
//        for(int i=0;i<nums.length;i++)
//        {
//            System.out.println("Enter a Value");
//            nums[i]=sc.nextInt();
//        }
//
//        nums[2]=100;
//
//        for(int i=0;i<nums.length;i++)
//        {
//            System.out.println(nums[i]);
//        }

//        String[] names={"Thor","Ironman","Captain America","Hulk"};
//
//        for(int i=0;i<names.length;i++)
//        {
//            System.out.println(i);
//        }


//       1. Write a program to print a pyramid
//       2. Write a program to take 10 names from user and print all of them
//       3. Write a program to take 10 ages from users and print the index of people born in 1995


            int rows=7;

            for(int r=1;r<=rows;r++)
            {

                for(int s=rows-1;s>=r;s--)
                {
                    System.out.print(" ");
                }

                for(int j=1;j<=r;j++)
                {
                    System.out.print("* ");
                }

                System.out.println("");
            }










    }

}
