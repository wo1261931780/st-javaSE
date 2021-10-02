package abc往期学习2021年10月2日.aaa001初期学习集合;

import java.util.Scanner;
import java.util.Random;

public class aaa021输入数据用方法判断大小 {
    public static void main(String[] args) {
        max(10);//mm的值是多少都不重要，最后还是x1和z1进行比较
    }

    public static void max(double mm) {
        Scanner xx = new Scanner(System.in);
        Random zz = new Random();
        System.out.println("请输入比较值：");
        double x1 = xx.nextInt();
        double z1 = zz.nextInt(1000);

        if (x1 > z1) {
            mm = x1;
            System.out.println("较大值为：" + mm);
        } else {
            mm = z1;
            System.out.println("较大值为：" + mm);
        }
    }
}
