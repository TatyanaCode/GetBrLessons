package day24092022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 24.09.2022 16:06
 * Теперь ваше меню должно выглядеть так:
 * 1. Show the seats
 * 2. Buy a ticket
 * 3. Statistics
 * 0. Exit
 * Когда элемент Statisticsвыбран, ваша программа должна вывести следующую информацию:
 * количество купленных билетов;
 * Количество купленных билетов представлено в процентах. Проценты должны быть округлены до 2 знаков после запятой;
 * текущий доход;
 * Общий доход, показывающий, сколько денег получит театр, если все билеты будут проданы.
 * Остальные пункты меню должны работать так же, как и раньше, за исключением того, что пункт Buy a ticketне должен позволять пользователю покупать уже купленный билет.
 * Если пользователь выбирает уже занятое место, распечатайте That ticket has already been purchased!и попросите его ввести другие координаты места,
 * пока он не выберет свободное место. Конечно, нельзя допускать, чтобы координаты выходили за пределы допустимого диапазона.
 * Если это произойдет, распечатайте Wrong input!и попросите ввести другие координаты места, пока пользователь не выберет доступное место.
 */
public class CinemaFilter {

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
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            selectedValue = scanner.nextInt();
            switch (selectedValue) {
                case 1:
                    showTheSits(cinemaPlaces);
                    break;
                case 2:
                    buyTicket(cinemaPlaces);
                    break;
                case 3:
                    statistics(cinemaPlaces);
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

    private static void buyTicket(String[][] cinemaPlaces) { // метот отвечающий за  считывание и выбор места
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a row number:"); //Введите количество рядов
            int selectedRow = scanner.nextInt();       //scanner.nextInt();// считывает кол.во рядов
            System.out.println("Enter a seat number in that row:");// введите количество мест в каждом ряду
            int selectedColumn = scanner.nextInt();    //scanner.nextInt();//считывает количесвто мест
            if (cinemaPlaces.length < selectedRow || cinemaPlaces[0].length < selectedColumn) {
                System.out.println("Wrong input!");
                continue;
            }
            if (cinemaPlaces[selectedRow -1][selectedColumn -1].equals("B")) {
                System.out.println("That ticket has already been purchased!");
                continue;
            }
            cinemaPlaces[selectedRow - 1][selectedColumn - 1] = "B";
            checkTicketPrice(cinemaPlaces, selectedRow);
            return;
        }
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
    private static void statistics(String[][] cinemaPlaces){
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
        //Количество купленных билетов
        int count = 0;
        int currentSum = 0;
        for (int i = 0; i < cinemaPlaces.length; i++) {
            for (int j = 0; j < columns; j++) {
                if (cinemaPlaces[i][j].equals("B")) {
                    if (places < 60) {
                        currentSum += 10;
                    } else {
                        if (i < r2) {
                            currentSum += 10;
                        } else {
                            currentSum += 8;
                        }
                    }
                    count++;
                }
            }
        }
        double percent = (double) count / places * 100;
        System.out.println("Number of purchased tickets: " + count);
        System.out.println(String.format("Percentage: %.2f", percent) + "%");
        System.out.println("Current income: $" + currentSum);
        System.out.println("Total income: $" + totalPrice);
    }
}

