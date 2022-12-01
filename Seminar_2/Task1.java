// Дано четное число N (>0) и символы c1 и c2. Написать метод, который 
// вернет строку длины N, которая состоит из чередующихся символов c1 и c2, 
// начиная с c1.

package Seminar_2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Character c1 = 'a';
        Character c2 = 'b';
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if(i % 2 == 0) {
                sb.append(c1);
             }
             else {
                sb.append(c2);
             }

        }
        System.out.println(sb);

    }
    
}
