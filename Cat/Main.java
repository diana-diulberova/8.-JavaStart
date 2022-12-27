// 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
// 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество. 
// 3. Создайте метод public boolean equals(Object o)
// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
// 4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.


package Cat;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        cat1.invite();
        cat1.setAge(10);
        cat1.setPassport(12345);
        cat1.setDoctor(new Doctor("Вася"));
        System.out.println(cat1); // Cat{age=10, name='Барсик', clinicalRecord=[], passport=12345, doctor=Doctor{name='Вася'}}
    
        Cat cat2 = new Cat("Васька");
        Cat cat3 = new Cat("Васька");
        Set <Cat> cats= new HashSet<>();
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats); // [Cat{age=0, name='Васька', clinicalRecord=[], passport=0, doctor=null}]
        System.out.println(cat2.equals(cat3)); // true
    }
}