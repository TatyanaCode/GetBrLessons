package day11092022;
import java.util.Arrays;

/**
 * @author tatyana.danilova 11.09.2022 5:30
 * Создайте массив символов с именами символов с четырьмя элементами «a», «z», «e», «d» и выведите его.
 * Используйте предоставленный шаблон кода.
 */
public class Array {
    public static void main(String[] args) {
        char a = 200;// инициализация переменных типа чар
//        char z = 'z';
//        char e = 'e';
//        char d = 'd';
        char[] characters = new char[4]; // выделение памяти ( объявляется массив)
        characters[0] = 'a';// присваивание значения каждому индексу ( ячейки памяти массива которая выделена)
        characters[1] = 'z';
        characters[2] = 'e';
        characters[3] = 'd';
        System.out.println(Arrays.toString(characters));
        int[] numbers = new int[5];
        numbers[0] = 12;
        numbers[1] = 17;
        numbers[2] = 8;
        numbers[3] = 101;
        numbers[4] = 33;
        System.out.println(Arrays.toString(numbers));

        long[] longNumbers = new long[3];
        longNumbers[0] = 100_000_000_001l;
        longNumbers[1] = 100_000_000_002l;
        longNumbers[2] = 100_000_000_003l;
        System.out.println(Arrays.toString(longNumbers));

    }
}