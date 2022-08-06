package day06082022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 06.08.2022 23:33
 * Fizz Buzz — классическая задача программирования. Вот его немного измененная версия.
 * Напишите программу, которая принимает на вход два целых числа: начало и конец интервала (оба числа принадлежат интервалу).
 * Программа должна вывести числа из этого интервала, но если число делится на 3, вместо него следует вывести Fizz;
 * если число делится на 5, выведите Buzz; а если оно делится и на 3, и на 5, выведите FizzBuzz.
 * Выведите каждое число или слово на отдельной строке.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (; a <= b; a++) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (a % 3 == 0) {
                System.out.println("Fizz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(a);
            }
        }
    }
}
