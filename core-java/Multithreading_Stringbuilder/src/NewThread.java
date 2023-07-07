public class NewThread implements Runnable{


    @Override
    public void run() {
        for (int i=1;i<=200;i++)
        {
            System.out.println("Secondary Thread "+i);
        }
    }
}
