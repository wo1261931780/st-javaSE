package bbb049学生对象来自录入;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb053测试类独立完成 {
    public static void main(String[] args) {
        ArrayList<bbb052类独立完成> xx = new ArrayList<>();
        sr(xx);
        sr(xx);
        sr(xx);
        System.out.println("-----------------添加结束");
        for (int x = 0; x < xx.size(); x++) {
            bbb052类独立完成 zz = xx.get(x);
            System.out.println(zz.getName() + zz.getAge());
        }
    }

    public static void sr(ArrayList<bbb052类独立完成> xx) {
        Scanner zz = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String z1 = zz.nextLine();
        System.out.println("请输入年龄：");
        int z2 = zz.nextInt();
        bbb052类独立完成 x1 = new bbb052类独立完成(z1, z2);
        // x1.setName(z1);
        // x1.setAge(z2);
        xx.add(x1);
        System.out.println("添加完成----------------");
    }
}
