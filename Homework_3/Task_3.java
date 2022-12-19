// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package Homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int Num = rnd.nextInt(10);
        ArrayList <Integer> intArray = new ArrayList<>(Num);

        for (int i = 0; i < Num; i++) {
            intArray.add(rnd.nextInt(1, 100));
            }
            System.out.println(intArray);

            int minimum = Collections.min(intArray);
            int maximum = Collections.max(intArray);

            int sum = 0;
            for (int i = 0; i < Num; i++) {
                sum += intArray.get(i);
            }
            double average_mean = sum / Num;

            System.out.println("Минимальное значение: " + minimum);
            System.out.println("Максимальное значение: " + maximum);
            System.out.println("Среднее значение: " + average_mean);

    }
    
}
