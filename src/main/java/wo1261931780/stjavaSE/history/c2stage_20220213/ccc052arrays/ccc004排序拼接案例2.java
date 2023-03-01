package wo1261931780.stjavaSE.history.c2stage_20220213.ccc052arrays;

import java.util.Arrays;
/*
    需求：
        有一个字符串：“91 27 46 38 50”，请写程序实现最终输出结果是：“27 38 46 50 91”

    思路：
        1:定义一个字符串
        2:把字符串中的数字数据存储到一个int类型的数组中
            得到字符串中每一个数字数据？
                public String[] split(String regex)
            定义一个int数组，把 String[] 数组中的每一个元素存储到 int 数组中
                public static int parseInt?(String s)
        3:对 int 数组进行排序
        4:把排序后的int数组中的元素进行拼接得到一个字符串，这里拼接采用StringBuilder来实现
        5:输出结果
 */


import java.util.Arrays;

public class ccc004排序拼接案例2 {
    public static void main(String[] args) {
        // string数组中，空格也会包含在内
        String x = "12 5 456 465 968 65 4 84 8 8 748 48 668";
        // System.out.println(x);
        String[] x1 = x.split(" ");
        // 自动生成string类型的数组
        int[] x2 = new int[x1.length];
        for (int i = 0; i < x1.length; i++) {
            x2[i] = Integer.parseInt(x1[i]);
        }
        Arrays.sort(x2);
        System.out.println("返回的拼接值为：" + orderss(x2));
    }

    public static StringBuilder orderss(int[] x) {
        StringBuilder x1 = new StringBuilder();
        for (int i = 0; i < x.length; i++) {
            if (i == x.length) {
                x1.append(x[i]);
            } else {
                x1.append(x[i]).append(" ");
            }
        }
        return x1;
    }
}
