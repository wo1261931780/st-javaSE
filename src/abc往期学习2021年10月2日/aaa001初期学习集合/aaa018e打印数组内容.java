package abc往期学习2021年10月2日.aaa001初期学习集合;

import java.util.Scanner;

public class aaa018e打印数组内容 {
    public static void main(String[] args) {
        int[] xx = {11, 22, 33, 44, 55};
        show(xx);
        System.out.println("end");
        Scanner x1=new Scanner(System.in);
        System.out.println("请输入query的数据：");
        int x2 = x1.nextInt();
        System.out.println(show2(xx,x2));
        System.out.println("end");
    }

    public static void show(int[] x) {
        if (x != null && x.length > 0) {
            //这里&&比单个&要高效，
            //&&具有短路效果，左边为假，右边不执行
            System.out.print("数组内容为：");
            for (int i = 0; i < x.length; i++) {
                //     if (i == (x.length - 1)) {
                //         System.out.println(x[i] + "]");
                //     } else {
                //         System.out.print(x[i]+",");
                //     }
                System.out.print(i == x.length - 1 ? x[i] + "]" : x[i] + ",");
            }
        }
    }
    public static int show2(int[] x,int data){// 我直接设置一个对应的数据用来做返回值
        // Scanner x1=new Scanner(System.in);
        // System.out.println("请输入query的数据：");
        // int x2 = x1.nextInt();
        // int xx=-1;
        for (int i = 0; i < x.length; i++) {
            // if (x[i] == x2){
            if (x[i] == data){
                System.out.println("index:"+i);
                // xx=i;
                // break;
                //这里完全不需要break，直接打断就可以。
                //return一个数据，直接就结束了程序
                // 因此上面的xx也不需要定义
                return i;
            }
        }
        // return xx;
        return -1;
    }


}
