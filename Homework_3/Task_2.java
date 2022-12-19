// Пусть дан произвольный список целых чисел, удалить из него четные числа

package Homework_3;

import java.util.ArrayList;
import java.util.Random;

public class Task_2 {
    public static void main (String[] args) {
    Random rnd = new Random();
    int Num = rnd.nextInt(10);
    ArrayList <Integer> intList = IntList(Num);
    System.out.println(intList);
    intList = RemoveList(intList);
    System.out.println(intList);
}

public static ArrayList <Integer> IntList (int Num) {
    ArrayList <Integer> intList = new ArrayList <Integer> ();
    Random rnd = new Random();
    int i = 0;
    while (i < Num) {
        intList.add(rnd.nextInt(100));
        i++;
    }
    return intList;
}

public static ArrayList <Integer> RemoveList (ArrayList <Integer> intList) {
    for (int i = 0; i < intList.size(); i++) {
        if(intList.get(i) % 2 == 0) {
            intList.remove(i);
            i = i -1;
            }
        }
    return intList;
    }
}