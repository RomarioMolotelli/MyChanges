import java.util.Arrays;

public class Lab7 {
    public static void main(String[] args) {
        byte b1;
        try {
            b1 = Byte.parseByte("10");
            System.out.println(b1);

        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки");
        }
        String str1 = "123";
        try {
            byte b2 = Byte.parseByte(str1);
            System.out.println(b2);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки");
        }
        String str2 = "42342";
        byte[] b3 = str2.getBytes();
        System.out.println(Arrays.toString(b3));
        //string to short
        String str3 = "100";
        short x;
        try {
            x = Short.parseShort(str3);
            System.out.println(x);
        } catch (NumberFormatException e) {
            System.out.println("неверный формат строки");
        }


    }


}
