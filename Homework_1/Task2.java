// Вывести все простые числа от 1 до 1000

package Homework_1;

public class Task2 {
    public static void main(String[] args) {
       int number = 1;
       int index = 0;

       for (int i = 0; i < 20; i++) {
        number++;
            for (int j = 1; j < number; j++) {
                if (number % j == 0) index++;
       }
       if (index < 2) System.out.printf("%d ", number);
       index = 0;
       }
    }
}