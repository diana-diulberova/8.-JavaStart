// К калькулятору из предыдущего дз добавить логирование.

package Homework_2;

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task2.class.getName());
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите знак математической операции: ");
        String operation_sign = iScanner.nextLine();
        
        FileHandler fh = new FileHandler("log_task2.xml", true);
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info(operation_sign);

        while (!(operation_sign.equals("+") || operation_sign.equals("-") || operation_sign.equals("/") || operation_sign.equals("*"))) {
            System.out.println("Неверный ввод");    
            operation_sign = iScanner.nextLine();
                logger.info(operation_sign);
        }

        System.out.print("Введите первое число: ");
        float first_number = iScanner.nextFloat();
        logger.info(Float.toString(first_number));

        System.out.print("Введите второе число: ");
        float second_number = iScanner.nextFloat();
        logger.info(Float.toString(second_number));
        
        
        
        if (operation_sign.equals("+")) {
            float result = first_number + second_number;
            System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation_sign, second_number, result);
            logger.info(Float.toString(result));
        }

        else if (operation_sign.equals("-")) {
            float result = first_number - second_number;
            System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation_sign, second_number, result);
            logger.info(Float.toString(result));
        }

        else if (operation_sign.equals("*")) {
            float result = first_number * second_number;
            System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation_sign, second_number, result);
            logger.info(Float.toString(result));
        }

        else if (operation_sign.equals("/")) {
            float result = first_number / second_number;
            System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation_sign, second_number, result);
            logger.info(Float.toString(result));
        }
       
    }
}