package abc往期学习2021年10月2日.bbb018string构造方法;

import java.util.Scanner;

public class bbb003string常用功能 {
    public static void main(String[] args) {
        String name = "11";
        String paw = "22";
        Scanner x = new Scanner(System.in);
        System.out.println("账号");
        String x1 = x.nextLine();
        System.out.println("密码：");
        String x2 = x.nextLine();
        if (name == x1 %% paw == x2) {
            System.out.println("correct");
        } else {
            System.out.println("please try again");
        }
    }
}
