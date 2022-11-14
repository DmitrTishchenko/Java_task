package task04;

import java.util.LinkedList;

public class task01 {
    public static LinkedList<Integer> ReverseLinkedList(LinkedList<Integer> ll) {
        LinkedList<Integer> reverseLL = new LinkedList<>();
        for (int i = ll.size(); i > 0; i--) {
            int element = ll.getLast();
            ll.remove(ll.getLast());
            reverseLL.addLast(element);
        }
        return reverseLL;
    }

    public static int getRandomIntegerBetweenRange(int min, int max) {
        int x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }

    public static void main(String[] args) {
        // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
        // вернет “перевернутый” список.
        System.out.print("\033[H\033[2J");
        LinkedList<Integer> ll = new LinkedList<Integer>();

        for (int i = 0; i < 5; i++)
            ll.add(getRandomIntegerBetweenRange(1, 100));

        System.out.println(ll);
        LinkedList<Integer> result = ReverseLinkedList(ll);
        System.out.println(result);
    }
}
