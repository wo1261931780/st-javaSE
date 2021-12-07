package abc往期学习2021年10月2日.aaa001初期学习集合;

import java.util.Random;

public class aaa002三元运算符2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        //定义ab
        //取值最大.
        int dy = a > b ? a : b;
        System.out.println("dy:" + dy);
        System.out.println("------------");

        //是否相等。
        int eq = a == b ? a : b;
        System.out.println("same:" + eq);
        System.out.println("------------");

        //是否小于。
        int xy = a < b ? a : b;

        System.out.println("smaller:" + xy);
        //三元运算符的含义是：
        //int xy = a < b ? a : b;
        //判断(a<b)这个式子的true/false，如果是true，就是(a:b)左边的a，否则就是右边的b
        // 2021年9月6日09:34:16
        // demotest，2021年9月6日09:36:50
        show();

        System.out.println("end");

    }


    public static void show(){
        System.out.println("my method");
        Random x=new Random();
        int i = x.nextInt(200);
        int i1 = i > 100 ? 11 : 22;
        System.out.println(i1);
        System.out.println("end");
    }
}
