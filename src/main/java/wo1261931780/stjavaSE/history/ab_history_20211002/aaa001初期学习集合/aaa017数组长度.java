package wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合;
/*
public class aaa003 {
    public static void main(String[] args) {
        int[] xx = {6543, 12, 1, 65, 423, 132, 45674, 61, 8967, 84, 51, 6};
        int max = xx[0];
        int min = xx[1];
        int x1 = 0;
        for (System.out.println("开始循环："); x1 < xx.length; x1++) {
            if (max < xx[x1]) {
                max = xx[x1];
            } else if (min > xx[x1]) {
                min = xx[x1];
            }
        }
        System.out.println("最小值是：" + min + ";最大值是：" + max);
    }
}
*/

import java.util.Scanner;
import java.util.Random;

public class aaa017数组长度 {
    public static void main(String[] args) {
        //输入一个数字
        Scanner xx = new Scanner(System.in);
        System.out.println("请输入一个数值，数值将参与最值排序：");
        int z0 = xx.nextInt();
        //随机得到一个数字
        Random xr = new Random();
        int z1 = xr.nextInt(1000);
        //把两个数字加入数组
        int[] x1 = {1, 2, 3, z0, z1};
        int[] x2 = new int[5];
        int x = 0;
        //最大值和最小值。
        int max = x1[0];
        int min = x1[0];
        /*
        for(System.out.println("开始排序：");x<x1.length;x++){
            if(min < x1[x]){
                x2[x] = min;
            }else{
                min = x1[x];
                x2[x] = min;
            }
        }代码错误
        */
        for (System.out.println("开始输出："); x < x1.length; x++) {
            if (max < x1[x]) {
                max = x1[x];
            } else if (min > x1[x]) {
                min = x1[x];
            }
        }
        System.out.println("随机值是：" + z1);
        System.out.println("输入值是：" + z0);
        System.out.println("最大值是：" + max);
        System.out.println("最小值是：" + min);
    }
}
