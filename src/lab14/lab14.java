package lab14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class lab14 {
    public static void main(String[] args) {

        String str1 = new String("nice ass");
        String str2 = "ough you touch my talala";
        String[] str3 = {"t72", "t90", "t14", "t80"};
        for (int i = 0; i < str3.length; i++) {
            Arrays.sort(str3);
            System.out.println(str3[i] + "  ");
        }
        System.out.println();
        for (int j = 0; j < str3.length; j++) {
            Arrays.sort(str3, Collections.reverseOrder());
            System.out.println(str3[j] + "  ");


        }
        System.out.println();
        //Определение количества символов в строке
        String sh = "hi man";
        int len = sh.length();
        System.out.println(len);
        System.out.println();
        //Извлечение символов из строки
        String ih = "Moscow is capital of Russia";
        int ih1 = ih.length()-2;
        char ch = ih.charAt(ih1);
        System.out.println(ch);
        System.out.println();
        //Извлечение подстроки из строки
        String uf = "auf(ten)auf";
        String name = uf.substring(4, uf.length()-4);
        System.out.println(name);
        //Разбиение строк
        System.out.println();
        String isbn = "978-3-16-148410-0";
        String[] isbnParts = isbn.split("-");
        System.out.println("префикс EAN.UCC: " + isbnParts[0]);
        System.out.println("номер регистрационной группы: " + isbnParts[1]);
        System.out.println("номер регистранта: " + isbnParts[2]);
        System.out.println("номер издания: " + isbnParts[3]);
        System.out.println("контрольная цифра: " + isbnParts[4]);
        //Поиск в строке
        System.out.println();
        String cont = "ultimate game";
        Boolean c = cont.contains("mate");
        Boolean c2 = cont.contains("no");
        System.out.println(c);
        System.out.println(c2);
        //Модификация строк
        String str5 = " СИЖУ ЗА РЕШЁТКОЙ В ТЕМНИЦЕ СЫРОЙ ";
        String str4 = " cижу за решёткой в темнице сырой ";
        String compare = String.valueOf((str5.toLowerCase().equals(str4)));
        System.out.println(compare);
        String trip = str4.trim();
        String upper = str4.toUpperCase();
        String lower = str4.toLowerCase();
        String newStr = str4.replace("cижу за решёткой в темнице сырой", "Скормлённый в неволе орёл молодой");
        System.out.println(newStr + "   " + upper + "   " + lower);









    }
}



