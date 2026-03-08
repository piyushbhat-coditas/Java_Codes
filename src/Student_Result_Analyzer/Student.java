package Student_Result_Analyzer;

public class Student {
    private String name;
    private int marks;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
