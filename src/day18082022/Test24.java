package day18082022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 19.08.2022 12:42
 * Вводятся натуральное число n. Выведите на экран пирамидку, состоящую из n слоёв.
 */
public class Test24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//сканируй количество слоев
        int b = 1;//строка
        String s = "*";
        String v = " ";

        while (b <= n) {
            int c = 1;
            while (c <= n - b)
            {
                System.out.print(" ");
                c++;
            }
            System.out.println(s);
            s += "**";
            b++;
        }
        }
    }

