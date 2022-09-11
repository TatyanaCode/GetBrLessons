package day05082022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 06.08.2022 0:10
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = 1;
        int i = 1;
        while (n >= b) {
            System.out.println(b);
            i++;
            b = i * i;

        }
    }
}
