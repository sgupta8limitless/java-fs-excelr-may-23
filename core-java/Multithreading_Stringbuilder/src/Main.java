public class Main {
    public static void main(String[] args) {


//        MyThread myThread2=new MyThread("My Thread 1",2);
//        MyThread myThread3=new MyThread("My Thread 2",3);



//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }






//        myThread2.start();
//
//        myThread3.start();


//        try {
//            myThread1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        for(int i=1;i<=200;i++)
//        {
//
//            System.out.println("Main Thread"+i);
//
//        }





//        System.out.println(myThread2.isAlive());


//        Using interface

        NewThread nt=new NewThread();

        Thread t=new Thread(nt);



        t.start();

        for(int i=1;i<=200;i++)
        {

            System.out.println("Main Thread"+i);

        }













    }
}