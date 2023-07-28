import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ProductGateway {


    private Connection getConn()
    {
        return ConnectionFactory.getDbConnection().getConnection();
    }

    public boolean insert(Product product)
    {
        try {

            Statement statement=this.getConn().createStatement();

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


    public boolean delete(int id)
    {

        try {

            Statement statement=this.getConn().createStatement();

            String query="delete from products where id = "+id;

            int status = statement.executeUpdate(query);

            if(status>0)
            {
                return true;
            }

            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return false;
    }

    public boolean update(Product product)
    {
        try {

            Statement statement=this.getConn().createStatement();

            String query="update products set name='"+product.getName()+"',price="+product.getPrice()+",category='"+product.getCategory()+"',quantity="+product.getQuantity()+" where id = "+product.getId();

            int status = statement.executeUpdate(query);

            if(status>0)
            {
                return true;
            }

            statement.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;

    }


    public ArrayList<Product> index()
    {

        ArrayList<Product> products=new ArrayList();

        try {

            Statement statement=this.getConn().createStatement();

            String query="select * from products";

            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next())
            {

                Product p = new Product();

                p.setId(resultSet.getInt("id"));
                p.setName(resultSet.getString("name"));
                p.setPrice(resultSet.getInt("price"));
                p.setCategory(resultSet.getString("category"));
                p.setQuantity(resultSet.getInt("quantity"));

                p.setCreated_at(resultSet.getTimestamp("created_at"));
                p.setUpdated_at(resultSet.getTimestamp("updated_at"));


                products.add(p);

            }

            return products;



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




    }


}
