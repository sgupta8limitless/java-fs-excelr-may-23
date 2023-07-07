public class MyThread extends Thread{

    String name;
    int no;
    public MyThread(String name,int no)
    {
        this.name=name;
        this.no=no;
    }

    public void run()
    {
        for(int i=1;i<=200;i++)
        {

//            if(no==3 && i==3)
//            {
//                throw new RuntimeException();
//            }


            System.out.println(name+" "+i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }


    }

}
