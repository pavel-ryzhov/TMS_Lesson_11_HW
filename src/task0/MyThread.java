package task0;

import java.util.Arrays;
import java.util.Random;

public class MyThread extends Thread{
    private int[] data = new int[10];
    public MyThread(String name){
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt();
        }
        this.setName(name);
    }
    @Override
    public void run() {
        System.out.println(this.getName() + ": " + Arrays.stream(data).reduce(Integer::max).getAsInt());
    }
}
