package Evaluation1;

public class main {
    public static void main(String[] args){
        developer dev = new developer("Piyush Bhat", 50000, 26, 4);
        manager mgr = new manager("Arhaan", 75000, 26, 5, 8);
        intern intern = new intern("Prajwal", 11000, 18, 3);

        dev.calculateNetSalary();
        mgr.calculateNetSalary();
        intern.calculateNetSalary();

    }
}
