// **Текст задачи:**
//  Настроить проект, вывести в консоль “Hello world!”.

// Вывести в консоль системные дату и время.

package Seminar_1;

import java.time.LocalDateTime;

public class Task0 {
    public static void main(String[] args) {

        System.out.println("Hello, world!");

        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println(nowTime);
    }
    
}
