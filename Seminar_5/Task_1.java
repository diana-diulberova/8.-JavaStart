// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

package Seminar_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Map <Integer, String> list = new HashMap<>();
        System.setProperty("console.encoding", "UTF-8"); // Добавили кодировку, чтобы читались русские символы
        System.out.println(System.getProperty("console.encoding"));
        Scanner iScanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите номер паспорта и фамилию "); // Вводим № паспорта и фамилию
            String s = iScanner.nextLine();
            String[] sMas = s.split(" "); // разбиваем строку с номером паспорта и фамилией по пробелу на 2 строки в массиве
            list.put(Integer.parseInt(sMas[0]), sMas[1]); // кладем в массив номер паспорта и фамилию
        }
        for (var el : list.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n"); // распечатываем через get достаем из массива фамилию и номер паспорта
        }
        System.out.println();
        for (var el : list.entrySet()) {
            if(el.getValue().equals("Иванов")) {  // по фамилии достаем из массива данные по нему
                System.out.print(el.getKey() + " " + el.getValue() + "\n"); 
            }
        }
        iScanner.close();
    }
}
