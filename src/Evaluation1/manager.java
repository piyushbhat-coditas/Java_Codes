package Evaluation1;

public class manager extends employee{
    int teamSize;

    manager(String name, double baseSalary, int attendanceDays, int rating, int i) {
        super(name, baseSalary, attendanceDays, rating);

        this.teamSize=teamSize;
    }

    @Override
    double calculateGrossSalary() {
        return baseSalary+(teamSize*1000);
    }
}
