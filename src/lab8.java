import java.util.Scanner;

public class lab8 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter 4 numbers");
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        int num3 = scnr.nextInt();
        int num4 = scnr.nextInt();
        int min1 = Math.min(num1, num2);
        int min2 = Math.min(num3, num4);
        int minFinall = Math.min(min1, min2);
        System.out.println("minimal number: " + minFinall);


    }
}
