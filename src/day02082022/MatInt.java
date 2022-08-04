package day02082022;

public class MatInt {
    public static void main(String[] args) {
        int a = 4, b = 6;
        int c = a + b;
        int result = c + (a + b) * c;
        System.out.println(result);

        int number = 12241;
        int digit = ((number % 100) / 10) % 10;
        System.out.println(digit);
    }

}
