package abc往期学习2021年10月2日.aaa001初期学习集合;

import java.util.Scanner;

public class aaa003三元 {
    public static void main(String[] args) {
        // Scanner x=new Scanner(System.in);
        // System.out.println("请输入具体数据：");
        // int x1 = x.nextInt();
        // System.out.println("请输入具体数据：");
        // int x2 = x.nextInt();
        // System.out.println("请输入具体数据：");
        // int x3 = x.nextInt();
        //
        // int max1 = x1 > x2 ? x1 : x2;
        // int max2 = max1 > x3 ? max1 : x3;
        // System.out.println(max2);
        // System.out.println("x1:"+x1+"x2:"+x2+"x3:"+x3);
        show();
    }

    public static void show() {
        int[] x = new int[3];
        for (int i = 0; i < x.length; i++) {
            System.out.println("请输入具体数据：");
            Scanner x1 = new Scanner(System.in);
            // int i1 = x1.nextInt();
            // x[i] = i1;
            x[i] = x1.nextInt();
        }
        int max = 0;
        for (int i = 0; i < x.length; i++) {
            if (i + 1 < x.length) {
                max = x[i] > x[i + 1] ? x[i] : x[i + 1];
            }
        }
        System.out.println(max);

    }
}
