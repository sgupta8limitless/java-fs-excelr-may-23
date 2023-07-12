public class RecDemo {

    int val=1;
    public void doSomething()
    {


        for(int i=1;i<=5;i++)
        {
            System.out.print(" * ");
        }

        System.out.println();
        val++;

        if(val<=5)
        {
           doSomething();
        }





    }

    public static void main(String[] args)
    {
        RecDemo r=new RecDemo();

        r.doSomething();
    }



}
