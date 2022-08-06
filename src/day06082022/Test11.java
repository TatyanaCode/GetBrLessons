package day06082022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 06.08.2022 15:01
 * Для заданного натурального числа n , не превышающего 1_000_000, сгенерируйте последовательность целых чисел, описанную в гипотезе Коллатца:
 * Если n — четное число, разделите его пополам; если оно нечетное, умножьте его на 3 и прибавьте 1 . Повторяем эту операцию, пока не получим в результате цифру 1 .
 * Например, если число n = 17 , то последовательность выглядит следующим образом:
 * 17 52 26 13 40 20 10 5 16 8 4 2 1
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(n);
        do {
            if (n == 1) {
                break;
            }
            if (n % 2 == 0) {
                n = n / 2;
            } else  {
                n = n * 3 + 1;
            }
            System.out.print(" " + n);
        } while (n != 1);
    }


}


