import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;


public class HomeWork {
    private LinkedList<Integer> numbers = new LinkedList<Integer>();
    private Scanner scn = new Scanner(System.in);
    private Random random = new Random();


    Queue<Integer> getNumbers() {
        return numbers;
    }

    Scanner getScn() {
        return scn;
    }

    void ifChoiceDefault() {
        for (int i = 0; i < 16; i++) {
            numbers.add(random.nextInt(2000));
        }
    }

    void choise2() {
        System.out.println("Введите размер:");
        int size = scn.nextInt();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(2000));
        }
    }
void add(){
        numbers.add(random.nextInt());
        numbers.remove();

}

}