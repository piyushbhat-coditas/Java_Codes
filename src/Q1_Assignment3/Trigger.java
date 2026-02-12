package Q1_Assignment3;

public class Trigger {
    static void main(String[] args) throws InterruptedException {
        job job1 = new job();
        job job2 = new job();
        job job3 = new job();

        Thread.sleep(1000);
        job1.start();
        job2.start();
        job3.start();
    }
}
