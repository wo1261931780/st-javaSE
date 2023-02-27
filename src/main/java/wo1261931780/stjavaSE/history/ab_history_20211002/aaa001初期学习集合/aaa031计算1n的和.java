package wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合;

import java.util.Random;
import java.util.Scanner;

public class aaa031计算1n的和 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("type in");
        int x1 = x.nextInt();
        System.out.println(show(x1));
        System.out.println(show2(x1));
        System.out.println("end");
        int[] xx = new int[5];
        show4(show3(xx));
    }

    public static int show(int x1) {
        int i1 = 0;
        for (int i = 0; i <= x1; i++) {
            i1 += i;
        }
        return i1;
    }

    public static String show2(int x1) {
        String x2;
        if (x1 % 2 == 0 & x1 != 0) {
            x2 = "偶数";
        } else if (x1 == 0) {
            x2 = "错误";
        } else {
            x2 = "奇数";
        }
        return x2;
    }

    public static int[] show3(int[] xx) {
        Random x = new Random();
        for (int i = 0; i < 5; i++) {
            xx[i] = x.nextInt(100);
        }
        return xx;
    }

    public static void show4(int[] xx) {
        int max = 0;
        int min = 0;

        for (int i = 0; i < xx.length; i++) {
//  if (max < xx[i]) {
//      max = xx[i ];
//  } else if (min > xx[i]) {
//      min = xx[i];
//  }
            System.out.println(xx[i]);
            max = max < xx[i] ? xx[i] : max;
            min = min > xx[i] ? xx[i] : min;
        }
        // return不能返回多个数据
//        return max+min;
        System.out.println("--------");
        System.out.println(max);
        System.out.println(min);
    }

}
