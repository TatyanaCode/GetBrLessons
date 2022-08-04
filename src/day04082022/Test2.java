package day04082022;

import java.util.Scanner;
/**
 * Напишите программу, которая считывает значение и проверяет, меньше ли оно 10.
 *
 * Он должен печатать true, если он меньше 10 или falseиначе.
 * */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a < 10);
    }
}
