// **Текст задачи:**
// В консоли запросить имя пользователя. В зависимости от текущего времени, 
// вывести приветствие вида

// "Доброе утро, <Имя>!", если время от 05:00 до 11:59

// "Добрый день, <Имя>!", если время от 12:00 до 17:59;

// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;

// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

package Seminar_1;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDateTime;

/* public class Task2 {
    public static void main(String[] args) {
        System.out.print("Input name: ");
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.nextLine();
        int nowTime = LocalTime.now().getHour();

    if (nowTime >= 5 && nowTime <12) System.out.printf("Доброе утро, %s", name);
    if (nowTime >= 12 && nowTime <18) System.out.printf("Добрый день, %s", name);
    if (nowTime >= 18 && nowTime <23) System.out.printf("Добрый вечер, %s", name);
    if (nowTime == 23 && nowTime <5) System.out.printf("Доброй ночи, %s", name);
    }
    
}
*/

public class Task2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите свое имя: ");
        String my_name = input.nextLine();
        LocalTime now_time = LocalTime.now();
        LocalTime morning = LocalTime.of(5, 0, 0);
        LocalTime day = LocalTime.of(12, 0, 0);
        LocalTime evening = LocalTime.of(18, 0, 0);
        LocalTime night = LocalTime.of(23, 0, 0);
        if (now_time.isAfter(morning) && now_time.isBefore(day))
            System.out.printf("Доброе утро, %s", my_name);
        if (now_time.isAfter(day) && now_time.isBefore(evening))
            System.out.printf("Добрый день, %s", my_name);
        if (now_time.isAfter(evening) && now_time.isBefore(night))
            System.out.printf("Добрый вечер, %s", my_name);
        if (now_time.isAfter(night) && now_time.isBefore(morning))
            System.out.printf("Доброй ночи, %s", my_name);
    }
}