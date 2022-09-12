package day04082022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 04.08.2022 14:07
 *  * Энн посмотрела телепрограмму о здоровье и узнала, что пересыпание так же вредно для здоровья, как недосыпание. Она решила следовать рекомендациям телевизора и следить за тем, сколько часов она тратит на сон.*  * <р>
 *  * Вам даны три числа: A, B и H. Согласно телевизору, человек должен спать не менее A часов в сутки, но не более B часов. H — сколько часов спит Энн.*  * <
 *  * Задача: Если Аня спит меньше А часов, выведите «Дефицит». Если она спит больше B часов, выведите «Excess». Если ее сон соответствует рекомендациям, выведите «Нормальный».
 *  * Формат ввода: три числа A, B, H, где A всегда меньше или равно B.
 */
public class Test6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if (a < b) {
            if (a <= h && h <= b) {
                System.out.println("Normal");
            } else if (h < a) {
                System.out.println("Deficiency");
            } else {
                System.out.println("Excess");
            }
        }
    }
}
