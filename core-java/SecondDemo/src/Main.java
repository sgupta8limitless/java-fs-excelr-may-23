public class Main {
    public static void main(String[] args) {





           int[] data={34,23,12,56,2};


           for(int i=0;i<data.length;i++)
           {
               System.out.println(data[i]);
           }


        System.out.println("------------------------");

           for(int i=0;i<data.length;i++)
           {
               for(int j=i+1;j<data.length;j++)
               {
                   if(data[i]<data[j])
                   {
                       int temp=data[i];
                       data[i]=data[j];
                       data[j]=temp;
                   }
               }


           }

        System.out.println("------------------------");


        for(int i=0;i<data.length;i++)
        {
            System.out.println(data[i]);
        }




    }
}