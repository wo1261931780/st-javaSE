package aaa001初期学习集合;

import java.util.Random;

public class bbb002逢7跳过 {
    public static void main(String[] args) {
        Random b11 = new Random();
        int xx = b11.nextInt(100) + 1;
        int x1 = 1;
        //题目给出的要求

        System.out.println("开始遍历：");
        for (int x2 = 0; x1 < 100; x1++) {
            //为什么要加一个/10%10?
            //原来的式子没有考虑79这种数字，79包含了7
            if (x1 % 10 == 7 || x1 % 7 == 0 || x1 / 10 % 10 == 7) {
                System.out.println("遇到数字：" + x1 + "-----需要过");
                x2++;
                System.out.println(x2);
                /*
            if (x1 % 7 == 0) {
                System.out.println("遇到数字：" + x1 + "-----需要过");
                x2++;
                System.out.println(x2);
            } else if (x1 % 10 == 7) {
                System.out.println("遇到数字：" + x1 + "-----需要过");
                x2++;
                System.out.println(x2);*/
            } else {
            }

        }
        //System.out.println("遍历结束，需要过的概率是："+x2/100+"%");
        //随机一个数字，判断是否需要过。
        System.out.println("随机得到的数字是：" + xx);
        if (xx % 7 == 0) {
            System.out.println("遇到数字：" + xx + "需要-----过");
        } else if (xx % 10 == 7) {
            System.out.println("遇到数字：" + xx + "需要-----过");
        } else {
            System.out.println(xx + "不需要过");
            System.out.println("游戏结束");
        }
    }
}
