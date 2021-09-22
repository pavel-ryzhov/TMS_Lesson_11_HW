package task4;

import java.util.Scanner;

/**
 * Написать программу, бесконечно считывающую пользовательские числа из консоли.
 * Эти числа представляют собой количество секунд.
 * При каждом вводе числа, должна создаваться задача, которая засыпает на введённое число секунд и затем выводит "Я спал N секунд".
 * Однако нужно сделать так, чтобы все задачи выполнялись в отдельном потоке.
 * При вводе -1 программа должна завершать свою работу.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            long n = scanner.nextLong();
            if (n == -1) break;
            new Task(n);
        }
    }
}
