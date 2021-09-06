package aaa001初期学习集合;

import java.util.Scanner;

public class aaa007switch语句判断季节case {
    public static void main(String[] args) {
        Scanner b11 = new Scanner(System.in);
        System.out.println("输入月份：");
        int xx = b11.nextInt();
        switch (xx) {
            case 1:
            case 2:
            case 3:
                System.out.println("春天");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏季");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋季");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬季");
                break;
            default:
                System.out.println("时间错误，程序结束");
                break;
        }
    }
}
