package abc往期学习2021年10月2日.aaa001初期学习集合;

import java.util.Arrays;
import java.util.Random;

public class aaa032双色球案例 {
    public static void main(String[] args) {
        int[] x = new int[7];
        show(x);

    }

    public static void show(int[] xx) {
        Random x = new Random();
        for (int i = 0; i < xx.length - 1; i++) {

            int r1 = x.nextInt(33) + 1;
            out:
            for (int ii = 0; ii < xx.length; ii++) {
                if (xx[ii] == r1) {
                    r1 = x.nextInt(33) + 1;
                    break out;
                }
            }
            xx[i] = r1;
            // yn(xx, r1) ? xx[i] = r1 : r1 = x.nextInt(33) + 1;
        }
        int b1 = x.nextInt(16) + 1;
        xx[xx.length - 1] = b1;
        System.out.println(Arrays.toString(xx));
    }

    // 课程写法：
    public static void show2(int[] xx) {
        Random x = new Random();
        for (int i = 0; i < xx.length - 1; i++) {

            while (true) {
                // 为了不重复的数字，需要多次循环
                // 在不知道循环次数的情况下，直接给出一个死循环即可
                int r1 = x.nextInt(33) + 1;
                boolean sin = true;
                for (int i1 = 0; i1 < i; i1++) {
                    if (r1 == xx[i]) {
                        sin = false;
                        break;
                    }
                }
                if (sin) {
                    xx[i] = r1;
                    break;
                    // 完成赋值，直接结束随机数的循环
                }
                // 这里也是需要注意的，
                // 没有必要像下面这样多次判断

                // if (sin == false) {
                //     break;
                // } else {
                //     xx[i] = r1;
                // }
            }
        }
        int b1 = x.nextInt(16) + 1;
        xx[xx.length - 1] = b1;
        System.out.println(Arrays.toString(xx));
    }
}
