import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {


        try {


            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3307/excelrdemo","root","thorabh8");


            Statement st=connection.createStatement();

            st.executeUpdate("insert into products(pname,price,category,quantity) values('New PRo',100,'general',22)");





        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}