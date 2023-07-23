import java.util.Arrays;

 class Tst {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Satyajit", 50000, 21);
        Student s2 = new Student(3, "Shiva", 40000, 18);
        Student s3 = new Student(5, "Akash", 20000, 26);
        Student s4 = new Student(4, "Barsha", 30000, 22);
        Student s5 = new Student(2, "Twinkle", 10000, 16);

        Student [] s = {s1, s2, s3, s4, s5};
        for (Student student : s) {
            System.out.println(student.getRoll()+" "+student.getName()+" "+student.getAge()+" "+student.getSal());
        }

        Arrays .sort(s);
        for (Student student : s) {
            System.out.println(student.getRoll()+" "+student.getName()+" "+student.getAge()+" "+student.getSal());
        }
    }
}

class Student implements Comparable<Student>{
    private int roll;
    private String name;
    private int sal;
    private int age;

    public int getRoll() {
        return this.roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return this.sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int roll, String name, int sal, int age){
        this.roll = roll;
        this.name = name;
        this.sal = sal;
        this.age = age;
    }
    public int compareTo(Student o){
        return this.sal - o.getSal();
    }

}
