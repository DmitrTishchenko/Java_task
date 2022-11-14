package task04;

import java.util.LinkedList;
import java.util.Scanner;

public class task02 {
    public static void enqueue(LinkedList<Integer> ll, int element) {
        ll.addLast(element);
    }

    public static int dequeue(LinkedList<Integer> ll) {
        return ll.removeFirst();
    }

    public static int first(LinkedList<Integer> ll) {
        return ll.peekFirst();

    }

    public static void menu(LinkedList<Integer> ll) {
        Scanner scanner = new Scanner(System.in);
        menu: while (true) {
            System.out.print(
                    "Какую операцию над очередью хотите сделать?\n1 - для добавления числа в очередь: \n2 - для получения первого элемента их очереди и его удаления: \n3 - для отображения первого элемента: \nq - для выхода: \n");
            String input = scanner.nextLine();
            switch (input) {
                case ("1"):
                    System.out.println("Введите число для добавления");
                    input = scanner.nextLine();
                    int choise = Integer.parseInt(input);
                    enqueue(ll, choise);
                    System.out.println("Ваша очередь: " + ll);
                    break;

                case ("2"):
                    System.out.printf("Элемент %d был удален из очереди\n", dequeue(ll));
                    System.out.println("Ваша очередь: " + ll);
                    break;

                case ("3"):
                    int firstElement = first(ll);
                    System.out.printf("Первый элемент в очереди: %d \n", firstElement);
                    System.out.println("Ваша очередь: " + ll);
                    break;

                case ("q"):
                    break menu;
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        // Реализуйте очередь с помощью LinkedList со следующими методами:
        // enqueue() - помещает элемент в конец очереди,kl
        // dequeue() - возвращает первый элемент из очереди и удаляет его,
        // first() - возвращает первый элемент из очереди, не удаляя.
        System.out.print("\033[H\033[2J");
        LinkedList<Integer> ll = new LinkedList<Integer>();
        menu(ll);

    }
}
