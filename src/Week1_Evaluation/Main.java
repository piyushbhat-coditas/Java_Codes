package Week1_Evaluation;

public class Main {
    public static void main(String[] args) {

        Developer dev = new Developer("Sidhesh", 56000, 26, 3, 6);
        Manager mgr = new Manager("Arhaan", 75000, 26, 5, 8);
        Intern intern = new Intern("Prajwal", 11000, 18, 3);

        dev.calculateNetSalary();
        mgr.calculateNetSalary();
        intern.calculateNetSalary();
    }
}
