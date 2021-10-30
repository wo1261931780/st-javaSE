package abc往期学习2021年10月2日.bbb020输入学校人数;

import java.util.Scanner;

public class bbb021b用户登录标准类 {
    Scanner x0 = new Scanner(System.in);
    Scanner x1 = new Scanner(System.in);
    String name1;
    String pw;
    private String name = "name";
    private String password = "123";

    public bbb021b用户登录标准类() {
        System.out.println("欢迎");
        for (int i = 0; this.name != name1 || this.password != pw; i++) {
            System.out.println("输入账号：");
            name1 = x0.nextLine();
            System.out.println("请输入密码：");
            pw = x1.nextLine();
            if (this.name.equals(name) && this.password.equals(pw)) {
                System.out.println("欢迎");
                break;
            } else {
                System.out.println("账号/密码错误，请重新输入");
            }

        }
        //----------------------------------------------------------------
        // if (this.name.equals(name) && this.password.equals(password)) {
        //     System.out.println("欢迎");
        //     // System.out.println("请输入密码：");
        //     // password = x.nextLine();
        //     // if (this.password.equals(password)) {
        //     //     System.out.println("欢迎");
        //     // } else {
        //     //     System.out.println("密码错误");
        //     // }
        // } else {
        //     System.out.println("错误，程序结束");
        // }
        //----------------------------------------------------------------
    }
}
