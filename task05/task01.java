package task05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task01 {

    public static Map<Integer, String> OuputOfNumbers(Map<Integer, String> map) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите имя искомого контакта: ");
        String forname = sc.next();
        for (var item : map.entrySet()) {
            if (item.getValue().equals(forname)) {
                System.out.printf("№ телефона: %d имя: %s \n", item.getKey(), item.getValue());
            }
        }
        return map;
    }

    public static Map<Integer, String> EntryData(Map<Integer, String> map) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите номер телефона: ");
        int num = sc.nextInt();
        System.out.printf("Введите имя: ");
        String text = sc.next();
        map.putIfAbsent(num, text);

        return map;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Map<Integer, String> map = new HashMap<Integer, String>();
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.printf(
                    "Введите команду: \n 1 - добавить телефон,\n 2 - вывести номера телефона контакта,\n 3 - вывести все контакты,\n 4 -выход \n");
            int num = sc.nextInt();
            if (num == 1) {
                EntryData(map);
            }
            if (num == 2) {
                OuputOfNumbers(map);
            }
            if (num == 3) {
                System.out.println(map);
            }
            if (num == 4) {
                break;
            }

        }
    }
}
