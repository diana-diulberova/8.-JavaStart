package Lecture_3;

import java.util.ArrayList;

/*
public class Materials {
    public static void main (String[] args) {
        Object o = 1;
        GetType(o); // java.lang.Integer
        o = 1.2;
        GetType(o); // java.lang.Double
        }
        static void GetType (Object obj) {
        System.out.println(obj.getClass().getName());
        }        
}
*/

/* 
public class Materials {
    public static void main (String[] args) {
        System.out.println(Sum(1, 2)); // 3
        System.out.println(Sum(1.0, 2)); // 0
        System.out.println(Sum(1, 2.0)); // 0
        System.out.println(Sum(1.2, 2.1)); // 3,3
    }
    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double)a + (Double)b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer)a + (Integer)b);
        } else return 0;
    }
}
*/

/* 
public class Materials {
    public static void main (String[] args) {
        int[] a = new int[] {1, 9};
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length);
    
        for (int i : a) {
            System.out.printf("%d", i); // 1 9
            }
            System.out.println();
            for (int j : b) {
            System.out.printf("%d", j); // 190 
            }
        }
}
*/

// public class Materials {
    //     static int[] AddItem (int[] array, int item) {
    //         int length = array.length;
    //         int[] temp = new int[length + 1];
    //         System.arraycopy(array, 0, temp, 0, length);
    //         temp[length] = item;
    //         return temp;
    //     }

    /* 
    public static void main (String[] args) {
        int[] a = new int[] {0, 9};
        for (int i : a) {
        System.out.printf("%d", i); // 0 9
        }
        System.out.println();
        a = AddItem(a, 2);
        a = AddItem(a, 3);
        for (int j : a) {
        System.out.printf("%d", j); // 0 9 2 3
        }
    }
}
*/

// import java.util.List;

// public class Materials {
//     public static void main (String[] args) {
//         ArrayList <Integer> list = new ArrayList <Integer>();
//         // ArrayList list = new ArrayList(); // неявное преобразование (не рекомендуется)
//         list.add(2809);
//         list.add("1234");
//         for (Object o : list) {
//             System.out.println(o); // 2809
//         }
//     }
// }

// Разные способы создания

// ArrayList <Integer> list1 = new ArrayList <Integer>();
// ArrayList <Integer> list2 = new ArrayList <>();
// ArrayList <Integer> list3 = new ArrayList <>(10);
// ArrayList <Integer> list4 = new ArrayList <>(list3);

// import java.util.Arrays;
// import java.util.List;

// public class Materials {
//     public static void main (String[] args) {
//         int day = 29;
//         int month = 9;
//         int year = 1990;
//         Integer[] date = {day, month, year};
//         List <Integer> d = Arrays.asList(date);
//         System.out.println(d); // [29, 9, 1990]
//     }
// }

// import java.util.Arrays;
// import java.util.List;

// public class Materials {
//     public static void main (String[] args) {
//         StringBuilder day = new StringBuilder("28");
//         StringBuilder month = new StringBuilder("9");
//         StringBuilder year = new StringBuilder("1990");
//         StringBuilder[] date = new StringBuilder[]{day, month, year};
//         List <StringBuilder> d = Arrays.asList(date);
//         System.out.println(d); // [29, 9, 1990]
//         date[1] = new StringBuilder("09");
//         System.out.println(d); // [29, 09, 1990]
//     }
// }

// import java.util.List;
// import java.util.ArrayList;

// public class Materials {
//     public static void main (String[] args) {
//         // List <Character> list1 = List.of('O', 'l', 'g', 'a');
//         // System.out.println(list1);
//         // list1.remove(1); // java.lang.UnsupportedOperationException
//         List <Character> list1 = new ArrayList <Character> ();
//         list1.add('O');
//         list1.add('l');
//         list1.add('g');
//         list1.add('a');
//         System.out.println(list1); // [O, l, g, a]
//         list1.remove(1);
//         System.out.println(list1); // [O, g, a]
//     }
// }

import java.util.*;

public class Materials {
    public static void main (String[] args) {
        List <Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item);
        }

        Iterator <Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            System.out.println(col.next());
            // col.next(); //ошибка
            // col.remove(); //ошибка
        }
    }
}