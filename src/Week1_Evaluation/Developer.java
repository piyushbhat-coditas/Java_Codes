package Week1_Evaluation;

class Developer extends Employee {

    int overtimeHours;

    Developer(String name, double baseSalary, int attendanceDays, int rating, int overtimeHours) {
        super(name, baseSalary, attendanceDays, rating);
        this.overtimeHours = overtimeHours;
    }

    double calculateGrossSalary() {
        return baseSalary + (overtimeHours * 500);
    }
}
