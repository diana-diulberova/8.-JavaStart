/* Реализуйте структуру телефонной книги с помощью HashMap,
 учитывая, что 1 человек может иметь несколько телефоновю
 */

package Homework_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1 {
    public static void main (String[] args) {
        Map<Integer, String> person = new HashMap<>();
        Scanner iScanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите номер телефона и фамилию абонента: ");
            String str = iScanner.nextLine();
            String[] arr = str.split(" ");
            person.put(Integer.parseInt(arr[0]), arr[1]);
        }
        System.out.println("Телефонная книга: ");
        for (var element : person.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
        }
        iScanner.close();
    }
}
