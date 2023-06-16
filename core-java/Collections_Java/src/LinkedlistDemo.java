import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

//if(a[i].>a[j])


class CustomSort implements Comparator<Product>{

    @Override
    public int compare(Product p1, Product p2) {
        return p2.getPrice()-p1.getPrice();
    }
}

public class LinkedlistDemo {

    public static void main(String args[])
    {

        LinkedList<Product> avengers=new LinkedList();


        avengers.add(new Product("Samsung M51",34000));
        avengers.add(new Product("Iphone 14",83000));
        avengers.add(new Product("Iphone 13",71000));


//        avengers.remove(1)




        Collections.sort(avengers,new CustomSort());


//        for(int i=0;i<avengers.size();i++)
//        {
//            System.out.println(avengers.get(i).getName());
//        }

        for(Product p : avengers)
        {
            System.out.println(p);
        }





//        for(Integer i : avengers)
//        {
//            System.out.println(i);
//        }


//        avengers.add("Thor");
//        avengers.add("Captain America");
//        avengers.add("Black Widow");

//        System.out.println(avengers.get(1));

//        System.out.println("Initial List");

//        for(int i=0;i<avengers.size();i++)
//        {
//            System.out.println(avengers.get(i));

//        }

//        for(String a : avengers)
//        {
//            System.out.println(a);
//        }



//        avengers.set(2,"Hulk");

//        avengers.remove(2);

//        avengers.clear();

//        avengers.addFirst("Ironman");
//        avengers.addLast("Hawkeye");

//        avengers.get


//        Collections.sort(avengers);

//        System.out.println("--------");
//        System.out.println("After operation");
//
//        for(int i=0;i<avengers.size();i++)
//        {
//            System.out.println(avengers.get(i));
//        }



    }


}
