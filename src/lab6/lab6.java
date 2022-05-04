package lab6;

import java.util.Random;

/*
 *
 * @autor Roman kamianchuk
 * @date 04.05.2022
 */
public class lab6 {
    public static void main(String[] args) {
        //hello world
        System.out.println("hello world");
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world " + random.nextInt(10) + " " + i); //for


        }

    }

}
