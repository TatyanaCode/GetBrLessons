package day11082022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 11.08.2022 11:04
 * Пользователь вводит натуральные числа по одному на каждой строке. Когда ему надоедает, то он вводит 0.
 * Найти количество введенных чисел (0 не считается)
 */
public class Test18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (scanner.hasNext()) {
            if (scanner.next().equals("0")) {
                break;
            }
            i++;
        }
        System.out.println("Пользователь ввел " + i + " чисел");


    }
}
