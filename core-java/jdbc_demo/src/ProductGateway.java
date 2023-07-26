import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductGateway {

    public boolean insert(Product product)
    {
        try {

            Statement statement=ConnectionFactory.getDbConnection().getConnection().createStatement();

            String query="insert into products(name,price,category,quantity) values('"+product.getName()+"',"+product.getPrice()+",'"+product.getCategory()+"',"+product.getQuantity()+")";
            int status=statement.executeUpdate(query);
            statement.close();
            if(status!=0)
            {
                return true;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }


}
