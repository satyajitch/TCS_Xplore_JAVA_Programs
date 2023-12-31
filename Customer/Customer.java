package Customer;

public class Customer {
    private int id;
    private String name;
    private String dob;
    private double salary;
    private String email;
    private int age;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Customer(int id, String name, String dob, double salary, String email, int age){
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
        this.email = email;
        this.age = age;
    }
    
}
