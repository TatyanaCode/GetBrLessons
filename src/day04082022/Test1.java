package day04082022;

import java.util.Scanner;

/**
 * Напишите программу, которая считывает числа a, b, c и проверяет, есть ли пара из них, сумма которых равна ровно 20.
 * <p>
 * Программа должна выводить true или false .
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean descOrdered = (a + b) == 20 || (b + c) == 20 || (a + c) == 20;
        System.out.println(descOrdered);
    }
}
