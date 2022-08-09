package day08082022;

/**
 * @author tatyana.danilova 08.08.2022 13:04
 * Следующий код печатает лестницу чисел.
 */
public class Test14 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
 //           System.out.print("i = " + i + ": ");
            for (int j = 0; j < 10; j++) {
                System.out.print(j + " ");
                if (i == j) {
                    break;
                }
            }
            System.out.println();

        }
    }
}
