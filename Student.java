public class Student {
    private int roll;
    private String name;
    private double mark;
    private String grade;

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

    public double getMark() {
        return this.mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    };

    public Student(int roll, String name, double mark){
        this.roll = roll;
        this.name = name;
        this.mark = mark;
    }

    public static void assignGrade(Student student){
        if(student.getMark() >= 85){
            student.setGrade("A");
        }
        else if(student.getMark() >= 70){
            student.setGrade("B");
        }
        else if(student.getMark() >= 60){
            student.setGrade("C");
        }
        else{
            student.setGrade("D");
        }
    }
    public static void main(String[] args) {
        Student st1 = new Student(1, "Satyajit", 98);
        Student st2 = new Student(2, "Debasis", 87);
        Student st3 = new Student(3, "Panda", 70);
        assignGrade(st1);
        // assignGrade(st2);
        assignGrade(st3);

        st2.assignGrade(st2);

        System.out.println("Grade of Satyajit "+st1.getGrade());
        System.out.println("Grade of Debasis "+st2.getGrade());
        System.out.println("Grade of panda "+st3.getGrade());
    }
    
}
