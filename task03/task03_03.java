package task03;

import java.util.ArrayList;
import java.util.Random;

public class task03_03 {
    public static int Min(ArrayList<Integer> nums) {
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (min > nums.get(i)) {
                min = nums.get(i);
            }
        }
        return min;
    }

    public static int Max(ArrayList<Integer> nums) {
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (max < nums.get(i)) {
                max = nums.get(i);
            }
        }
        return max;
    }

    public static float Average(float max, float min) {
        float sum = 0;
        sum = (max + min) / 2;
        return sum;
    }

    public static void main(String[] args) {
        // Задан целочисленный список ArrayList. Найти минимальное, максимальное и
        // среднее ариф. из этого списка
        System.out.print("\033[H\033[2J");
        Random rnd = new Random();
        ArrayList<Integer> nums = new ArrayList<Integer>() {
            {
                for (int i = 0; i < 10; i++) {
                    add(rnd.nextInt(-11, 11));
                }
            }
        };
        System.out.println(nums);
        System.out.printf("Минимальное число = " + Min(nums) + "\n");
        float min = Min(nums);
        System.out.printf("Максимальное число = " + Max(nums) + "\n");
        float max = Max(nums);
        System.out.printf("Среднее ариф. = %.2f", Average(max, min));
    }
}