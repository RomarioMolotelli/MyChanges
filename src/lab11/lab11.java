package lab11;

import java.lang.reflect.Array;


public class lab11 {
    public static void main(String[] args) {
        //Создайте массив из 20 случайных чисел (числа должны быть в диапазоне от 0 до 1000)
        // и отсортируйте массив по убыванию при помощи сортировки пузырьком.
        int[] ArrayBubble = new int[1000];
        System.out.printf("Array: ", descendingArray(ArrayBubble));
    }

    private static int descendingArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 1001) - 1000);
            int min = array[i];
            int minix = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minix = j;

                }

            }
            if (i != minix) {
                int x = array[i];
                array[i] = array[minix];
                array[minix]= x;
            }
        }
        return 0;
    }


}

