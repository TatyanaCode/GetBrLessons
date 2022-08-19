package day18082022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 19.08.2022 10:53
 * Вводятся натуральное число n. Выведите на экран лесенку, состоящую из n ступенек.
 * Каждая i-ая ступенька состоит из i звёздочек.
 */
public class Test23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = 1;//строка
        int c = 0;//столбец
        String s = "*";
        while (n>=b){

            while (b>c) {
                System.out.print(s);
                c++;
            }
            System.out.println();

            c=0;
            b++;
        }
    }
}
