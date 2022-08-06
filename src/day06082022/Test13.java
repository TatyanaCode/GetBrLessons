package day06082022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 06.08.2022 22:56
 * Напишите программу, которая считывает три положительных целых числа a, b, n и выводит количество чисел, делящихся на n , в диапазоне от a до b (a < b) включительно. *
 * Примечание: эту программу можно написать более эффективно без циклов.
 */
public class Test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int i = 0;
        if (a > b) {
            System.out.println("False");
        } else {
            for (; a <= b; a++) {
                if (a % n == 0) {
                    i++;
                }
            }
        }
        System.out.println(i);
//        int test = a % n == 0 ? b / n - a / n + 1 : b / n - a / n;
    }
}
