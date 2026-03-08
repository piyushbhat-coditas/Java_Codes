package Student_Result_Analyzer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(90, "ABC"));
        studentList.add(new Student(89, "XYZ"));
        studentList.add(new Student(60, "DEF"));
        studentList.add(new Student(55, "PQR"));
        studentList.add(new Student(99, "PQRS"));

        Analyzer analyzer =
                new Analyzer(studentList);

        analyzer.printTopper();
        analyzer.printLowestScore();
        analyzer.printFirstAndLast();
        analyzer.printReversedResults();
    }
}
