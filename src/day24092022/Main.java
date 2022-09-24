package day24092022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 24.09.2022 18:04
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:"); //Введите количество рядов
        int rows = scanner.nextInt();// считывает кол.во рядов
        System.out.println("Enter the number of seats in each row:");// введите количество мест в каждом ряду
        int columns = scanner.nextInt();//считывает количесвто мест
        CinemaRun cinemaRun = new CinemaRun(rows, columns);
        int selectedValue = -1; // цикл запускающий методы  1.Show the seats 2. Buy a ticket 0. Exit
        while (selectedValue != 0) {
            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            selectedValue = scanner.nextInt();
            switch (selectedValue) {
                case 1:
                    cinemaRun.showTheSits();
                    break;
                case 2:
                    cinemaRun.buyTicket();
                    break;
                case 3:
                    cinemaRun.statistics();
                    break;
            }
        }
    }
}
