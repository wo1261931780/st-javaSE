package ab往期学习2021年10月2日.aaa001初期学习集合;

import java.util.Random;

/**
 * 需求：定义方法实现随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母。
 */
public class aaa028验证码 {
    public static void main(String[] args) {
        System.out.println(show(5));
        System.out.println("end");

    }

    // public static String show() {
    //     String x = "";
    //     for (int i = 0; i < 5; i++) {
    //         x += (char) show2() + "";
    //     }
    //     System.out.println(x);
    //     return x;
    // }
    //
    // public static int show2() {
    //     Random x1 = new Random();
    //     int i = x1.nextInt(3);
    //     if (i == 0) {
    //         int x2 = x1.nextInt(10) + 48;
    //         // 0对应的字符为48-57，
    //         System.out.println((char) x2);
    //         return x2;
    //     } else if (i == 1) {
    //         int x3 = x1.nextInt(26) + 65;
    //         // A对应的字符为65-91，
    //         System.out.println((char) x3);
    //         return x3;
    //     } else {
    //         int x4 = x1.nextInt(26) + 97;
    //         // a对应的字符为97-113。
    //         System.out.println((char) x4);
    //         return x4;
    //     }
    // }
    // 上面相当于我的show2方法调用了五次，所以效率很低

    public static String show(int n) {
        // 方法都是具备返回值的，因为方法的结果后续可能在其他地方被调用
        String x = "";
        Random xx = new Random();
        for (int i = 0; i < n; i++) {
            int x1 = xx.nextInt(3);
            if (x1 == 0) {
                int x2 = xx.nextInt(10) + 48;
                x += (char) x2 + "";
            } else if (x1 == 1) {
                int x2 = xx.nextInt(26) + 65;
                x += (char) x2 + "";
            } else {
                int x2 = xx.nextInt(26) + 97;
                x += (char) x2 + "";
            }
        }
        return x;
    }
}
