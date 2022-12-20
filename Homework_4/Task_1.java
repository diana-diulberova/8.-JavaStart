// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет 
// “перевернутый” список.

package Homework_4;

import java.util.LinkedList;
import java.util.logging.SocketHandler;

public class Task_1 {
    public static void main (String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        LinkedList<Integer> ll = new LinkedList<>();

        for (int i = 0; i < numbers.length; i++) {
            ll.add(numbers[i]);
            
        }

        System.out.println(ll);

        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.size()-i + " ");            
        }
    }
}
