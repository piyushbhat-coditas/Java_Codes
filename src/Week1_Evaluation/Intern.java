package Week1_Evaluation;

class Intern extends Employee {

    Intern(String name, double baseSalary, int attendanceDays, int rating) {
        super(name, baseSalary, attendanceDays, rating);
    }

    double calculateGrossSalary() {
        double attendancePercent = (attendanceDays / 30.0) * 100;

        if (attendancePercent < 70) {
            return baseSalary - (baseSalary * 0.20);
        } else {
            return baseSalary;
        }
    }
}
