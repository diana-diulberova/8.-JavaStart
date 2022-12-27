// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

package Homework_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Set <Laptop> note = new HashSet<>();
        Random rnd = new Random();

        Laptop note1 = new Laptop(manufacturer(rnd.nextInt(0, 6)));
        note1.setcore(core(rnd.nextInt(0, 5)));
        note1.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note1.setSSD(SSD(rnd.nextInt(0, 5)));
        note1.setOs(os(rnd.nextInt(0, 3)));
        note1.setRAM(RAM(rnd.nextInt(0, 6)));
        note1.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note1);

        Laptop note2 = new Laptop(manufacturer(rnd.nextInt(0, 6)));
        note2.setcore(core(rnd.nextInt(0, 5)));
        note2.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note2.setSSD(SSD(rnd.nextInt(0, 5)));
        note2.setOs(os(rnd.nextInt(0, 3)));
        note2.setRAM(RAM(rnd.nextInt(0, 6)));
        note2.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note2);

        Laptop note3 = new Laptop(manufacturer(rnd.nextInt(0, 6)));
        note3.setcore(core(rnd.nextInt(0, 5)));
        note3.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note3.setSSD(SSD(rnd.nextInt(0, 5)));
        note3.setOs(os(rnd.nextInt(0, 3)));
        note3.setRAM(RAM(rnd.nextInt(0, 6)));
        note3.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note3);

        Laptop note4 = new Laptop(manufacturer(rnd.nextInt(0, 6)));
        note4.setcore(core(rnd.nextInt(0, 5)));
        note4.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note4.setSSD(SSD(rnd.nextInt(0, 5)));
        note4.setOs(os(rnd.nextInt(0, 3)));
        note4.setRAM(RAM(rnd.nextInt(0, 6)));
        note4.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note4);

        Laptop note5 = new Laptop(manufacturer(rnd.nextInt(0, 6)));
        note5.setcore(core(rnd.nextInt(0, 5)));
        note5.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note5.setSSD(SSD(rnd.nextInt(0, 5)));
        note5.setOs(os(rnd.nextInt(0, 3)));
        note5.setRAM(RAM(rnd.nextInt(0, 6)));
        note5.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note5);

        Laptop note6 = new Laptop(manufacturer(rnd.nextInt(0, 6)));
        note6.setcore(core(rnd.nextInt(0, 5)));
        note6.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note6.setSSD(SSD(rnd.nextInt(0, 5)));
        note6.setOs(os(rnd.nextInt(0, 3)));
        note6.setRAM(RAM(rnd.nextInt(0, 6)));
        note6.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note6);

        Laptop note7 = new Laptop(manufacturer(rnd.nextInt(0, 6)));
        note7.setcore(core(rnd.nextInt(0, 5)));
        note7.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note7.setSSD(SSD(rnd.nextInt(0, 5)));
        note7.setOs(os(rnd.nextInt(0, 3)));
        note7.setRAM(RAM(rnd.nextInt(0, 6)));
        note7.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note7);

        Laptop note8 = new Laptop(manufacturer(rnd.nextInt(0, 6)));
        note8.setcore(core(rnd.nextInt(0, 5)));
        note8.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note8.setSSD(SSD(rnd.nextInt(0, 5)));
        note8.setOs(os(rnd.nextInt(0, 3)));
        note8.setRAM(RAM(rnd.nextInt(0, 6)));
        note8.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note8);

        Laptop note9 = new Laptop(manufacturer(rnd.nextInt(0, 6)));
        note9.setcore(core(rnd.nextInt(0, 5)));
        note9.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note9.setSSD(SSD(rnd.nextInt(0, 5)));
        note9.setOs(os(rnd.nextInt(0, 3)));
        note9.setRAM(RAM(rnd.nextInt(0, 6)));
        note9.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note9);

        Laptop note10 = new Laptop(manufacturer(rnd.nextInt(0, 6)));
        note10.setcore(core(rnd.nextInt(0, 5)));
        note10.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note10.setSSD(SSD(rnd.nextInt(0, 5)));
        note10.setOs(os(rnd.nextInt(0, 3)));
        note10.setRAM(RAM(rnd.nextInt(0, 6)));
        note10.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note10);

        for (Laptop item : note) {
            System.out.println(item);
        }

        filter(note);

    }
    public static float diagonal (int x) {
        float[] diagonal = new float[] {10.1f, 11.6f, 12.5f, 13.3f, 14.1f, 15.6f, 17.3f, 18.4f};
        return diagonal[x];
    }
    public static String screenType (int x) {
        String[] screen = new String[] {"TN", "VA", "IPS"};
        return screen[x];
    }
    public static int RAM (int x) {
        int[] RAM = new int[] {2, 4, 8, 16, 32, 64};
        return RAM[x];
    }
    public static int SSD (int x) {
        int[] memory = new int[] {128, 256, 512, 1024, 2048};
        return memory[x];
    }
    public static int core (int x) {
        int[] core = new int[] {2, 4, 5, 6, 8};
        return core[x];
    }
    public static String os (int x) {
        String[] os = new String[] {"Linux", "Windows", "MacOs"};
        return os[x];
    }
    public static String manufacturer (int x) {
        String[] manufacturer = new String[] {"Lenovo", "HP", "Acer", "Dell", "Apple", "ASUS"};
        return manufacturer[x];
    }
    public static void filter (Set <Laptop> note) {
        System.out.println("Введите критерии фильтрации через пробел:\n" + 
                            "1 - диагональ экрана\n" +
                            "2 - тип матрицы дисплея\n" +
                            "3 - объем оперативной памяти\n" +
                            "4 - общий объем твердотельных накопителей\n" +
                            "5 - количество производительных ядер\n" +
                            "6 - операционная система");
        Scanner iScanner = new Scanner(System.in);
        String parametr = iScanner.nextLine();
        String[] filter1 = parametr.split(" ");
        ArrayList <String> morePar = new ArrayList<>();
        for (int i = 0; i < filter1.length; i++) {
            if (Integer.parseInt(filter1[i]) == 1) {
                System.out.println("Введите минимальное значение диагонали экрана в дюймах целым числом (например, 10): ");
                String d = iScanner.nextLine();
                morePar.add(d);
            }
            if (Integer.parseInt(filter1[i]) == 2) {
                System.out.println("Выберите тип матрицы дисплея:\n" +
                                        "1 - TN\n" +
                                        "2 - VA\n" +
                                        "3 - IPS");
                String t = iScanner.nextLine();
                morePar.add(t);
            }
            if (Integer.parseInt(filter1[i]) == 3) {
                System.out.println("Введите минимальное значение объема оперативной памяти в Гб: ");
                String RAM = iScanner.nextLine();
                morePar.add(RAM);
            }
            if (Integer.parseInt(filter1[i]) == 4) {
                System.out.println("Введите минимальное значение общего объема твердотельных накопителей в Гб: ");
                String m = iScanner.nextLine();
                morePar.add(m);
            }
            if (Integer.parseInt(filter1[i]) == 5) {
                System.out.println("Введите количество производительных ядер: ");
                String b = iScanner.nextLine();
                morePar.add(b);
            }
            if (Integer.parseInt(filter1[i]) == 6) {
                System.out.println("Выберите операционную систему:\n" +
                                        "1 - MacOs\n" +
                                        "2 - Linux\n" +
                                        "3 - Windows");
                String os = iScanner.nextLine();
                morePar.add(os);
            }
        } 
        TreeMap <Integer, Integer> par = new TreeMap<>();
        for (int i = 0; i < filter1.length; i++) {
            par.put(Integer.parseInt(filter1[i]), Integer.parseInt(morePar.get(i)));
        }
        System.out.println(par);

        int matrix = 0;
        if(par.get(2) != null) {
            matrix = par.get(2);
        }
        
        int opSys = 0;
        if (par.get(6) != null) {
            opSys = par.get(6);
        }

        float diagonal = 0;
        if (par.get(1) != null) {
            diagonal = (float)par.get(1);
        }

        int r = 0;
        if (par.get(3) != null) {
            r = par.get(3);
        }

        int mem = 0;
        if (par.get(4) != null) {
            mem = par.get(4);
        }

        int b = 0;
        if (par.get(5) != null) {
            b = par.get(5);
        }
        
        Set <Laptop> newLaptop = new HashSet<>();
        for (Laptop item : note) {
            if (item.getDiagonal() >= diagonal && (item.getScreenType() == matrix || matrix == 0)
            && item.getRAM() >= r && item.getSSD() >= mem
            && item.getcore() >= b && (item.getOs() == opSys || opSys == 0)) {
                newLaptop.add(item); 
            }
        }
        for (Laptop item : newLaptop) {
            System.out.println(item);
        }
    }
}