package Week1_Evaluation;

abstract class Employee {

    String name;
    double baseSalary;
    int attendanceDays;
    int rating;

    static final double PF_PERCENT = 0.12;

    Employee(String name, double baseSalary, int attendanceDays, int rating) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.attendanceDays = attendanceDays;
        this.rating = rating;
    }

    abstract double calculateGrossSalary();

    double calculateAttendanceDeduction() {
        double dailySalary = baseSalary / 30;
        int absentDays = 30 - attendanceDays;
        return absentDays * dailySalary;
    }

    double calculateBonus(double grossSalary) {
        double percent = 0;

        if (rating == 5) percent = 0.20;
        else if (rating == 4) percent = 0.15;
        else if (rating == 3) percent = 0.10;
        else if (rating == 2) percent = 0.05;
        else percent = 0;

        return grossSalary * percent;
    }

    double calculatePF() {
        return baseSalary * PF_PERCENT;
    }

    double calculateTax(double taxableIncome) {
        double taxRate;

        if (taxableIncome <= 50000) taxRate = 0.05;
        else if (taxableIncome <= 100000) taxRate = 0.10;
        else if (taxableIncome <= 150000) taxRate = 0.15;
        else taxRate = 0.20;

        return taxableIncome * taxRate;
    }

    void calculateNetSalary() {
        double gross = calculateGrossSalary();
        double bonus = calculateBonus(gross);
        double pf = calculatePF();
        double tax = calculateTax(gross + bonus);
        double attendanceDeduction = calculateAttendanceDeduction();

        double netSalary = gross + bonus - tax - pf - attendanceDeduction;

        System.out.println("\nEmployee: " + name);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Bonus: " + bonus);
        System.out.println("PF Deduction: " + pf);
        System.out.println("Tax: " + tax);
        System.out.println("Attendance Deduction: " + attendanceDeduction);
        System.out.println("Net Salary: " + netSalary);
    }
}
