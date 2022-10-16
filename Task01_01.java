// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение
// чисел от 1 до n)

import java.util.Scanner;

public class Task01_01 {
    public static int SummNums(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static int MultNums(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите n: ");
        int n = iScanner.nextInt();
        iScanner.close();
        System.out.printf("n-ое треугольное число(сумма чисел от 1 до n) число n = %d,сумма равна: %d\n", n,
                SummNums(n));
        System.out.printf("Факториал числа %d! равен: %d ", n, MultNums(n));
    }
}