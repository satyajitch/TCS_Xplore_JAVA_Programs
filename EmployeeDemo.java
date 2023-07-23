class Employee {
    private int id;
    private String name;
    private String designation;
    private int ssnNo;
    private int age;
    private double salary;
    private static int idCounter = 0;

    public Employee(String name, String desg, int ssnNo, int age, double sal) {
        this.name = name;
        this.designation = desg;
        this.salary = sal;
        this.age = age;
        this.ssnNo = ssnNo;
        idCounter++;
        this.id = idCounter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDesignation(String desg) {
        this.designation = desg;
    }

    public String getDesignation() {
        return designation;
    }

    public void setSsnNo(int ssnNo) {
        this.ssnNo = ssnNo;
    }

    public int getSsnNo() {
        return ssnNo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double sal) {
        this.salary = sal;
    }

    public double getSalary() {
        return salary;
    }

    public static int getIdCounter() {
        return idCounter;
    }

}
public class EmployeeDemo {
    public static void main(String args[]) {
        Employee employee1 = new Employee("jirhehb", "siarpha", 35, 70, 776.0);
        System.out.println("Value of idCounter : " + Employee.getIdCounter());
        Employee employee2 = new Employee("ycrdzsi", "voivkqr", 32, 87, 484.0);
        System.out.println("Value of idCounter : " + Employee.getIdCounter());
        Employee employee3 = new Employee("txdxrzv", "azpjbbb", 4, 63, 369.0);
        System.out.println("Value of idCounter : " + Employee.getIdCounter());
        Employee employee4 = new Employee("pefjukm", "mctpbqe", 36, 0, 951.0);
        System.out.println("Value of idCounter : " + Employee.getIdCounter());
        Employee employee5 = new Employee("shbrzke", "lpcnymz", 51, 86, 181.0);
        System.out.println("Value of idCounter : " + Employee.getIdCounter());
    }
}