package task1;

/**
 * Создать класс поток, который создает средствами Java файл и записать в него
 * рандомно сгенерированный массив из 10 целых чисел. Запустить 5 потоков.
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new MyThread("thread" + i).start();
        }
    }
}
