// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24. 
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

package Seminar_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println(UnicZnach(GenerateArray(1000, 0, 24)));
    }
    public static Integer[] GenerateArray (int size, int min, int max) {
        Random random = new Random();
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(min, max + 1);
        }
        return arr;
    }
    public static int UnicZnach(Integer[] arr) {
        Set <Integer> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(set);
        return set.size() * 100 / arr.length;
    }
}