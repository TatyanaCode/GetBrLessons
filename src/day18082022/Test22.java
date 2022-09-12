package day18082022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 18.08.2022 18:02
 * Программа запрашивает натуральное число n. Необходимо составить программу,
 * которая будет считывать целые числа до тех пор, пока их произведение не станет больше либо равна n.
 *  Выведите через пробел количество введенных чисел и их произведение.
 * Примечание: подумайте, что произойдёт, если n равно 1.
 */
public class Test22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = 1;
        int i = 0;
        do {
            int x = scanner.nextInt();
            p = p * x;
            i++;
        }while (p < n);
        System.out.println(i + " " + p);

    }
}
