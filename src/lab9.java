import java.util.Scanner;

public class lab9 {
    public static void main(String[] args) {
        // При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        /*
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }


        // Дано число n при помощи цикла for посчитать факториал n!
        Scanner scnr = new Scanner(System.in);
        System.out.println("enter factorial");
        int f = scnr.nextInt();
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        System.out.println("Answer: " + result);

        // Даны переменные x и n вычислить x^n.
        Scanner scnr1 = new Scanner(System.in);
        System.out.println("enter numbers");
        int x = scnr1.nextInt();
        int m = scnr1.nextInt();
        double pow = Math.pow(x, m);
        System.out.println("result: " + pow );
         */
        //Вывести 10 первых чисел последовательности 0, -5,-10,-15..
        int j = -1;
        int i = 5;
        while (i >= -100) {
            i = i - 5;
            j++;
            if (j == 10) {
                break;
            }
            System.out.println("result: " + i);


        }


    }
}