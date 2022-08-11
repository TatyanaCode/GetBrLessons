package day11082022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 11.08.2022 11:29
 * Пользователь вводит натуральные числа по одному на каждой строке. Когда ему надоедает, то он вводит 0.
 * Найти сумму введенных чисел (0 не считается)
 */
public class Test20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (scanner.hasNext()) {
            int k = scanner.nextInt();
            if (k==0) {
                break;
            }
            i = i + k;
        }
        System.out.println(i);
    }
}
