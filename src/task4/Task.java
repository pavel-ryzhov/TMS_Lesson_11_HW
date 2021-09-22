package task4;

/**
 * задача, которая засыпает на введённое число секунд и затем выводит "Я спал N секунд"
 */
public class Task implements Runnable {
    private long n;

    public Task(long n) {
        this.n = n;
        Thread thread = new Thread(this);
        thread.setDaemon(true);
        thread.start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(n);
            System.out.printf("Я спал %d секунд%n", n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
