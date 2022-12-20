// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - 
// помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди 
// и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

package Homework_4;

import java.util.LinkedList;

public class Task_2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        LinkedList<Object> ll = new LinkedList<>();
        for (int i = 0; i < numbers.length; i++)
            enqueue(ll, i + 1);
        System.out.println(ll);
        System.out.println(dequeue(ll));
        System.out.println(ll);
        System.out.println(first(ll));
    }

    public static void enqueue(LinkedList<Object> queue, Object o) {
        queue.addLast(o);
    }

    public static Object dequeue(LinkedList<Object> queue) {
        return queue.removeFirst();
    }

    public static Object first(LinkedList<Object> queue) {
        return queue.getFirst();
    }
}
