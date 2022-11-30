// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Homework_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Input n: ");
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();

        int sum = (n*(n+1))/2; //первый вариант вычисления
        
        int sum2 = 0;
        for(int i = 1; i <= n; i++) {
            sum2 = sum2 + i;
        }
        
        int factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial = factorial*i;
        }
        System.out.printf("Треугольное число равно: %d\n", sum);
        System.out.printf("Треугольное число (вариант 2) равно: %d\n", sum2);
        System.out.printf("Факториал равен: %d", factorial);
              
        }
    }