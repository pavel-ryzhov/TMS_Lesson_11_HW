package task2;

/**
 * Создать класс с синхронизированным методом, который выводит на экран имя текущего потока,
 * текущее время и вызывает sleep на 5 секунд. Запустить 10 потоков, которые вызывают этот метод от созданного объекта.
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new MyThread("Thread " + i).start();
        }
    }
}
