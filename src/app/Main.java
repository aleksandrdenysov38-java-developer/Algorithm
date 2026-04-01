package app;

import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int size = 10;
        int[] array = new int[size];
        Random random = new Random();


        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(50);
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));

        ArrayUtils.mergeSort(array);

        System.out.println("Отсортированный массив: " + Arrays.toString(array));



        int target = array[random.nextInt(size)];
        int index = ArrayUtils.binarySearch(array, target);

        if (index != -1) {
            System.out.println("Число " + target + " найдено по индексу: " + index);
        } else {
            System.out.println("Число не найдено");
        }
    }
}
