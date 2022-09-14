package day14092022;

/**
 * @author tatyana.danilova 14.09.2022 11:41
 * В приведенном ниже шаблоне у вас есть простой калькулятор, который вычитает, суммирует, делит и умножает два числа внутри оператора switch.
 * Теперь мы решили обновить его для выполнения более сложных задач, таких как логарифмические функции. Для этого отдельные методы являются лучшим решением. Начнем с разбора того, что у нас есть.
 * Взгляните на шаблон и разложите операции калькулятора на четыре метода: subtractTwoNumbers(long a, long b)на вычитание, sumTwoNumbers(long a, long b)на сложение,
 * divideTwoNumbers(long a, long b)на целочисленное деление и multiplyTwoNumbers(long a, long b)на умножение. Каждый метод должен печатать результат вычислений.
 * Обратите внимание, что вы не можете делить на ноль. Если ваш второй аргумент равен нулю, вы должны вывести сообщение « Деление на 0! ».
 */


public class MainT {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();

        switch (operator) {
            case "^":
                SimpleCalculator.power(num1, num2);
                break;
            case "+":
                SimpleCalculator.sumTwoNumbers(num1, num2);
                break;
            case "-":
                SimpleCalculator.subtractTwoNumbers(num1, num2);
                break;
            case "/":
                SimpleCalculator.divideTwoNumbers(num1, num2);
                break;
            case "*":
                SimpleCalculator.multiplyTwoNumbers(num1, num2);
                break;
            default:
                break;
        }
    }

    class SimpleCalculator {

        // Implement your methods here
        public static void subtractTwoNumbers(long num1, long num2){ // создание метода который отвечает за вычитание
            long result = num1 - num2;
            System.out.println(result);
        }


        public static void sumTwoNumbers(long num1, long num2){ // создание метода который отвечает за сложение
            long result = num1 + num2;
            System.out.println(result);
        }


        public static void divideTwoNumbers(long num1, long num2){ // создание метода который отвечает за деление
            if (num2 == 0) {
                System.out.println("Division by 0!");
                return;
            }
            long result = num1 / num2;
            System.out.println(result);
        }


        public static void multiplyTwoNumbers(long num1, long num2){ // создание метода который отвечает за умножение
            long result = num1 * num2;
            System.out.println(result);
        }

        // Implemented method
        public static void power(long n, long p) {
            long number = n;
            long power = p;
            long result = 1;
            while (power > 0) {
                if (power % 2 != 0) {
                    result *= number;
                }
                power /= 2;
                number *= number;
            }
            System.out.println(result);
        }
    }
}