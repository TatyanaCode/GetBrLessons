package day06082022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 06.08.2022 17:29
 * Найдите количество оценок D, C, B и A за последний тест по информатике, где n учеников из класса успешно сдали тест.
 * Программа получает число n в качестве первой строки ввода, а затем получает сами оценки, каждую в новой строке.
 * Программа должна вывести четыре числа в одной строке: количество оценок D, C, B и A (в указанном порядке), разделенных пробелами.
 */
public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfGrades = scanner.nextInt();
        int a =0, b = 0,c = 0,d = 0;
        for (int i = 0; i < numberOfGrades; i++){
            String grades = scanner.next();
            switch (grades) {
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "C":
                    c++;
                    break;
                case "D":
                    d++;
                    break;
                default:
                    break;
            }

        }
        System.out.print(d + " " + c + " " + b + " " + a);
    }
}



