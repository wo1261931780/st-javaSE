package abc往期学习2021年10月2日.aaa001初期学习集合;

import java.util.Scanner;
import java.util.Random;

public class aaa019输入数据判断奇偶 {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        int x1 = xx.nextInt();
        Random zz = new Random();
        int z1 = zz.nextInt(100);

        System.out.println("开始判断");
        /*max(10);
        boolean xx = max(11);
        System.out.println(xx);
        */
        xs(x1);
        jo(z1);
    }

    //判断奇偶数的方法
    public static boolean max(int yy) {
        if (yy % 2 == 0) {
            return true;
            // System.out.println("偶数");
        } else {
            return false;
            // System.out.println("奇数");
        }
    }

    //加上小数点的方法
    public static double xs(double x1) {
        System.out.println("加上小数点后的数字是：" + x1);
        return x1;
    }

    //判断奇偶数的方法
    public static void jo(int z1) {
        if (z1 % 2 == 0) {
            System.out.println(z1 + "是偶数");
        } else {
            System.out.println(z1 + "是奇数");
        }
    }
}
