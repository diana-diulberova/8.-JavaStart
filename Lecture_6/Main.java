package Lecture_6;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 200;
        w2.id = 2000;

        Worker w3 = new Worker();
        w3.firstName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salary = 300;
        w3.id = 3000;

        System.out.println(w1.toString()); // id:1000 fn:Имя_1 ln:Фамилия_1 s:100
        System.out.println(w2); // id:2000 fn:Имя_2 ln:Фамилия_2 s:200
        System.out.println(w3); // id:3000 fn:Имя_3 ln:Фамилия_3 s:300
        System.out.println(w4); // id:1000 fn:Имя_1 ln:Фамилия_1 s:100

        System.out.println(w1 == w4); // false
        System.out.println(w1.equals(w4)); // true
        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println((workers.contains(w4))); // true

    }
}