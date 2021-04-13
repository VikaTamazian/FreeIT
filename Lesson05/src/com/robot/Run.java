package com.robot;

import com.robot.hands.SamsungHand;
import com.robot.hands.SonyHand;
import com.robot.hands.ToshibaHand;
import com.robot.hеads.SamsungHead;
import com.robot.hеads.SonyHead;
import com.robot.hеads.ToshibaHead;
import com.robot.legs.SamsungLeg;
import com.robot.legs.SonyLeg;
import com.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        SamsungHead samsungHead = new SamsungHead(500);
        SamsungHand samsungHand = new SamsungHand(100);
        SamsungLeg samsungLeg = new SamsungLeg(110);

        SonyHead sonyHead = new SonyHead(700);
        SonyHand sonyHand = new SonyHand(150);
        SonyLeg sonyLeg = new SonyLeg(160);

        ToshibaHead toshibaHead = new ToshibaHead(900);
        ToshibaHand toshibaHand = new ToshibaHand(75);
        ToshibaLeg toshibaLeg = new ToshibaLeg(85);

        Robot r2d2 = new Robot(toshibaHead, samsungHand, sonyLeg);
        Robot c3po = new Robot(samsungHead, sonyHand, toshibaLeg);
        Robot bb8 = new Robot(sonyHead, toshibaHand, samsungLeg);

        r2d2.action();
        c3po.action();
        bb8.action();

        findMaxPrice(r2d2, c3po, bb8);

    }

    public static void findMaxPrice(Robot r1, Robot r2, Robot r3) {
        if (r1.getPrice() == r2.getPrice() || r1.getPrice() == r3.getPrice() || r2.getPrice() == r3.getPrice()) {
            System.out.println("Стоимость роботов одинаковая. ");
        } else if (r1.getPrice() > r2.getPrice() && r1.getPrice() > r3.getPrice()) {
            System.out.println("У r2d2 самая высокая стоимость " + r1.getPrice());
        } else if (r2.getPrice() > r1.getPrice() && r2.getPrice() > r3.getPrice()) {
            System.out.println("У c3po самая высокая стоимость " + r2.getPrice());
        } else {
            System.out.println("У bb8 самая высокая стоимость " + r3.getPrice());
        }
    }
}