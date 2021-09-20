package bbb041类和重新学习;

import java.util.Scanner;

public class bbb045学生测试类 {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        System.out.println("请输入学生的姓名:");
        String x1 = xx.nextLine();
        System.out.println("请输入学生的年龄:");
        int x2 = xx.nextInt();
        //-------------------------------------
        //上面和学生类没有太大关系，菜鸡阶段的学习...
        //-------------------------------------
        bbb044学生类 z = new bbb044学生类();
        //000001这里直接无参构造
        //z.bbb044学生类(x1,x2);
        //000002无参构造结束后，必须在这里使用这个方法，才能给z进行赋值。
        //000003这里的不同在于，教材可以直接构造，但是我必须无参构造，然后调用方法
        z.show();
        //000004显示结果
        //z.st(x1,x2);
        bbb044学生类 w = new bbb044学生类("naem", 1);
        //1000001带参数构造
        w.show();
        //1000002这里就可以直接获得结果。
        w.setName("asd");
        //1000003或者间接设定参数值，从而获得结果
        w.setAge(1);
        w.show();
    }
}
