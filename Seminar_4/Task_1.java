// /*  Реализовать консольное приложение, которое:

// 1. Принимает от пользователя строку вида

// text~num

// 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// 2. Если введено print~num, выводит строку из позиции num в связном списке и 
// удаляет её из списка.
// </aside>

package Seminar_4;

import java.util.Scanner;
import java.util.LinkedList;

public class Task_1 {
    public static void main (String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = iScanner.nextLine();

        String[] strings = strings(str);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        LinkedList<String> ll = new LinkedList<>();

        int ind = Integer.parseInt(strings[1]);
        for (int i = 0; i < ind+1; i++) {
            ll.add("Строка " + i);
        }

        if (strings[0].equals("print")) {
            System.out.println(ll.remove(ind));
        } else {
            ll.add(ind, strings[0]);
        }

        System.out.println(ll);
    }

    public static String[] strings (String str) {
        String[] strings = str.split("~");
        return strings;
    }
}
