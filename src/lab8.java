import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class lab8 {
    public static void main(String[] args) {

        //Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль
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
        //Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.
        ArrayList list = new ArrayList<>();
        list.add(12);
        list.add(21);
        list.add(111);
        list.add(76576);
        list.add(43254);
        System.out.println("Maximum");
        System.out.println(Collections.max(list));
        System.out.println("Minimal");
        System.out.println(Collections.min(list));

        //Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками.
        String name1 = "John";
        String name2 = "John";
        if (name1 == name2) {
            System.out.println("These people are namesake");
        } else {
            System.out.println("these people aren't namesake");
        }


        //Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
        Scanner scnr1 = new Scanner(System.in);
        int Month = scnr1.nextInt();
        String MonthName;
        String TimeYear;
        switch (Month) {
            case 1:
                MonthName = "january";
                TimeYear = "winter";
                break;
            case 2:
                MonthName = "february";
                TimeYear = "winter";
                break;
            case 3:
                MonthName = "March";
                TimeYear = "spring";
                break;
            case 4:
                MonthName = "April";
                TimeYear = "spring";
                break;
            case 5:
                MonthName = "May";
                TimeYear = "spring";
                break;
            case 6:
                MonthName = "june";
                TimeYear = "summer";
                break;
            case 7:
                MonthName = "july";
                TimeYear = "summer";
                break;
            case 8:
                MonthName = "august";
                TimeYear = "summer";
                break;
            case 9:
                MonthName = "september";
                TimeYear = "fall";
                break;
            case 10:
                MonthName = "october";
                TimeYear = "fall";
                break;
            case 11:
                MonthName = "november";
                TimeYear = "winter";
                break;
            case 12:
                MonthName = "december";
                TimeYear = "winter";
                break;

            default:
                MonthName = "are you idiot?";
                TimeYear = "Stupid";
                break;

        }
        System.out.println(MonthName);
        System.out.println(TimeYear);


    }
}
