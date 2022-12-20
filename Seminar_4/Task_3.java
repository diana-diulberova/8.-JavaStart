package Seminar_4;

import java.util.*;

public class Task_3 {
   public static void main (String[] args) {
      String[] base = {"one", "two", "tree", "four", "five"};
      Queue<String> queueArray = new LinkedList<>(Arrays.asList(base));
      Deque<String> dequeArray = new LinkedList<>(Arrays.asList(base));
      System.out.println("Очередь: ");
      while (!queueArray.isEmpty()) {
         System.out.print(queueArray.poll() + " ");
      }
      System.out.println("\nСтек: ");
      while (!dequeArray.isEmpty()) {
         System.out.print(dequeArray.pollLast() + " ");
      }
   } 
}