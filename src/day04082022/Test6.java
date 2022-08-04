package day04082022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 04.08.2022 14:07
 * <p>
 * Ann watched a health TV program and learned that oversleeping is as bad for your health as not getting enough sleep. She decided to follow TV recommendations and keep track of how many hours she spends sleeping.
 * <p>
 * You are given three numbers: A, B and H. According to TV, one should sleep at least A hours per day, but no more than B hours. H is how many hours Ann sleeps.
 * <p>
 * Task: If Ann sleeps less than A hours, print "Deficiency". If she sleeps more than B hours, print "Excess". If her sleep fits the recommendations, print "Normal".
 * <p>
 * Input format: three numbers A, B, H, where A is always less than or equal to B.
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
