package task06;

import java.util.*;

public class Main {

    public static Integer enterFilter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для поиска: ");
        System.out.println(
                "1 по процессору\n2 по оперативной памяти\n3 по жесткому диску\n4 по видеокарте\n5 по материнской плате\n");
        System.out.println("Ваш выбор: ");
        return scanner.nextInt();
    }

    public static void showResult(Map<String, Notebook> result) {
        for (var notebook : result.entrySet()) {
            System.out.printf("%s\n%s\n\n", notebook.getKey(), notebook.getValue().toString());
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Map<Integer, String> filter = new HashMap<>();
        Map<String, Notebook> result = new LinkedHashMap<>();
        Set<Notebook> notebooks = new HashSet<>();
        Notebook notebook1 = new Notebook("AMD", "1 Tb", "16 Gb", "NVIDIA",
                "Gigabyte");
        Notebook notebook2 = new Notebook("AMD", "2 Tb", "4 Gb", "AMD",
                "MSI");
        Notebook notebook3 = new Notebook("INTEL", "16 Tb", "8 Gb", "NVIDIA",
                "Gigabyte");
        Notebook notebook4 = new Notebook("AMD", "4 Tb", "16 Gb", "NVIDIA",
                "Gigabyte");
        Notebook notebook5 = new Notebook("INTEL", "1 Tb", "16 Gb", "NVIDIA",
                "MSI");
        Notebook notebook6 = new Notebook("AMD", "2 Tb", "32 Gb", "AMD",
                "MSI");
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        Scanner scanner = new Scanner(System.in);
        filter.put(1, "processor");
        filter.put(2, "ram");
        filter.put(3, "hdd");
        filter.put(4, "videoCard");
        filter.put(5, "motherboard");
        Integer choice = enterFilter();
        if (filter.containsKey(choice)) {
            switch (choice) {
                case 1: {
                    System.out.printf("Введите название %s: \n", filter.get(1));
                    System.out.print("Ввод: \n");
                    String input = scanner.next();
                    Notebook.Processor(notebooks, input, result);
                    showResult(result);
                    break;
                }
                case 2: {
                    System.out.printf("Введите название %s : \n", filter.get(2));
                    System.out.print("Ввод: ");
                    String input = scanner.next();
                    Notebook.Ram(notebooks, input, result);
                    showResult(result);
                    break;
                }
                case 3: {
                    System.out.printf("Введите название %s : \n", filter.get(3));
                    System.out.print("Ввод: ");
                    String input = scanner.next();
                    Notebook.Hdd(notebooks, input, result);
                    showResult(result);
                    break;
                }
                case 4: {
                    System.out.printf("Введите название %s : \n", filter.get(4));
                    System.out.print("Ввод: ");
                    String input = scanner.next();
                    Notebook.VideoCard(notebooks, input, result);
                    showResult(result);
                    break;
                }
                case 5: {
                    System.out.printf("Введите название %s : \n", filter.get(5));
                    System.out.print("Ввод: ");
                    String input = scanner.next();
                    Notebook.Motherboard(notebooks, input, result);
                    showResult(result);
                    break;
                }
                default:
                    break;
            }
        }
        scanner.close();

    }
}
