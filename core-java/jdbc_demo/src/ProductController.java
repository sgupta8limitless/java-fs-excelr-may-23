import java.sql.*;
import java.util.Scanner;

public class ProductController {



    Connection connection;
    Scanner scanner=new Scanner(System.in);



    public ProductController()
    {
        try {


            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/excelrdemo","root","thorabh8");


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void create()
    {
        try {

            Statement statement=connection.createStatement();

            System.out.println("Enter Name,Price,Category & Quantity Res");
            String pname=scanner.next();
            int price=scanner.nextInt();
            String category=scanner.next();
            int quantity=scanner.nextInt();

            String query = "insert into products(pname,price,category,quantity) values('"+pname+"',"+price+",'"+category+"',"+quantity+")";

            int status = statement.executeUpdate(query);

            if(status==1)
            {
                System.out.println("Inserted Successfully");
            }
            else
            {
                System.out.println("Some Problem");
            }

            statement.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void delete()
    {

        try {

            Statement statement = connection.createStatement();

            System.out.println("Enter the id of the product you want to delete");
            int id=scanner.nextInt();

            String query = "delete from products where id ="+id;

            int status = statement.executeUpdate(query);

            if(status==1)
            {
                System.out.println("Deletion Successfull");
            }
            else
            {
                System.out.println("Some Problem");
            }

            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }


    public void getAll()
    {
        try {

            Statement statement=connection.createStatement();


            String query = "select * from products";

            ResultSet rs = statement.executeQuery(query);

            while (rs.next())
            {
                System.out.println(rs.getInt("id")+"  "+rs.getString("pname")+"  "+rs.getInt(3));
            }


            statement.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }







}
