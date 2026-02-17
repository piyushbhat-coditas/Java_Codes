package Evaluation1;

class intern extends employee{
    intern(String name, double baseSalary, int attendanceDays, int rating) {
        super(name, baseSalary, attendanceDays, rating);
    }

    @Override
    double calculateGrossSalary() {
        double attendancePercentage = (attendanceDays/30)*100;
        if (attendancePercentage<70){
            return baseSalary-(baseSalary*0.20);
        }
        else {
            return baseSalary;
        }
    }
}
