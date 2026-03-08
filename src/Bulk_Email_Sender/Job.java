package Bulk_Email_Sender;

public class Job implements Runnable{
    int emailCount;

    Job(int emailNumber){
        this.emailCount = emailNumber;
    }

    @Override
    public void run() {
        System.out.println(emailCount+"- Email Sent");
    }
}
