package task2;

import java.util.Date;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        showNameAndTime();
    }
    private static synchronized void showNameAndTime(){
        System.out.println(Thread.currentThread().getName() + ": " + new Date());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
