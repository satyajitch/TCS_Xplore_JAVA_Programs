class Student{
    private int sid;
    private String name;
    private double marks;

    public int getSid() {
        return this.sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return this.marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Student(int sid, String name, double marks){
        this.sid = sid;
        this.name = name;
        this.marks = marks;
    }
}
public class BubbleSortInObject {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Satyajit", 596);
        Student s2 = new Student(2, "Debasis", 610);
        Student s3 = new Student(3, "Priyaranjan", 713);
        Student s4 = new Student(4, "Jani", 513);
        Student s5 = new Student(5, "Sambit", 432);
        Student s6 = new Student(6, "Shakti", 360);

        Student[] s = new Student[]{s1,s2,s3,s4,s5,s6};

        s = bubbleSort(s);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getMarks()+" "+s[i].getName());
        }
    }

    static Student[] bubbleSort(Student a[]){
        Student temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i].getMarks() > a[j].getMarks()){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
