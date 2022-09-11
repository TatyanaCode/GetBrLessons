package day05082022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 05.08.2022 14:23
 */
public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int columns = scanner.nextInt();
        int numbersSeats = rows * columns;
        int total = 0;
        if (numbersSeats <= 60) {
            total = numbersSeats * 10;
        } else {
            total = rows/2 * 10 * columns + (rows - rows / 2) * 8 * columns;
        }
        System.out.println("Total income:");
        System.out.println("$" +total);
    }
}
