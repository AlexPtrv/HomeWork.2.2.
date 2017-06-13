import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;


public class HomeWork<T> {
    private Queue<Integer> numbers = new LinkedList<>();
    private Scanner scn = new Scanner(System.in);
    private Random random = new Random();
    private T val;

    HomeWork(T o) {
        val = o;
    }

    T getVal() {
        return val;
    }

    Queue<Integer> getNumbers() {
        return numbers;
    }

    Scanner getScn() {
        return scn;
    }

    HomeWork<Integer> iOb;

    void ifChoiceDefault() {
        for (int i = 0; i < 16; i++) {
            iOb = new HomeWork<>(random.nextInt(2000));
            int defaultNumbers = iOb.getVal();
            numbers.offer(defaultNumbers);
        }
    }

    void choice2() {
        System.out.println("Введите размер:");
        try {
            iOb = new HomeWork<>(Integer.parseInt(scn.next()));
            int size = iOb.getVal();
            for (int i = 0; i < size; i++) {
                numbers.offer(random.nextInt(2000));
            }
        } catch (NumberFormatException n) {
            System.out.println("Вводить можно только число!");
            choice2();
        }
    }

    void add() {
        iOb = new HomeWork<>(random.nextInt());
        int number = iOb.getVal();
        numbers.offer(number);
        numbers.poll();

    }

}