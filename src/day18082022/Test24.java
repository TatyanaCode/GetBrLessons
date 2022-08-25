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
        int b = 1;//количество отнимаемых пробелов
        String s = "*";// Вывод символа
        String v = " ";// вывод пробела вместо *

        while (b <= n) { //до тех пор пока количество слоев больше начального слоя
            int c = 1;//считает сколько пробелов ставить, начальное знавение
            while (c <= n - b) {//До тех пор пока количество пробелов меньше или равно
                System.out.print(v);//  введение пробелов
                c++;// + 1 пробел в каждом действии
            }
            System.out.println(s);
            s += "**"; // к выведенному значению с каждым рядом + 2 **
            b++;
        }
    }
}

