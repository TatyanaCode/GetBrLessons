package day12092022;

/**
 * @author tatyana.danilova 12.09.2022 10:14
 * Прочитайте два положительных целых числа, представляющих количество рядов и мест в каждом ряду, и выведите рассадку,
 * как на первом этапе. Затем прочитайте из ввода два целых числа: номер ряда и номер места в этом ряду. Эти числа представляют собой координаты места,
 * по которым программа должна распечатать цену билета. Цена билета определяется по тем же правилам, что и на предыдущем этапе:
 * Если общее количество мест в кинозале не более 60, то цена каждого билета 10 долларов.
 * В большом зале билеты стоят 10 долларов за переднюю половину рядов и 8 долларов за заднюю половину. Обратите внимание,
 * что количество рядов может быть нечетным, например, 9 рядов. В этом случае первая половина — это первые 4 ряда, а вторая половина — последние 5 рядов.
 * После этого программа должна распечатать все места в кинозале, как показано в примере, и отметить выбранное место Bсимволом. Наконец,
 * он должен напечатать цену билета и остановиться. Обратите внимание, что в этом проекте количество рядов и мест не будет больше 9.
 */
import java.util.Scanner;

public class ArraysCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:"); //Введите количество рядов
        int rows = scanner.nextInt();// считывает кол.во рядов
        System.out.println("Enter the number of seats in each row:"); // введите количество мест в каждом ряду
        int columns = scanner.nextInt();//считывает количесвто мест
        int numbersSeats = rows * columns;// всего мест в зале
        int price = 0;// всего мест в зале
        String[][] cinemaPlaces = new String[rows][columns]; // назначается строчковый массив
        System.out.println();
        System.out.println("Cinema:"); //выведи текст синема
        System.out.print(" ");// выведи пробел
        for (int i = 1; i <= columns; i++) { //до тех пор пока i <=  количества мест в зале( отвечает просто за верхнюю строку )
            System.out.print(" " + i);// прибавь к каждому месту 1 и выведи i
        }
        System.out.println();
        for (int i = 0; i < rows; i++) { // до тех пор пока i <= количетву рядов(Отвечает за столбец)
            System.out.print(i + 1);
            for (int j = 0; j < columns; j++) { // до тех пор пока j < количества мест к j+1( отвечает за строку)
                cinemaPlaces[i][j] = "S";// в строчковый массив загоняются параметры столбца и строки
                System.out.print(" " + cinemaPlaces[i][j]); // выводится заполненный индекс массива с пробелом
            }
            System.out.println();// выведи пустую строку по заверщению цикла
        }
        System.out.println("Enter a row number:");
        int selectedRow = scanner.nextInt();  // создается новая переменная ( отвечает за выбранный ряд)
        System.out.println("Enter a seat number in that row:");
        int selectedColumn = scanner.nextInt();// отвечает за выбранное место
        cinemaPlaces[selectedRow - 1][selectedColumn - 1] = "B"; //  из введенной переменной -1  потому что индекс начинается с 0 (отмечает выбранное место в зале)
        if (numbersSeats < 60) { // если количество мест в зале > 60
            price = 10; // цена 10 баксов
        } else { // иначе
            int r2 = rows / 2; // количество рядов делим на 2
            if (selectedRow > r2) { // если выбранный ряд меньше количество рядов деленое на 2
                price = 8; // то прайс равен 8
            } else {
                price = 10; // иначе прайс 10
            }
        }
        System.out.println("Ticket price: $" + price);
        System.out.print(" ");// выведи пробел
        for (int i = 1; i <= columns; i++) { //до тех пор пока i <=  количества мест в зале( отвечает просто за верхнюю строку )
            System.out.print(" " + i);// прибавь к каждому месту 1 и выведи i
        }
        System.out.println();
        for (int i = 0; i < rows; i++) { // до тех пор пока i <= количетву рядов(Отвечает за столбец)
            System.out.print(i + 1); // выводи индекс ряда
            for (int j = 0; j < columns; j++) { // до тех пор пока j < количества мест прибавляй к индексу мест 1
                System.out.print(" " + cinemaPlaces[i][j]); // выведи массив cinemaPlaces[i][j]
            }
            System.out.println(); // выведи пустую строку
        }
    }
}