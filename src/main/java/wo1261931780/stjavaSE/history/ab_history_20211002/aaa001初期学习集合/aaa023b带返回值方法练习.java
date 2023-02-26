package ab_history_20211002.aaa001初期学习集合;

import java.util.Random;
import java.util.Scanner;

public class aaa023b带返回值方法练习 {
    public static void main(String[] args) {
        System.out.println("------------------");
        //调用方法，输入一个数字，然后把输入的数字返回，将数字存储到xx1中。
        int xx1 = demo2();
        //调用方法，生成随机数，然后把输入的数字xx1放进来，和随机数对比，判断大小
        int xx = demo1(xx1);
        System.out.println("输入数字为：" + xx1);
        System.out.println("随机数为：" + xx);
    }

    public static int demo2() {
        Scanner x1 = new Scanner(System.in);
        System.out.println("请输入数字进行对比：");
        int x3 = x1.nextInt();

        return x3;
    }

    public static int demo1(int xx) {
        Random x2 = new Random();
        int x4 = x2.nextInt(100);
        if (xx <= x4) {
            System.out.println("随机数较大");
        } else {
            System.out.println("随机数较小");
        }
        // xx = x3;
        return x4;
    }
    // 方法注意事项：
    /*
     * 1.不能嵌套定义。
     * 我的demo1和demo2是两个独立的，不能demo1内部有一个demo2
     * 2.void表示没有返回值。
     * public static void demo1(){}，void就是表示不需要返回，int表示需要返回int类型的
     * 3.void可以加return，也可以不加。
     * 如果添加return，后面不添加数据。只能直接return;，如果写return 1;会报错
     */

}
