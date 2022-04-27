package ab往期学习2021年10月2日.aaa001初期学习集合;

import java.util.Random;
import java.util.Scanner;

public class aaa023d方法重载的练习 {
    public static void main(String[] args) {
        System.out.println("----------------");
        Scanner xx1 = new Scanner(System.in);
        System.out.println("请输入数据：");
        int xx2 = xx1.nextInt();
        Random xx3 = new Random();
        int xx4 = xx3.nextInt(100);
        int xx = demo1(xx2, xx4);
        System.out.println(xx);
    }

    public static int demo1(int x1, int x2) {
        if (x1 == x2) {
            System.out.println(x1 + "和" + x2 + "的数据相等");
        } else {
            System.out.println(x1 + "和" + x2 + "的数据不相等");
        }
        return x1 + x2;
    }
}
