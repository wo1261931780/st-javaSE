package ab往期学习2021年10月2日.bbb014输入姓名和成绩;
// 成员变量和局部变量

import java.util.Scanner;

public class bbb013 {
    Scanner xx = new Scanner(System.in);
    int ss = 0;
    // ss属于013这个大类中，show方法以外的变量，一般称为成员变量
    // 成员变量在堆内存中，
    // 下面setname中定义的x1，属于方法中的变量，也算作局部变量
    // 局部变量在栈内存中


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

    //这里的set是固定搭配，会自动显示前面的变量
    public void setAge(int a) {
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
