package task3;

import java.util.LinkedList;
import java.util.Random;

public class Storage {
    private LinkedList<Integer> storage = new LinkedList<>();
    public synchronized void produce() throws InterruptedException {
        if (storage.size() >= 10) wait();
        storage.add(new Random().nextInt());
        System.out.println("Добавлен один элемент, количество хранимых элементов: " + storage.size());
        notify();
    }
    public synchronized void consume() throws InterruptedException{
        if (storage.isEmpty()) wait();
        storage.removeFirst();
        System.out.println("Удалён один элемент, количество хранимых элементов: " + storage.size());
        Thread.sleep(new Random().nextInt(10));
        notify();
    }
}
