import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {


    public static void main(String[] args)
    {
        HashMap<String,String> hp=new HashMap();



        hp.put("a","Saurabh");
        hp.put("b","Aditi");
        hp.put("z","Yaswanth");


//        System.out.println(hp.get("a"));

//        hp.remove("b");

        hp.put("b","Manu");


        Set<String> keys=hp.keySet();

        for(String k:keys)
        {
            System.out.println(hp.get(k));
        }


//        Collection<String> vs= hp.values();
//
//        for(String s:vs)
//        {
//            System.out.println(s);
//        }





    }


}
