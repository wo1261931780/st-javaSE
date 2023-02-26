package c2stage_20220213.ccc052arrays;

import java.util.Arrays;

public class ccc005排序案例3 {
    public static void main(String[] args) {
        System.out.println("-----------------");
        String x = "1 354 15 5 46 854 8 546";
        String[] x1 = x.split(" ");
        //定义一个string的数组x1，x1的元素来自于x，用空格分开。
        int[] x2 = new int[x1.length];
        //定义int类型的数组x2，长度是x1的长度
        for (int i = 0; i < x2.length; i++) {
            x2[i] = Integer.parseInt(x1[i]);
            //利用parse方法，把String格式的x1转化成int类型的x2
            //同时把对应元素储存进去
        }

        for (int i = 0; i < x2.length; i++) {
            System.out.print(x2[i] + "---");
        }
        Arrays.sort(x2);
        //直接对x2进行排序处理
        StringBuilder xx = new StringBuilder();
        //利用StringBuild拼接
        System.out.println("start");
        for (int i = 0; i < x2.length; i++) {
            if (i == x2.length - 1) {
                xx.append(x2[i]);
            } else {
                xx.append(x2[i] + "-");
            }
        }
        System.out.println(xx);
        String xx1 = xx.toString();
        //其实这些转化步骤的作用在于，调用一些String类型无法调用的方法
        System.out.println("123:" + xx1);

    }
}
