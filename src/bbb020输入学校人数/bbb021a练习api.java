package bbb020输入学校人数;

import java.util.Scanner;

public class bbb021a练习api {
    public static void main(String[] args) {
        System.out.println("练习api");
        Scanner xx = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String x1 = xx.nextLine();
        System.out.println("你输入的字符串为：" + x1);

        char[] s1 = {'a', 'b', 'c'};
        byte[] s2 = {97, 98, 99};
        System.out.println("s1数据为：" + s1);
        // 这里定义的s1和s2都是数组，直接获取只会得到数据的地址
        System.out.println("s2数据为：" + s2);
        System.out.println("---------------------------");
        String a1 = new String(s1);
        // 这里使用a1字符串去接收s1，就会得到s1数组中的所有字符串
        // s1会将数组中的字符串拼接到一起
        String a2 = new String(s2);
        String a3 = "abc";
        System.out.println("s1数据为：" + a1);
        System.out.println("s2数据为：" + a2);
        System.out.println(a3);
    }
}
