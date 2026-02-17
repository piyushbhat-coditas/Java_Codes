package Evaluation1;

class developer extends employee {
    int overTimeHours;

    developer(String name, double baseSalary, int attendanceDays, int rating) {
        super(name, baseSalary, attendanceDays, rating);
    }

    @Override
    double calculateGrossSalary() {
        return baseSalary+(overTimeHours*500);
    }
}
