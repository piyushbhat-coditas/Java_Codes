package Week1_Evaluation;

class Manager extends Employee {

    int teamSize;

    Manager(String name, double baseSalary, int attendanceDays, int rating, int teamSize) {
        super(name, baseSalary, attendanceDays, rating);
        this.teamSize = teamSize;
    }

    double calculateGrossSalary() {
        return baseSalary + (teamSize * 1000);
    }
}
