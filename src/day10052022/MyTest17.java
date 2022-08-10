package day10052022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 10.08.2022 14:34
 * Вводятся два целых числа a и b. Выведите на экран все числа от a до b включительно.
 */
public class MyTest17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b>0)
            while(a<=b){ System.out.println(a); a++;}
        else
            while (a>=b){System.out.println(a);a--;}
    }
}
