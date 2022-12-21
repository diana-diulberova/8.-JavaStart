// Пусть дан список сотрудников (Иванов Иван). Написать программу, которая найдет и выведет повторяющие имена и количество их повторений.
// Отсортировать по убыванию популярности.

package Homework_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class Task_2 {
    public static void main (String[] args) {
        String[] str = {"Иванов Иван", "Иванов Петр", "Петров Петр", "Петров Иван", "Сидоров Петр", "Сидоров Федор"};
        ArrayList <String> people = new ArrayList<>(Arrays.asList(str));
        TreeMap <Integer, String> person = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < people.size(); i++) {
            String[] names = people.get(i).split(" ");
            String name = names[1];
            int count = 0;
            for (int j = 0; j < people.size(); j++) {
                String[] names_1 = people.get(j).split(" ");
                String name_1 = names_1[1];
                if (name.equals(name_1)) {
                    count++;
                }              
            }
            if (!person.containsValue(name));
            person.put(count, name);
        }

        for (var element : person.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue() + "\n");
        }
    }
}
