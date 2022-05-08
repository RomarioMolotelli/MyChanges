import java.util.Arrays;

public class lab10 {
    public static void main(String[] args) {
        //Создайте массив, содержащий 10 первых нечетных чисел.
        // Выведете элементы массива на консоль в одну строку, разделяя запятой.
        /*
        int[] ArrayEx1 = new int[10];
        for (int i = 0; i < 10; i++ ){
            ArrayEx1[i] = i;
            if (i % 2 != 0) {
                System.out.println((i+1) + " -th element of array " + ArrayEx1[i]);
            }
        }


        //Дан массив размерности N,
        // найти наименьший элемент массива и вывести на консоль (если наименьших элементов несколько — вывести их все).
        int[] ArrayEx2 = {41, 56, 78, 40, 67};
        int min = ArrayEx2[0];
        for (int i = 0; i < ArrayEx2.length; i++ ) {
            if (min > ArrayEx2[i]) {
                min = ArrayEx2[i];
            }

        }
        System.out.println(min);


        //В массиве из задания 2. найти наибольший элемент.
        int[] ArrayEx3 = {41, 56, 78, 40, 67};
        int min1 = ArrayEx3[0];
        for (int i = 0; i < ArrayEx3.length; i++ ) {
            if (min1 < ArrayEx3[i]) {
                min1 = ArrayEx3[i];
            }

        }
        System.out.println(min1);


        //Поменять наибольший и наименьший элементы массива местами.
        // Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.
        int[] Array = {12, 15, -7, 8};
        int mini = Array[0];
        int max = Array[0];
        int imax = 0, imin = 0, swap;
        System.out.println("Array before change: " + Arrays.toString(Array));
        for (int i = 0; i < Array.length; i++) {
            if (mini > Array[i]) {
                mini = Array[i];
                imin = i;

            }
            if (max < Array[i]) {
                max = Array[i];
                imax = i;
            }


        }
        System.out.println("\nminimal number[" + (imax + 1) + "] = " + Array[imax]);
        System.out.println("maximal number[" + (imin + 1) + "] = " + Array[imin]);
        swap = Array[imin];
        Array[imin] = Array[imax];
        Array[imax] = swap;
        System.out.println("Array after change: " + Arrays.toString(Array));

         */

        int[] ArrayMid = {11, 7, 19, 4};
        double mid = 0;
        if (ArrayMid.length > 0) {
            double sum = 0;
            for (int i = 0; i < ArrayMid.length; i++) {
                sum += ArrayMid[i];


            }
            mid = sum/ArrayMid.length;
        }
        System.out.println("Arifmetic average: " + mid);






    }



}
