package task03;

import java.util.*;

public class task03_01 {

    public static int[] a = { 29, -7, 6, 5, 2, -6, 2, 4, 8, 66 };

    public static void merge(int begin, int end) {
        int mid = (begin + end) / 2;

        int[] t = new int[end - begin + 1];

        int index_1 = begin;

        int index_2 = mid + 1;

        int index_t = 0;

        while ((index_1 <= mid) || (index_2 <= end)) {
            if (index_1 > mid) {
                t[index_t++] = a[index_2++];
                continue;
            }
            if (index_2 > end) {
                t[index_t++] = a[index_1++];
                continue;
            }
            if (a[index_2] > a[index_1]) {
                t[index_t++] = a[index_1++];
                continue;
            } else {
                t[index_t++] = a[index_2++];
                continue;
            }
        }
        for (int i = 0; i < end - begin + 1; i++) {
            a[i + begin] = t[i];
        }
        System.out.println(Arrays.toString(t));
    }

    public static void sort(int start, int finish) {
        System.out.println("Sort " + start + ".." + finish);

        if (start == finish) // выход из рекурсии - массив из 1 элемента отсортирован по определению
            return;

        int mid = (start + finish) / 2; //

        sort(start, mid); // сортировка 1-й половины массива
        sort(mid + 1, finish); // сортировка 2-й половины массива
        merge(start, finish);
    }

    public static void main(String args[]) {
        System.out.print("\033[H\033[2J");
        System.out.println(Arrays.toString(a)); // до сортировки
        sort(0, a.length - 1); // сртировка
        System.out.println(Arrays.toString(a)); // после сортировки
    }
}