package lab12;

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

    }

}
