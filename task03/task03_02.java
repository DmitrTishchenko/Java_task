package task03;

import java.util.ArrayList;
import java.util.Random;

public class task03_02 {
    public static ArrayList<Integer> RemoveEven(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
                i--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        // Пусть дан произвольный список целых чисел, удалить из него четные числа
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
        nums = RemoveEven(nums);
        System.out.println(nums);

    }
}
