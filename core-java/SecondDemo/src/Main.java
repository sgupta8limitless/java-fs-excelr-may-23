import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        Bubble Sort

//           int[] data={34,23,12,56,2};
//
//
//           for(int i=0;i<data.length;i++)
//           {
//               System.out.println(data[i]);
//           }
//
//
//        System.out.println("------------------------");
//
//           for(int i=0;i<data.length;i++)
//           {
//               for(int j=i+1;j<data.length;j++)
//               {
//                   if(data[i]<data[j])
//                   {
//                       int temp=data[i];
//                       data[i]=data[j];
//                       data[j]=temp;
//                   }
//               }
//
//
//           }
//
//        System.out.println("------------------------");
//
//
//        for(int i=0;i<data.length;i++)
//        {
//            System.out.println(data[i]);
//        }




//        User e=new Employee();
//
//        e.printDetails();


//        Insertion sort


//        int[] arr={23,12,56,2,6,8};
//

//
//        for(int i=1;i<arr.length;i++)
//        {
//            int val=arr[i];
//            int j=i-1;
//
//            while(j>=0 && arr[j]>val)
//            {
//                arr[j+1]=arr[j];
//                j--;
//            }
//
//            arr[j+1]=val;
//
//
//        }
//
//
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }



//        selection sort

        Scanner sc=new Scanner(System.in);

        int[] arr=new int[5];

        System.out.println("Enter 5 Values");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }


        for(int i=0;i<arr.length;i++)
        {

            int small_index=i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[small_index]){
                    small_index=j;
                }
            }

            int temp=arr[small_index];
            arr[small_index]=arr[i];
            arr[i]=temp;


        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }



    }
}




