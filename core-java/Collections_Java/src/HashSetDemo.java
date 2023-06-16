import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args)
    {

        HashSet<String> names=new HashSet();


        names.add("Aqib");
        names.add("Subhashini");
        names.add("Saurabh");

//        System.out.println(b);

        names.remove("Aqib");



        for(String i:names)
        {
            System.out.println(i);
        }


    }


}
