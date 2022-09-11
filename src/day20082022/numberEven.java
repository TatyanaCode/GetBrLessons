package day20082022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 20.08.2022 10:46
 * Пользователь вводит с клавиатуры натуральное число n. Затем вводит n целых чисел.
 * Необходимо найти и вывести на экран количество чётных.
 */
public class numberEven {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n  = scanner.nextInt();// сканирование числа n
        int k = 0;      //Количество четных чисел
        for (int i = 0 ; i < n; i ++){//  до тех пор пока i<n
            int c = scanner.nextInt(); // сканируй c
            if (c %2 ==0) { // если при делении с остатком с =0 выведи k
                k++;
            }
        }
        System.out.println(k);

    }
}
