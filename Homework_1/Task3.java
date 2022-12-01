// Реализовать простой калькулятор

package Homework_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите знак математической операции: ");
        String operation_sign = iScanner.nextLine();
                
        System.out.print("Введите первое число: ");
        float first_number = iScanner.nextFloat();

        System.out.print("Введите второе число: ");
        float second_number = iScanner.nextFloat();
        
        
        
        if (operation_sign.equals("+")) {
            float result = first_number + second_number;
            System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation_sign, second_number, result);
        }

        else if (operation_sign.equals("-")) {
            float result = first_number - second_number;
            System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation_sign, second_number, result);
        }

        else if (operation_sign.equals("*")) {
            float result = first_number * second_number;
            System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation_sign, second_number, result);
        }

        else if (operation_sign.equals("/")) {
            float result = first_number / second_number;
            System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation_sign, second_number, result);
        }

        else System.out.print("Неверный ввод");

    }
}
