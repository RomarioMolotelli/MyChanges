package lab12;

import java.util.Arrays;

public class lab12 {
    public static void main(String[] args) {
        //Создайте массив размерностью 5 на 6 и заполните его случайными числами (в диапазоне от 0 до 99 ).
        // Выведите на консоль третью строку
        /*
        int[][] array = new int[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = (int)(Math.random()*99);
                System.out.println(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("3-th string of array ");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println(array[2][j] + "\t");
            }
        }
        System.out.println();
       */
        //Даны матрицы С и D размерностью 3 на 3 и заполненные случайными числами в диапазоне от 0 до 99.
        //Выполните по отдельности сначала сложение,
        //потом умножения матриц друг на друга. Выведете исходные матрицы и результат вычислений на консоль.
        /*
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] mult = new int[3][3];
        int m = arr1.length;
        int n = arr2[0].length;
        int o = arr2.length;
        System.out.println("1 - st array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = (int) (Math.random() * 100);
                System.out.format("%6d ", arr1[i][j]);
            }
        }
        System.out.println();
        System.out.println("2 - nd array: ");
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                arr2[x][y] = (int) (Math.random() * 100);
                System.out.format("%6d ", arr2[x][y]);
            }
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    mult[i][j] = arr1[i][k] * arr2[k][j];

                }
            }
        }
        System.out.println("Multiplication: ");
        for (int i = 0; i < mult.length; i++) {
            for (int j = 0; j < mult.length ; j++ ) {
                System.out.format("%6d ", mult[i][j]);
            }
        }
        System.out.println();

         */
        //Просуммируйте все элементы двумерного массива.
        /*
        int[][] SumArray = {
                {4, 9, 5},
                {7, 4, 8},
                {4, 5, 3}
        };
        int sum = 0;
        for (int i = 0; i < SumArray.length; i++) {
            for (int j = 0; j < SumArray.length; j++ ) {
                sum += SumArray[i][j];
            }
        }
        System.out.println("sum: " + sum);

         */
        //Дан двумерный массив, содержащий отрицательные и положительные числа.
        //Выведете на экран номера тех ячеек массива, которые содержат отрицательные числа.
        /*
        int[][] NegativeArray = {
                {-5, 8, 9},
                {7, -3, 2},
                {-4, -6, 1}

        };
        for (int i = 0; i < NegativeArray.length; i++) {
            for (int j = 0; j < NegativeArray.length; j++) {
                if (i < 0 && j <0) {

                }

            }
        }
         */
        //Отсортируйте элементы в строках двумерного массива по возрастанию
        int[][] Sort = {
                {4, 1, 9},
                {7, 5, 8},
                {2, 6, 3}


        };
        int[][] SortArray = SortArray(Sort);
        System.out.println("Array: ");
        for (int[] item : SortArray) {

            System.out.printf("%s", Arrays.toString(item));

        }

    }

    private static int[][] SortArray(int[][] Arr) {
        for (int[] ints : Arr) {
            Arrays.sort(ints);
            for (int j = 0; j < Arr.length; j++) {
                Arrays.sort(Arr[j]);
                System.out.println(ints[j] + "  ");
            }
        }
        return Arr;

    }


}
