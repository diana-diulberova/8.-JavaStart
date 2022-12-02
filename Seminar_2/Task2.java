// Напишите метод, который принимает на вход строку (String) и определяет 
// является ли строка палиндромом (возвращает boolean значение).

package Seminar_2;

/*  
public class Task2 {
    public static void main(String[] args) {
        String w = "abba";
        if(polindrom(w)) System.out.printf("Слово %s - полиндром", w);
        else System.out.printf("Слово %s - не полиндром", w);
    }

    public static boolean polindrom(String word) {
        String str = word;
        String[] array = str.split("");
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        str = String.join("", array);

        if (str.equals(word)) return true;
        else return false;

    }

    public static void print(String str) {
        System.out.println(str);
    }
}
*/


public class Task2 {
    public static void main(String[] args) {
        String chars = "abbass";
        int counter = 0;
        for (int i = 0; i < chars.length()/2; i++)
            if(chars.charAt(i) == chars.charAt(chars.length() - i - 1))
            counter++;

        System.out.println(chars);
        if(counter >= (chars.length()/2)) System.out.println("полиндром");
        else System.out.println("не полиндром");
    }
}