public class User {

    private String name;
    private int age;
    private float salary;
    private String city;
    private String department;


    public User(String name,int age,float salary,String city,String department)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.city=city;
        this.department=department;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
