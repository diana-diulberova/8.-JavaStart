package Seminar_4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.time.Duration;
import java.time.LocalTime;
import java.util.LinkedList;

public class Task_0 {
    public static void main (String[] args) {
        Deque <Integer> dq = new ArrayDeque<>();
        LinkedList <Integer> linkl = new LinkedList<>();
        ArrayList <Integer> arrayList = new ArrayList<>();
        LocalTime timeStart = LocalTime.now();

        for (int i = 0; i < 1000000; i++) {
            dq.add(i);
        }

        LocalTime timeStop = LocalTime.now();
        Duration diff = Duration.between(timeStart, timeStop);
        System.out.println("Время Deque: " + diff);

        timeStart = LocalTime.now();

        for (int i = 0; i < 1000000; i++) {
            linkl.add(i);
        }

        timeStop = LocalTime.now();
        diff = Duration.between(timeStart, timeStop);
        System.out.println("Время LinkedList: " + diff);

        timeStart = LocalTime.now();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        timeStop = LocalTime.now();
        diff = Duration.between(timeStart, timeStop);
        System.out.println("Время ArrayList: " + diff);
    }
    
}