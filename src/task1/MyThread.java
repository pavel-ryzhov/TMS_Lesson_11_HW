package task1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try(FileOutputStream fileOutputStream = new FileOutputStream(getName() + ".txt")){
            int[] array = new int[10];
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt();
            }
            fileOutputStream.write(Arrays.toString(array).getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
