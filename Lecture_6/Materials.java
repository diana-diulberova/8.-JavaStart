package Lecture_6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// public class program {
//     public static void main (String[] args) {
//         Set <Integer> set = new HashSet<>();
//         set.add(1);
//         set.add(12);
//         set.add(123);
//         set.add(1234);
//         set.add(1234);
//         System.out.println((set.contains(12))); //true
//         set.add(null);
//         System.out.println(set.size()); // 5
//         System.out.println((set)); // [null, 1, 1234, 123, 12]
//         set.remove(12);
//         for (var item : set) {
//             System.out.println(item); // null 1 1234 123
//         }
//         set.clear();
//         System.out.println(set); // []
//     }
// }


public class Materials {
    public static void main(String[] args) {
        var a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        var b = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17));
        var u = new HashSet<Integer>(a);
        u.addAll(b);
        var r = new HashSet<Integer>(a);
        r.retainAll(b);
        var s = new HashSet<Integer>(a);
        s.removeAll(b);
        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b); // [17, 2, 3, 5, 7, 11, 13]
        System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 7, 11, 13]
        System.out.println(r); // [2, 3, 5, 7]
        System.out.println(s); // [1, 4, 6]
        boolean res = a.addAll(b);
        System.out.println(res); // true
    }
}