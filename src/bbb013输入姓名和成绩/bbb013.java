package bbb013输入姓名和成绩;

import java.util.Scanner;

public class bbb013 {
    Scanner xx = new Scanner(System.in);
    /**
     * String name;
     * int age;
     */
    private int name;
    /**
     * private是前缀，设定变量不可直接访问。
     */
    private int age;

    public void setName(int x1) {
        System.out.println("请输入名称：");
        x1 = xx.nextInt();
        name = x1;
    }

    public void setAge(int a) {//这里的set是固定搭配，会自动显示前面的变量
        if (a < 0 || a > 120) {
            System.out.println("错误数据，请重新输入");
        } else {
            age = a;
        }
    }

    public void show() {
        System.out.println(name + "的成绩是:" + age);
    }
}
