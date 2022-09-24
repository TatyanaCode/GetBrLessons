package day24092022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 24.09.2022 17:59
 */
public class CinemaRun {
    private final String[][] cinemaPlaces;
    private int count;
    private int current;

    public CinemaRun(int rows, int columns) {
        cinemaPlaces = new String[rows][columns];
        count = 0;
        current = 0;
        for (int i = 0; i < rows; i++) { // цикл заполняющий строки и столбцы S символом
            for (int j = 0; j < columns; j++) {
                cinemaPlaces[i][j] = "S";
            }
        }
    }

    public void showTheSits() { // метод отвечающий за вывод строк и столбцов
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

    public void buyTicket() { // метот отвечающий за  считывание и выбор места
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a row number:"); //Введите количество рядов
        int selectedRow = scanner.nextInt();       //scanner.nextInt();// считывает кол.во рядов
        System.out.println("Enter a seat number in that row:");// введите количество мест в каждом ряду
        int selectedColumn = scanner.nextInt();    //scanner.nextInt();//считывает количесвто мест
        if (cinemaPlaces.length < selectedRow || cinemaPlaces[0].length < selectedColumn) {
            System.out.println("Wrong input!");
            return;
        }
        if (cinemaPlaces[selectedRow -1][selectedColumn -1].equals("B")) {
            System.out.println("That ticket has already been purchased!");
            return;
        }
        cinemaPlaces[selectedRow - 1][selectedColumn - 1] = "B";
        count++;
        checkTicketPrice(selectedRow);
    }

    public void checkTicketPrice(int selectedRow) { // метод устанавливающий цену
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
        current += price;
        System.out.println("Ticket price: $" + price);
    }
    public void statistics(){
        //Общая цена
        int columns = cinemaPlaces[0].length;
        int places = cinemaPlaces.length * columns;
        int totalPrice = 0;
        int r2 = cinemaPlaces.length / 2; // количество рядов делим на 2
        if (places < 60) {
            totalPrice = places * 10;
        } else {
            if (cinemaPlaces.length % 2 == 0) {
                totalPrice = columns * r2 * 18;
            } else {
                totalPrice = columns * (r2 * 10 + (r2 + 1) * 8);
            }
        }
        double percent = (double) count / places * 100;
        System.out.println("Number of purchased tickets: " + count);
        System.out.println(String.format("Percentage: %.2f", percent) + "%");
        System.out.println("Current income: $" + current);
        System.out.println("Total income: $" + totalPrice);
    }
}
