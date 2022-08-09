package day08082022;

import java.util.Scanner;

/**
 * @author tatyana.danilova 08.08.2022 13:20
 * Автобусный тур по Европе прошел очень успешно.
 * В связи с увеличением количества желающих отправиться в экскурсию турфирма приняла решение увеличить высоту автобуса.
 * Новая высота автобуса составляет ровно N сантиметров.
 * Но маршрут тура проходит под множеством мостов, и есть вероятность, что автобус врежется в один из этих мостов. Можно ли узнать, произойдет ли это?
 * Первая строка ввода содержит высоту автобуса и количество мостов, под которыми проезжает автобус. Вторая строка содержит высоты этих мостов.
 * Вывести «Не будет краха», если все будет в порядке; иначе выведите «Врежется на мосту i » (где i — номер моста), в который врежется автобус.
 * Если высота моста равна высоте автобуса, то автобус разобьется.
 */
public class Test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bus = scanner.nextInt();
        int bridgeCount = scanner.nextInt();
        boolean isNotCrush = true;
        for (int i = 1; i<=bridgeCount;i++){
            int heightBridge = scanner.nextInt();
            if (bus >= heightBridge){
                System.out.println("Crash on the bridge " + i);
                isNotCrush = false;
                break;
            }
        }
        if (isNotCrush) {
            System.out.println("Will not crash");
        }
    }

}

