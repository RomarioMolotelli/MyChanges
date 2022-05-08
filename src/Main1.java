
public class Main1 {
    public static void main(String[] args) {
        /*
        System.out.println("go go go");
        System.out.println("Hold this position");
        //intr
        int auf1, auf2, auf3;
        auf1 = 500;
        auf2 = 800;
        auf3 = 400;
        System.out.println("auf1=" + auf1 + " auf2=" + auf2 + " auf3=" + auf3);
        //double
        double auf4;
        auf4 = auf2 / auf3;
        System.out.println("auf4= " + auf4);
        //boolean
        boolean True;
        True = true;
        System.out.println("True= " + true);
        float flopy, flopers;
        flopy = 345.45f;
        flopers = 70.56f;
        System.out.println("flopers= " + flopers + " flopy= " + flopy);
        flopers = flopy * 2;
        System.out.println("flopers= " + flopers);
        long big;
        big = 423522532;
        big = big / 2;
        System.out.println(+big);


        int a = 500, b = 250, c, d, e;
        //математические операции
        c = a + b;
        d = a / b;
        e = (++a) + (++b);
        System.out.println("a+b= " + c + " a/b= " + d + " (++a) + (++b)= " + e);
        //логические операции
        boolean one = true, two = false;
        System.out.println("one = "+one+ "two = "+two+ "one&two= "+(one&two));
        System.out.println("one = "+one+ "two = "+two+ "one|two= "+(one|two));
        System.out.println("one = "+one+ "two = "+two+ "one&two= "+(one^two));
        System.out.println("one = "+one+ "!one= "+ !one);
        //укороченные логические операторы (|| или) (&& и)
        int g = 10; int z = 2;
        if (z != 0 && (g % z)==0)
            System.out.println("z delitel dlya n!");

         */


        int[] ArrayEx2 = new int[20];
        int min = ArrayEx2[0];
        for (int i = 0; i < ArrayEx2.length; i++ ) {
            ArrayEx2[i] = ((int)(Math.random() * 41) - 20);
            if (min > ArrayEx2[i]) {
                min = ArrayEx2[i];
            }
            System.out.println(ArrayEx2[i]);
        }
        System.out.println("minimal number: " + min);




    }

}
