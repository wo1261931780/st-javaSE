package ab往期学习2021年10月2日.bbb024遍历统计大小写;

import java.util.Scanner;
//功能：模拟登陆三次，三次错误之后系统退出

public class bbb026用户登录 {
    public static void main(String[] args) {
        String x1 = "1";
        String x2 = "2";
        Scanner xx = new Scanner(System.in);
        //这里是new创建一个新的地址，所以才导致后面的地址比较
        for (int x0 = 0; x0 < 4; x0++) {
            System.out.println("请输入用户名：");
            String x3 = xx.nextLine();
            System.out.println("请输入密码：");
            String x4 = xx.nextLine();

            if (x3.equals(x1) && x4.equals(x2)) {
                System.out.println("欢迎登录内网");
                System.out.println("程序结束");
                break;
            }else if (x0==3){
                System.out.println("机会耗尽，程序结束");
            } else if (x3.equals(x1) == false || x4.equals(x2) == false) {
                System.out.println("用户/密码error,请重新输入,还有" + (3 - x0) + "次机会");
            }
        }
        /*
        String x1 = "1";
        //这里是直接赋值，x1和x2使用相同的地址
        String x2 = "2";
        Scanner xx = new Scanner(System.in);
        //这里是new创建一个新的地址，所以才导致后面的地址比较
        for (int x0 = 0; x0 < 4; x0++) {

            System.out.println("请输入用户名：");
            String x3 = xx.nextLine();
//            int x3=xx.nextInt();
            //这里x3和x4的都是地址比较，需要进行内容比较。
            System.out.println("请输入密码：");
            String x4 = xx.nextLine();
//            int x4 = xx.nextInt();
            System.out.println(x3+"--"+x4);

            if (x3 == x1 || x4 == x2) {
                System.out.println("欢迎登录内网");
                System.out.println("程序结束");
                break;
            } else if (x3 != x1) {
                System.out.println("用户error,请重新输入,还有" + (3 - x0) + "次机会");
            } else if (x4 != x2) {
                System.out.println("密码error,请重新输入,还有" + (3 - x0) + "次机会");
            }
        }
        System.out.println("全部error,程序结束");*/
    }
}
