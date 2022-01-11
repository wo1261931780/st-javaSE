package ab往期学习2021年10月2日.bbb018string构造方法;

import java.util.Random;
import java.util.Scanner;

public class bbb005string案例 {
    public static void main(String[] args) {
        // 验证码案例
        // String x = "aA0";
        Random x1 = new Random();
        // int x2 = x1.nextInt(x.length());
        // System.out.println(x2);
        // System.out.println((char) 92);
        // show(x1);
        // login();
        phonenum();
    }

    /**
     * 练习题：使用String完成随机生成5位的验证码。
     */
    public static void show(Random x) {
        String x1 = "";
        for (int i = 0; i < 5; ) {
            int xx = x.nextInt(65) + 48;
            if (xx > 57 && xx < 65 || xx > 91 && xx < 97) {
            } else {
                i++;
                x1 += (char) xx;
            }
        }
        System.out.println(x1);
    }

    /**
     * 练习题：模拟用户登录
     */
    public static void login() {
        // 1、定义正确的登录名称和密码
        String name = "a1";
        String paw = "s1";
        Scanner x = new Scanner(System.in);
        // 2、定义一个循环，循环3次，让用户登录
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入账号：");
            String login_name = x.nextLine();
            System.out.println("请输入密码：");
            String login_paw = x.nextLine();
            if (login_name.equals(name) && login_paw.equals(paw)) {
                System.out.println("correct");
                return;
            }
            System.out.println("错误，剩余" + (2 - i) + "次");
        }
    }

    /**
     * 练习题：手机号码屏蔽
     */
    public static void phonenum() {
        Scanner x = new Scanner(System.in);
        System.out.println("请输入号码：");
        String x1 = x.nextLine();
        if (x1.length() != 11) {
            System.out.println("num error");
        } else {
            // String x2 = x1.substring(3, 8);
            // String x3 = x1.replace(x2, "****");

            String x3 = x1.replace(x1.substring(3, 8), "****");
            System.out.println(x3);
        }
    }

}
