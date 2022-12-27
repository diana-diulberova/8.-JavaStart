// Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
// а) информационной системой ветеринарной клиники
// б) архивом выставки котов
// в) информационной системой Театра кошек Ю. Д. Куклачёва
// Можно записать в текстовом виде, не обязательно реализовывать в java.

// Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы. Создайте несколько экземпляров этого класса, выведите их в консоль.
// 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).



package Cat;

import java.util.ArrayList;
import java.util.List;

public class Cat {
    private int age;
    private String name;
    private List <String> clinicalRecord;
    private long passport;
    private Doctor doctor;

    public Cat (String name) {
        this.name = name;
        clinicalRecord = new ArrayList<>();
    }

    public void invite () {

    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List <String> getClinicalRecord() {
        return clinicalRecord;
    }

    public void setAge(List <String> clinicalRecord) {
        this.clinicalRecord = clinicalRecord;
    }

    public long getPassport() {
        return passport;
    }

    public void setPassport(long passport) {
        this.passport = passport;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }


    public String toString() {
        return "Cat{" + 
                "age=" + age +
                ", name='" + name + '\'' +
                ", clinicalRecord=" + clinicalRecord +
                ", passport=" + passport +
                ", doctor=" + doctor +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) obj;
        if (this.getName().equals((cat.getName())) && this.passport == cat.getPassport()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int)passport + name.hashCode();
    }
}
