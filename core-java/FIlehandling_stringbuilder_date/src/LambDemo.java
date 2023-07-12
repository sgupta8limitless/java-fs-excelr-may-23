
interface Demo{

    public void perform();



}



public class LambDemo {

    public static void main(String[] args)
    {

        Demo d=()->{
            System.out.println("hello implementation");
        };



        d.perform();


    }


}
