package day11082022;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author tatyana.danilova 11.08.2022 10:37
 * работа с файлами через сканер
 */
public class FileWorkProgram {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Work\\Test\\Test.txt";
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
