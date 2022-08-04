package day04082022;

import java.util.Scanner;

/**
 * Напишите программу, которая считывает целочисленное значение и проверяет, меньше ли оно 10 и больше 0.
 * <p>
 * Ваша программа должна вывести логическое значение ( true или false).
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a < 10 && a > 0);


    }
}
