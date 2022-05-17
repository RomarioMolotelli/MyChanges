package lab13;

import java.util.Arrays;

public class lab13 {
    public static void main(String[] args) {
        //Дан массив целых чисел, найти среди элементов массива числа, которые делятся на 3 и на 6
        /*
        int[] arr = {6, 4, 12, 9, 8};
        int[] DelArray = DelArray(arr);
        System.out.println("Array: " );
        for (int item : DelArray) {
            System.out.printf("%s", item);
        }
         */
        //Посчитать среднее арифметическое чисел в массиве
        int[] Average = {4, 8, 12, 16, 20};
        int[] AverageArr = AverageArr(Average);
        System.out.println("Array: ");
        for (int item : AverageArr) {
            System.out.printf("%s", item);
        }

    }
    //Дан массив целых чисел, найти среди элементов массива числа, которые делятся на 3 и на 6
    /*
    private static int[] DelArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 3 == 0 && array[j] % 6 == 0 ) {
                System.out.println(array[j] + "   ");
            }
        }
        return array;
    }
     */
    private static int[] AverageArr(int[] Arr) {
        if (Arr.length > 0) {
            double sum = 0;
            for (int j : Arr) {
                sum += j;
            }
            int Aver = (int) (sum/Arr.length);
            System.out.println("average: " + Aver);
        }
        return Arr;
    }
}
