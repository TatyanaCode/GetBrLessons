package day08092022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 08.09.2022 8:00
 * Напишите программу, которая считывает целое число n из стандартного ввода и выводит результат следующего арифметического выражения:
 *((n + 1) * n + 2) * n + 3
 */
public class Calk {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int calk = 1;
        int b = 2;
        int c = 3;
        int res =((n + 1) * n + 2) * n + 3;
        System.out.println( res);
    }
}
