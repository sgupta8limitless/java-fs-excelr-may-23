import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Product {

    private int id;
    private String name;
    private int price;
    private String category;
    private int quantity;
    private Timestamp created_at;

    private Timestamp updated_at;

    public  Product(){}

    public Product(String name, int price, String category, int quantity) {

        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;

    }

    public Product(int id, String name, int price, String category, int quantity, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}
