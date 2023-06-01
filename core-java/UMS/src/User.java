public class User {

    private int id;
    private String name;
    private int age;
    private float salary;
    private String city;
    private String department;


    public User(int id,String name,int age,float salary,String city,String department)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.city=city;
        this.department=department;
    }

    public int getId()
    {
        return id;
    }

    public float getSalary()
    {
        return salary;
    }

    @Override
    public String toString() {

        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
