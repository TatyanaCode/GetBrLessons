package day20082022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 20.08.2022 8:46
 * Пользователь вводит с клавиатуры натуральное число n. Затем вводит n целых чисел. Необходимо найти и вывести на экран их сумму.
 */
public class Sums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();// сканирование числа n
        int b = 0; //считывание количества действий
        int c = 0;//сканированное число
        int sum = 0;// сумма числа
        while (n > b) {// до тех пор пока n>b
            c = scanner.nextInt();//сканируй число с
            sum = sum + c;// и к сумме прибавь с
            b++;// к проделанному действию сделай еще шаг
        }
        System.out.print(sum);// выведи сумму
    }
}
