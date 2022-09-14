package day12092022;
import java.util.Scanner;
/**
 * @author tatyana.danilova 12.09.2022 18:20
 * Напишите простой калькулятор, который считывает из строки три значения: первое число, операцию и второе число.
 *Программа должна применить операцию к введенным числам ("первое число" "операция" "второе число") и вывести результат на экран. Обратите внимание, что числа длинные.
 * Калькулятор должен поддерживать:
 * прибавление: "+"
 * вычитание: "-"
 * целочисленное деление: "/"
 * умножение: "*"
 * Если пользователь выполняет деление и второе число равно 0, необходимо вывести строку «Деление на 0!».
 * Если оператор ввода не указан в списке, программа должна вывести «Неизвестный оператор».
 * Примечание. В решении рекомендуется использовать оператор switch.
 */
public class SwitchCalk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split("\\s+");
        long number1 = Long.parseLong(tokens[0]);
        long number2 = Long.parseLong(tokens[2]);
        char operator = tokens[1].charAt(0);

        switch (operator) {
            case '+':
                System.out.println(number1+number2);
                break;
            case '-':
                System.out.println(number1-number2);
                break;
            case '*':
                System.out.println(number1*number2);
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(number1/number2);
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
