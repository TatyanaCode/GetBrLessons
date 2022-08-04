package day04082022;

public class TrueFalse {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        boolean trekking = b1 && (b2 || (b3 || b4));;
        System.out.println(trekking);
    }
}
