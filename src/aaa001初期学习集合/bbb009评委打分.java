package aaa001初期学习集合;

import java.util.Random;

public class bbb009评委打分 {
    public static void main(String[] args) {
        Random xx = new Random();
        int[] arr = new int[6];
        int x = 0;
        for (System.out.println("start"); x < arr.length; x++) {
            arr[x] = xx.nextInt(100);
            System.out.println("第" + x + "位评委给出的得分是：" + arr[x]);
        }
//        int max=0;
        mm(arr, x);
//        System.out.println("最大值是：");
        //下面是官方的方法-------------------------
        //下面是官方的方法-------------------------
        //下面是官方的方法-------------------------
        /*这里是输入具体分数，计算平均分的方法，但是遍历思想是相同的
        Scanner zz=new Scanner(System.in);
        int z1=zz.nextInt();
        for (int z=0;z< arr.length;z++){
            System.out.println("第"+(z+1)+"个评委的分数是：");//括号里面可以跟对象，但是不能跟代码/命令。
            arr[z]=zz.nextInt();
        }*/
    }

    public static void mm(int[] arr, int x) {
        int mn = 0;
        //这里定义没有问题，如果结果max=0，说明是遍历开始的时候，x就是不正确的数据，导致根本没有进行遍历。
        x = 0;//需要对x进行一次定义。
        int max = arr[x];
        int min = arr[x];
        for (System.out.println("开始对比"); x < arr.length; x++) {
            if (max < arr[x]) {
                max = arr[x];
                mn += arr[x];
            } else if (min > arr[x]) {
                min = arr[x];
                mn += arr[x];
            } else {
                mn += arr[x];
            }
        }
        mn = mn - max - min;
        System.out.println("遍历结束,最大值为：" + max + ".遍历结束,最小值为：" + min);
        //System.out.println("选手得分：" + mn/4);
        //这里改成arr.length-2比较科学
        System.out.println("选手得分是：" + mn / (arr.length - 2));
    }

}
