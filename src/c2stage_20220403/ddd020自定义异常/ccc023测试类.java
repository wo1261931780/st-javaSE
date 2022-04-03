package c2stage_20220403.ddd020自定义异常;

import java.util.Scanner;

public class ccc023测试类 {
    public static void main(String[] args) {
        System.out.println("测试类");
        ccc022对象类 x = new ccc022对象类();
        Scanner x1 = new Scanner(System.in);
        System.out.println("请输入分数：");
        int x2 = x1.nextInt();
        try {
            x.checkscore(x2);
        } catch (ccc021分数异常 e) {
            e.printStackTrace();
        }
    }
}
