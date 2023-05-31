import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        UserController uc=new UserController();
        int status;
        do {
            System.out.println("1. Create New User");
            System.out.println("2. View All Users");
            System.out.println("Choose an option");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    uc.create();
                    break;
                }
                case 2: {
                    uc.displayUsers();
                    break;
                }
            }

            System.out.println("Do You Want to continue 1-Yes 0-No");
            status=sc.nextInt();
        }
        while(status!=0);










    }
}