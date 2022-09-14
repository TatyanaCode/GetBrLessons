package day14092022;
import java.util.Scanner;
import java.util.Arrays;
/**
 * @author tatyana.danilova 14.09.2022 20:06
 * В начале ваша программа должна прочитать два положительных целых числа, которые представляют количество рядов и мест в каждом ряду. Затем он должен распечатать меню со следующими тремя пунктами:
 *Show the seatsдолжен распечатать текущую рассадку. Свободные места должны быть отмечены S символом, а занятые места отмечены B символом.
 * Buy a ticket должен прочитать координаты места из ввода и вывести цену билета, как и на предыдущем этапе. После этого выбранное место должно быть отмечено значком B при вызове пункта Show the seats.
 * Exit следует остановить программу.
 */
public class MenuPlease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:"); //Введите количество рядов
        int rows = scanner.nextInt();// считывает кол.во рядов
        System.out.println("Enter the number of seats in each row:");// введите количество мест в каждом ряду
        int columns = scanner.nextInt();//считывает количесвто мест
        String[][] cinemaPlaces = new String[rows][columns];
        for (int i = 0; i < rows; i++) { // цикл заполняющий строки и столбцы S символом
            for (int j = 0; j < columns; j++) {
                cinemaPlaces[i][j] = "S";
            }
        }
        int selectedValue = -1; // цикл запускающий методы  1.Show the seats 2. Buy a ticket 0. Exit
        while (selectedValue != 0) {
            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");
            selectedValue = scanner.nextInt();
            switch (selectedValue) {
                case 1:
                    showTheSits(cinemaPlaces);
                    break;
                case 2:
                    buyTicket(cinemaPlaces);
                    break;
            }
        }
    }

    private static void showTheSits(String[][] cinemaPlaces) { // метод отвечающий за вывод строк и столбцов
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= cinemaPlaces[0].length; i++) { //до тех пор пока i <=  количества мест в зале( отвечает просто за верхнюю строку )
            System.out.print(" " + i);// прибавь к каждому месту 1 и выведи i
        }
        System.out.println();
        for (int i = 0; i < cinemaPlaces.length; i++) { // до тех пор пока i <= количетву рядов(Отвечает за столбец)
            System.out.print(i + 1); // выводи индекс ряда
            for (int j = 0; j < cinemaPlaces[i].length; j++) { // до тех пор пока j < количества мест прибавляй к индексу мест 1
                System.out.print(" " + cinemaPlaces[i][j]); // выведи массив cinemaPlaces[i][j]
            }
            System.out.println(); // выведи пустую строку
        }
    }

    private static void buyTicket(String[][] cinemaPlaces){ // метот отвечающий за  считывание и выбор места
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a row number:"); //Введите количество рядов
        int selectedRow = scanner.nextInt();       //scanner.nextInt();// считывает кол.во рядов
        System.out.println("Enter a seat number in that row:");// введите количество мест в каждом ряду
        int selectedColumn = scanner.nextInt();    //scanner.nextInt();//считывает количесвто мест
        cinemaPlaces[selectedRow-1][selectedColumn-1] = "B";
        checkTicketPrice(cinemaPlaces, selectedRow);
    }

    private static void checkTicketPrice(String[][] cinemaPlaces, int selectedRow) { // метод устанавливающий цену
        int numbersSeats = cinemaPlaces.length * cinemaPlaces[0].length;// всего мест в зале
        int price = 0;// всего мест в зале
        if (numbersSeats < 60) { // если количество мест в зале > 60
            price = 10; // цена 10 баксов
        } else { // иначе
            int r2 = cinemaPlaces.length / 2; // количество рядов делим на 2
            if (selectedRow > r2) { // если выбранный ряд меньше количество рядов деленое на 2
                price = 8; // то прайс равен 8
            } else {
                price = 10; // иначе прайс 10
            }
        }
        System.out.println("Ticket price: $" + price);
    }

}
