package Evaluation1;

abstract class employee {
     String name;
     double baseSalary;
     int attendanceDays;
     int rating;
     static final double pf = 0.12;

     employee(String name, double baseSalary, int attendanceDays, int rating) {
         this.name = name;
         this.baseSalary = baseSalary;
         this.attendanceDays = attendanceDays;
         this.rating = rating;
     }

     abstract double calculateGrossSalary();

    double attendanceDeduction(){
        double DailySalary = baseSalary/30;
        int absentDays = 30-attendanceDays;
        double AttendanceDeduction = absentDays*DailySalary;
        return AttendanceDeduction;
    }

    double calculateBonus(double grossSalary) {
        double percent = 0;

        if (rating == 5) {
            percent = 0.20;
        } else if (rating == 4) {
            percent = 0.14;
        } else if (rating == 3) {
            percent = 0.10;
        } else if (rating == 2) {
            percent = 0.05;
        } else {
            percent = 0;
        }
        return grossSalary * percent;
    }

    double calculatepf() {
        return baseSalary * pf;
    }

    double calculateTax(double taxableIncome) {

        double taxRate = 0;

        if (taxableIncome <= 50000){
            taxRate = 0.05;
        } else if (taxableIncome <= 100000){
            taxRate = 0.10;
        } else if (taxableIncome < 150000){
            taxRate = 0.15;
        } else if (taxableIncome == 150000){
            taxRate = 0.20;
        }
         return taxableIncome * taxRate;
    }

    void calculateNetSalary(){
        double grossSalary = calculateGrossSalary();
        double attendanceDeduction = attendanceDeduction();
        double bonus = calculateBonus(grossSalary);
        double pf = calculatepf();
        double taxDeduction = calculateTax(grossSalary+bonus);

        double NetSalary = grossSalary+bonus-taxDeduction-pf-attendanceDeduction;

        System.out.println("Salary Breakdown");

        System.out.println("Employee Name  " +name);
        System.out.println("Gross Salary  " +grossSalary);
        System.out.println("pf  " +pf);
        System.out.println("Bonus  " +bonus);
        System.out.println("tax  " +taxDeduction);
        System.out.println("Attendance Deduction  " +attendanceDeduction);
        System.out.println("Final InHand Salary Received:  " +NetSalary);
    }
}
