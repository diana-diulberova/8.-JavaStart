package Lecture_1;
import java.lang.ProcessBuilder.Redirect.Type;

// public class program{
//     public static void main(String[] args) {
//         System.out.println("bye, world");
//     }
// }

// нужно всегда что-то класть в начальное значение

// class program
// {
//     public static void main(String[] args) {
//         short age = 10;
//         int salary = 123456;
//         System.out.println(age); //10
//         System.out.println(salary); //123456
//         float e = 2.7f; //использовать суффикс f обязательно для float
//         double pi = 3.1415;
//         System.out.println(e); //2.7
//         System.out.println(pi); // 3.1415
//         char ch = '1';
//         System.out.println(Character.isDigit(ch)); //true
//         ch = 'a';
//         System.out.println(Character.isDigit(ch)); //false
//     }
// }

// public class program{
//     public static void main(String[] args){
//         boolean flag1 = 123 <= 234;
//         System.out.println(flag1); //true
//         boolean flag2 = 123 >= 234 || flag1;
//         System.out.println(flag2); //true
//         boolean flag3 = flag1 ^ flag2; //^ разделительная дизъюнкция
//         System.out.println(flag3); //false
//     }
// }

// неявная типизация var (вспоминай питон) 

// public class program {
//     public static void main(String[] args) {
//         int i = 123; double d = i;
//         System.out.println(i); //123
//         System.out.println(d); //123.0
//         d = 3.1415; i = (int)d;
//         System.out.println(d); //3.1415
//         System.out.println(i); //3
//         d = 3.9415; i = (int)d;
//         System.out.println(d); //3.9415
//         System.out.println(i); //3
//         byte b = Byte.parseByte("123");
//         System.out.println(b); //123
//         //byte b = Byte.parseByte("1234"); // в тип byte можно хранить числа только до 255
//         System.out.println(b); //NumberFormatException: Value out of range
//     }
// }

// классы - обертки
// int --- Integer
// short --- Short
// long --- Long
// byte --- Byte
// float --- Float
// double --- Double
// char --- Character
// boolean --- Boolean

// Операции java
// Присваивание: =
// Арифметические: * / + - % ++ --
// Операции сравнения: < > == != >= <=
// Логические операции : || && ^ !
// Побитовые операции: << >> & | ^

// следить за приоритетами операций ++а а++

// public class program {
//     public static void main(String[] args) {
//         int a = 123;
//         a = --a - a--;
//         System.out.println(a); // 0
//     }
// }

// побитовые сдвиги

// public class program {
//     public static void main(String[] args) {
//         int a = 18; //10010
//         System.out.println(a >> 1); //1001
//     }
// }

// побитовые операции

// public class program {
//     public static void main(String[] args) {
//         // int a = 5;
//         // int b = 2;
//         // System.out.println(a ^ b);
//         //101 |    101 &     101 ^   
//         //010      010       010
//         //111      000       111
//         String s = "qwe1"; // len = 4, index = 0...3
//         //boolean b = s.length() >= 5 && s.charAt(4) == '1';
//         boolean b = s.length() >= 5 & s.charAt(4) == '1';
//         System.out.println(b);
//     }
// }

// Массивы

// public class program{
//     public static void main(String[] args) {
//         int[] arr = new int [10]; // по умолчанию 0 для чисел
//         System.out.println(arr.length); //10

//         arr = new int [] {1, 2, 3, 4, 5};
//         System.out.println(arr.length); //5
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int[] arr[] = new int[3] [5];
//         for (int[] line : arr) {
//             for (int item : line) {
//                 System.out.printf("%d ", item);
//             }
//             System.out.println();
//         }
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int[][] arr = new int[3] [5];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d ", arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }

// нельзя положить массив типа инт в массив типа дабл

