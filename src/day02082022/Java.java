package day02082022;
/*Твои друзья сказали, что в номере поместится 7 рядов по 8 мест.
Ваша задача — помочь им визуализировать рассадку, распечатав схему на консоли.
 Ваш вывод должен быть таким, как в примере ниже, и должен содержать 9 строк.*/
public class  Java {
    public static void main(String[] args) {
        System.out.println("Cinema:");
        System.out.println("  1 2 3 4 5 6 7 8");
        for (int i = 1; i < 8; i++) {
            System.out.print(i);
            for (int j = 0; j < 8; j++) {
                System.out.print(" S");
            }
            System.out.println();





        }
    }
}
