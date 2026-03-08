package Bulk_Email_Sender;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Trigger {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 1; i <= 10000; i++) {
            Job jb = new Job(i);
            executorService.execute(jb);
        }
        executorService.shutdown();
    }
}
