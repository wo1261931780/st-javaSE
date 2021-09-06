package bbb038未完成的类;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb040测试 {/*
    public static void main(String[] args) {
        ArrayList<bbb040测试> zz = new ArrayList<>();
        nothin(zz);
//        nothin(zz);
//        nothin(zz);
        z1.set(0,"s");
        //java: 不兼容的类型: java.lang.String无法转换为bbb038未完成的类.bbb040测试
        System.out.println("----------------------");
        for (int i = 0; i < zz.size(); i++) {
            System.out.println(zz.get(i));
        }
//        for (int z = 0,x1 = 0,z1=0; z < 3; z++,z1++) {
//            System.out.println(zx.getName()+zx.getAge());
//            zz.set(z,zx);
//        System.out.println("请输入第"+(z+1)+"位同学的姓名：");
//        String x0 = xx.nextLine();
//        System.out.println("请输入第"+(z+1)+"位同学的成绩：");
//        int x1 = xx.nextInt();
//            System.out.println(x2);
//    }
    public static void nothin(ArrayList<bbb040测试> zz) {
        Scanner xx = new Scanner(System.in);
        System.out.println("请输入同学的姓名：");
        String x0 = xx.nextLine();
        System.out.println("请输入第同学的成绩：");
        int x1 = xx.nextInt();
        bbb039 zx = new bbb039(x0, x1);
        System.out.println(zx.getName(x0) + zx.getAge(x1));
        zx.getName(x0);
//        String q=zx.getName(x0);
        zx.getAge(x1);
//        zz.set(0,"1");
//        zz.add("x");
    }*/

    public static void main(String[] args) {
        ArrayList<String> z1 = new ArrayList<>();
        nothing(z1);//这里使用的nothing必须是static修饰的静态方法
        nothing(z1);
        nothing(z1);
        System.out.println(z1);
        for (int i = 0; i < z1.size(); i++) {
            System.out.println(z1.get(i));
        }
    }
    //实现的功能是：
    //输入姓名和成绩，自动显示相关信息
    //arr中储存的是学生姓名+年龄

    public static void nothing(ArrayList<String> z1) {
        Scanner xx = new Scanner(System.in);
        System.out.println("请输入同学的姓名：");
        String x0 = xx.nextLine();
        System.out.println("请输入第同学的成绩：");
        int x1 = xx.nextInt();
        bbb039 zx = new bbb039(x0, x1);
        System.out.println(zx.getName(x0) + zx.getAge(x1));
        String student = ("学生姓名：" + zx.getName(x0) + "，学生年龄：" + zx.getAge(x1));
        z1.add(student);
    }
}

