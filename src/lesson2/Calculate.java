package lesson2;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете оператор (+,-,*,/,%): ");
        char operator = scanner.next().charAt(0);
        System.out.println("Введите первое число: ");
        float x = scanner.nextFloat();
        System.out.println("Введите второе число: ");
        float y = scanner.nextFloat();

        float result;
        switch (operator) {
            default:
                System.out.println("Неверный оператор.");
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                if (y != 0){
                    result = x / y;
                }else {
                    System.out.println("Деление на ноль запрещенно!");
                }
                break;
            case '%':
                result = x % y;
                break;

        }
        System.out.println("Результат: " + result);
        System.out.println("Результат: " + (short)result);
        System.out.println("Результат: " + (byte)result);



    }

}
