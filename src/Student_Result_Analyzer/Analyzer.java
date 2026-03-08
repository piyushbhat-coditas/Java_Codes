package Student_Result_Analyzer;

import java.util.Comparator;
import java.util.List;
import java.util.SequencedCollection;

public class Analyzer {
    private List<Student> students;

    public Analyzer(List<Student> students) {
        this.students = students;
    }

    public void printTopper() {
        Student topper = students.stream()
                .max(Comparator.comparingInt(Student::getMarks))
                .orElse(null);

        System.out.println("Topper: " + topper);
    }

    public void printLowestScore() {
        Student lowest = students.stream()
                .min(Comparator.comparingInt(Student::getMarks))
                .orElse(null);

        System.out.println("Lowest Score: " + lowest);
    }

    public void printReversedResults() {
        SequencedCollection<Student> seq = (SequencedCollection<Student>) students;
        System.out.println("Reversed Results:");
        seq.reversed().forEach(System.out::println);
    }

    public void printFirstAndLast() {
        SequencedCollection<Student> seq = (SequencedCollection<Student>) students;
        System.out.println("First Student: " + seq.getFirst());
        System.out.println("Last Student: " + seq.getLast());
    }
}
