// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package Homework_2;

import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
// Создаю рандомно массив
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(0,100);    
    } 
    System.out.println(Arrays.toString(array));

// Сортирую массив
    bubbleSort(array);
    System.out.println(Arrays.toString(array));
    }

// Метод пузырьковой
    public static void bubbleSort(int [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array [j] = array [j+1];
                    array [j+1] = temp;
                }
                logger (array);
            }
        }
    }
// Лог-файл
    public static void logger (int[] array) {
        StringBuilder arr = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            arr.append(array[i]);
            arr.append(" ");
        }
        try {
            FileWriter log = new FileWriter("log_task1.txt", true);
            log.write(LocalDateTime.now() + " " + arr + "\n");
            log.flush();

        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }

}