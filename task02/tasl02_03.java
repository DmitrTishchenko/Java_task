package task02;

import java.util.Scanner;

public class tasl02_03 {

    public static boolean Palindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }

    public static void main(String[] args) {
        // Напишите метод, который принимает на вход строку (String) и определяет
        // является ли строка палиндромом (возвращает boolean значение).
        System.out.print("\033[H\033[2J");
        System.out.println("Введите текст: ");
        Scanner inScanner = new Scanner(System.in);
        String text = inScanner.next();
        inScanner.close();
        System.out.println(Palindrome(text));
    }
}
