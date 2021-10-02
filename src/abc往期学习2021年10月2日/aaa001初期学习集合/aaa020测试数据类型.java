package abc往期学习2021年10月2日.aaa001初期学习集合;

import java.util.Scanner;
import java.util.Random;

public class aaa020测试数据类型 {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        Random zz = new Random();
        System.out.println("请输入数字：");
        int x1 = xx.nextInt();
        int z1 = zz.nextInt(1000);
        jo(z1);    //这里调用方法得到的数据，因为形参已经转换了双浮点，所以有小数点
        System.out.println("输入的数据是：" + x1 + ";随机得到的数据是:" + z1);    //这里直接获取的数据是主程序得到的，所以是int类型
    }

    public static void jo(double z1) {
        if (z1 % 2 == 0) {
            System.out.println("方法输出的数据是：" + z1);
        } else {
            System.out.println("方法输出的数据是：" + z1);
        }
    }
}
