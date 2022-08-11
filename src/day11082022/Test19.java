package day11082022;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author tatyana.danilova 11.08.2022 10:48
 * работа с файлами через сканер
 */
public class Test19 {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Work\\Test\\Test.txt";
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        int i = 0;
        while (scanner.hasNext()) {
            if (scanner.next().equals("0")) {
                break;
            }
            i++;
        }
        System.out.println("Пользователь ввел " + i + " чисел");
    }
}
