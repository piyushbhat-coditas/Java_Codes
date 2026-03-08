package Bulk_Email_Sender;

public class VirtualThreadSender {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            for (int i = 1; i <= 10000 ; i++) {
                System.out.println(i+"- Email Sent");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };
        Thread.startVirtualThread(r).join();
    }
}
