package abc往期学习2021年10月2日.aaa001初期学习集合;

import java.util.Arrays;
import java.util.Random;

public class aaa030评委打分 {
    public static void main(String[] args) {
        System.out.println(show());

    }

    public static int show() {
        Random x = new Random();
        int[] x1 = new int[6];
        // int sum = 0;
        // int max = 0;
        // int min = 0;
        int sum = 0, max = 0, min = 0;
        // 上面三个是一样的，不需要分开定义
        for (int i1 = 0; i1 < x1.length; i1++) {
            int i = x.nextInt(100);
            x1[i1] = i;
            sum += x1[i1];

            max = max > x1[i1] ? max : x1[i1];
            min = min < x1[i1] ? min : x1[i1];
        }
        System.out.println(Arrays.toString(x1));
        // for (int i1 = 0; i1 < x1.length; i1++) {
        //     max = max > x1[i1] ? max : x1[i1];
        //     min = min < x1[i1] ? min : x1[i1];
        // }
        int ave = (sum - max - min) / (x1.length - 2);
        return ave;
    }
}
