package day11082022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 11.08.2022 11:55
 * Программа запрашивает два числа: n и x. Необходимо составить программу,
 * которая будет прибавлять число x само к себе до тех пор, пока сумма не станет больше либо равна n.
 * Выведите полученную сумму.
 */
public class MyProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        {
            int k = 0;
            if (n % x == 0){
                k = n;
            } else {
                int l = n/x;
                k = l * x + x;
            }
            System.out.println(k);
        }
        {
            int k = 0;
            while (k < n) {
                k = k + x;
            }
            System.out.println(k);
        }
    }

}