// получение данных из терминала

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.println("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }
// }

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
//     }
// }

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt(); // если возможно конвертировать в инт
//         System.out.println(flag);
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//     }
// }

// public class program {
//         public static void main(String[] args) {
//             int a = 1, b = 2;
//             int c = a + b;
//             String res = a + "+" + b + "=" + c;
//             System.out.println(res);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         String s = "qwe";
//         int a = 123;
//         String q = s + a; // неявное преобразование а в строку + s+a во временной строке, итого 4 строки
//         System.out.println((q));
// }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
// }
// }


// Виды спецификаторов

// %d: целочисленные значения
// %x: шестнадцатиричные числа
// %f: числа с плавающей точкой
// %e: числа в экспоненциальной форме (3.1415e+01)
// %c: одиночный символ
// %s: строковые значения

// public class program {
//     public static void main(String[] args) {
//         float pi = 3.1415f;
//         System.out.printf(("%f\n"), pi); //3,141500
//         System.out.printf(("%.2f\n"), pi); //3,14
//         System.out.printf(("%.3f\n"), pi); //3,141
//         System.out.printf(("%e\n"), pi); //3,141500e+00
//         System.out.printf(("%.2e\n"), pi); //3,14e+00
//         System.out.printf(("%.3e\n"), pi); //3,141e+00
//     }
// }

//  public class program {
//     public static void main(String[] args) {
//         {
//             int i = 123;
//             System.out.println(i);
//         }
//         System.out.println(i); //error: cannot find symbol (смотри области определения)
//     }
//  }

// public class program {
//     static void sayHi() {
//         System.out.println("hi!");
//     }
//     static int sum(int a, int b) {
//         return a + b;
//     }
//     static double factor(int n) {
//         if(n == 1) return 1;
//         return n * factor(n - 1);
//     }
//     public static void main(String[] args) {
//         sayHi(); // hi!
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); // 120.0
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c = 0;
//         if(a > b) c = a;
//         if(b > a) c = b;
//         System.out.println(c); //2
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b; //тернарный оператор. Если выполняется условие, то возвращается а, если нет, то вернется б
//         System.out.println(min); //1
//     }
// }

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int mounth: ");
//         int mounth = iScanner.nextInt();
//         String text = "";
//         switch (mounth) {
//             case 10:
//             text = "Autumn";
//             break;
//         default:
//         text = "mistake";
//         break;
//         }
//         System.out.println(text);
//         iScanner.close();
//     }
// }

// цикл while, do while, for

// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         while(value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count); // 3
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         do {
//             value /= 10;
//             count++;
//         } while(value != 0); // постусловие
//         System.out.println(count); // 3
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         for(int i = 0; i < 10; i++) {
//             if(i % 2 == 0) {
//                 continue; // лучше не использовать также как и break
//             }
//             System.out.println(i); // 1 3 5 7 9
//         }
//     }
// }

// public class program {
//         public static void main(String[] args) {
//             for(int i = 0; i < 5; i++) {
//                 for(int j = 0; j < 5; j++) {
//                     System.out.print("* ");
//                 }
//                 System.out.println();
//         }
//     }
// }

// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

// работает только для коллекций
// public class program {
//     public static void main(String[] args) {
//         int arr[] = new int[10];
//         for(int item : arr) {
//             System.out.printf("%d", item);
//         }
//         System.out.println(); //0000000000
//     }
// }

// import java.io.FileWriter;
// import java.io.IOException;
// public class program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) { // false создает новый файл(удалит старый) true дописывает
//             fw.write("line1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line3");
//             fw.flush();
//         } 
//         catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     }
// }

// import java.io.*;
// public class program {
//     public static void main(String[] args) throws Exception {
//         FileReader fr = new FileReader("file.txt");
//         int c;
//         while((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if(ch == '\n') {
//                 System.out.print(ch);
//             }
//             else {
//                 System.out.print(ch);  // line1 2 line3
//             }
//         }
//     }
// }

import java.io.*;
public class task2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str); // == line 1 == == 2 == == line3 ==
        }
        br.close();
    }
}