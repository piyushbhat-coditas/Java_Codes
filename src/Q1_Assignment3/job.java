/*
Problem: Create a program that simulates a race between 3 runners, each represented
by a separate thread. The threads should start at the same time and print their progress
in intervals. The race ends when the first runner completes a fixed number of steps.
Objective: Understand how to start threads and manage their lifecycle using Thread
class or Runnable interface.
 */

package Q1_Assignment3;

public class job extends Thread{

    static boolean raceOver = false;


    public static void sync(){
        int i = 1;
        while (!raceOver && i <=5) {
            if(i == 5) {
                raceOver = true;
                System.out.println("Winner thread is "+Thread.currentThread().getName() + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Thread.currentThread().interrupt();
            }
            else{
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
            i++;
        }
    }

    @Override
    public void run() {
        sync();
    }

}



