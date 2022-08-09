package day08082022;

/**
 * @author tatyana.danilova 08.08.2022 14:54
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i < 3) {
  //              continue;
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.println(j);
                }
            }
        }
    }
}