import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        ArrayList names=new ArrayList<Integer>();

//        System.out.println("How Many Names you want to add");
//        int count=sc.nextInt();
//
//        for (int i=1;i<=count;i++)
//        {
//            System.out.println("Enter name");
//            String name=sc.next();
//            names.add(name);
//        }

//        to add
        names.add(32);
        names.add(56);
        names.add(12);
        names.add(10);

//to add on a particular index
//        names.add(1,"Vikashini");

//        to delete
//        names.remove(0);

//        to update

//        names.set(1,"Thor");

//        to check if a element is present
//        System.out.println(names.contains("Saurabh"));

//        to get the index
//        System.out.println(names.indexOf("Saurabh"));

//        to get the length
//        System.out.println("length "+names.size());

//    to clear the list
//        names.clear();

//        ArrayList na = (ArrayList) names.clone();




//        for(int i=0;i<names.size();i++)
//        {
//            System.out.println(names.get(i));
//        }
//
//
//        Collections.sort(names);
//
//        System.out.println("-------");
//
//        for(int i=0;i<names.size();i++)
//        {
//            System.out.println(names.get(i));
//        }


//        float a=2;
//
//        System.out.println(a);



        int[] a={34,12,56,23,67};

        Arrays.sort(a);


        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }




    }
}