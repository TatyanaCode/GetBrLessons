package day14092022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 14.09.2022 10:41
 */
public class Main {
    public static int sign(int number) {
        if (number == 0) {
            return 0;
        } else if (number > 0) {
            return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}