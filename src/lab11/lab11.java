package lab11;

import java.util.Arrays;
import java.util.Collections;

//Первая задача закомментирована снимите /*, чтобы проверить
public class lab11 {
    public static void main(String[] args) {
        /*
        //Создайте массив из 20 случайных чисел (числа должны быть в диапазоне от 0 до 1000)
        // и отсортируйте массив по убыванию при помощи сортировки пузырьком.
        int[] ArrayBubble = new int[1000];
        int[] descendingArray = descendingArray(ArrayBubble);
        System.out.print("Array: ");
        for (int item : descendingArray){
            System.out.printf("%d ", item);
        }

         */
        //Создайте массив содержащий марки автомобилей,
        // отсортируйте его сначала по возрастанию, потом по убыванию.
        String[] Marks = new String[]{"Volvo", "Audi", "Lada", "Reno"};
        String[] MarksArray = MarksArray(Marks);
        System.out.println("Array: ");
        for (String i : MarksArray) {
            System.out.printf("%s", i);
        }

    }

    /*
    private static int[] descendingArray(int[] array) {

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
        return array;
    }

     */
    private static String[] MarksArray(String[] arr) {
        Arrays.sort(arr);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + "   ");
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x] + "   ");

        }
        return arr;
    }


}

