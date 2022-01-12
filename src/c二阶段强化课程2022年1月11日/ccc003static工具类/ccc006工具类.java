package c二阶段强化课程2022年1月11日.ccc003static工具类;

import java.util.Random;

public class ccc006工具类 {
    public static void show(int num) {
        String xx = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random x1 = new Random();
        String x = "";
        for (int i = 0; i < num; i++) {
            int i1 = x1.nextInt(xx.length());
            x += xx.charAt(i1);
        }
        System.out.println(x);
    }
}
