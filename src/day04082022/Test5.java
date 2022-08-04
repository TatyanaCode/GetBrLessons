package day04082022;

import java.util.Scanner;

/**
 * Определить, является ли данный год високосным.
 *
 * Напоминаем: високосные годы — это те годы, в которых номер года либо делится на 4, но не делится на 100, либо делится на 400 (например, 2000 год — високосный, а 2100 год високосным не будет год).
 *
 * Программа должна корректно работать для 1900 ≤ n ≤ 3000 лет.
 *
 * Выведите «Високосный» (с учетом регистра), если данный год високосный, и «Обычный» в противном случае.
 *
 * Для решения этой задачи достаточно написать простой условный оператор.
 * */

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int i = 0;

        int yearDivider = 100;
        int yearLeapDivider = 400;
        int divider = 4;
        if (!(year % divider == i) || year % yearDivider == i && !(year % yearLeapDivider == i)) {
            System.out.println("Regular");
        } else {
            System.out.println("Leap");
        }
    }
}
