package aaa001初期学习集合;

import java.util.Scanner;

public class aaa005判断奇偶性 {
    public static void main(String[] args) {
        Scanner b11 = new Scanner(System.in);
        System.out.println("请输入数值：");
        int x1 = b11.nextInt();
        //int xx = (x1 % 2);
        if (x1 % 2 == 1) {
            //x1除2的余数等于1
            System.out.println("输入数据：" + x1 + "为奇数");
        } else {
            System.out.println("输入数据：" + x1 + "为偶数");
        }

    }
}
