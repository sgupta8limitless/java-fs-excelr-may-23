import java.util.Scanner;
public class Hello {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        UserController uc=new UserController();

        int status;
        do {
            System.out.println("1. Create New User");
            System.out.println("2. View All Users");
            System.out.println("3. Delete a User");
            System.out.println("4. Search By Salary");
            System.out.println("5. Update a user");
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
                case 3:{
                    System.out.println("Enter user id");
                    int id=sc.nextInt();
                    uc.deleteUser(id);
                    break;
                }
                case 4:{
                    uc.searchBySalary();
                    break;
                }
                case 5:{
                    System.out.println("Enter user id");
                    int id=sc.nextInt();
                    uc.updateUser(id);
                    break;
                }
                default:{
                    System.out.println("Select a proper option");
                }
            }

            System.out.println("Do You Want to continue 1-Yes 0-No");
            status=sc.nextInt();
        }
        while(status==1);










    }
}