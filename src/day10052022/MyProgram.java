package day10052022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 10.08.2022 15:26
 * Вводятся два целых числа k (1 <= k <= 10) и n (0 <= n <= 100). Выведите на экран построчно все числа кратные k от 1 до n включительно.
 */
public class MyProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int count = n / k;
        int i = 1;
        while (i <= count) {
            System.out.println(i * k);
            i++;
        }

    }
}
