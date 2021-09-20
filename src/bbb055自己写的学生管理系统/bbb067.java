package bbb055自己写的学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb067 {
    public static void main(String[] args) {
        ArrayList<bbb066lei> ceshi = new ArrayList<>();
        bbb066lei cs = new bbb066lei();
        Scanner no0 = new Scanner(System.in);
        jm(ceshi);
        int sr = no0.nextInt();
        for (int cishu = 0; sr > 0 && sr < 6; sr = no0.nextInt()) {
            switch (sr) {
                case 1:
                    tj(ceshi);
                    jm(ceshi);
                    break;
                case 2:
                    sc(ceshi);
                    jm(ceshi);
                    break;
                case 3:
                    xg(ceshi);
                    jm(ceshi);
                    break;
                case 4:
                    ck(ceshi);
                    jm(ceshi);
                    break;
                case 5:
                    System.out.println("感谢使用系统");
                    return;
                default:
                    System.out.println("数字错误，程序退出");
                    break;
            }
        }
        System.out.println("程序退出成功");
    }

    public static void jm(ArrayList<bbb066lei> ceshi) {
        Scanner shuru = new Scanner(System.in);
        System.out.println("----------学生管理系统----------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查看所有学生");
        System.out.println("5.退出");
        System.out.println("请输入你的选择：");
        //        int sr=shuru.nextInt();
    }

    //11111111111111111
    public static void tj(ArrayList<bbb066lei> ceshi) {
        Scanner shuru = new Scanner(System.in);
        String srsz = "";
        ////////////这一段不能理解
        while (true) {
            System.out.println("学号数字：");
            srsz = shuru.nextLine();
            boolean falg = cf(ceshi, srsz);
            if (falg) {
                System.out.println("...");
            } else {
                break;
            }
        }
        ////////////这一段不能理解

        System.out.println("学生姓名：");
        String srxm = shuru.nextLine();
        System.out.println("学生年龄：");
        String srxl = shuru.nextLine();
        System.out.println("学生地址：");
        String srdz = shuru.nextLine();
        bbb066lei xs = new bbb066lei(srsz, srxm, srxl, srdz);
        //        bbb066lei x1=xs.getNumber();
        ceshi.add(xs);
        System.out.println(xs);
        System.out.println(ceshi.get(0).getAddress());
    }

    public static boolean cf(ArrayList<bbb066lei> ceshi, String srsz) {
        boolean falg = false;
        for (int x = 0; x < ceshi.size(); x++) {
            bbb066lei x1 = ceshi.get(x);
            if (x1.getNumber().equals(srsz)) {
                System.out.println("学号已经存在，需要重新输入");
                falg = true;
                break;
            } else {
            }
        }
        return falg;
    }

    //2222222222222222
    public static void sc(ArrayList<bbb066lei> ceshi) {
        Scanner shuru = new Scanner(System.in);
        System.out.println("请正确输入学生学号：");
        String sr = shuru.nextLine();
        for (int x = 0; x < ceshi.size(); x++) {
            bbb066lei xs = ceshi.get(x);
            if (xs.getNumber().equals(sr)) {
                System.out.println("发现数据" + xs.getName() + "执行删除");
                ceshi.remove(x);
            } else {
                System.out.println("学号不存在");
            }
        }
        System.out.println("删除执行完毕");
    }

    //333333333333333{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{
    public static void xg(ArrayList<bbb066lei> ceshi) {
        Scanner shuru = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号");
        String sr = shuru.nextLine();
        for (int x = 0; x < ceshi.size(); x++) {
            System.out.println("开始遍历");
            bbb066lei xs = ceshi.get(x);
            if (xs.getNumber().equals(sr)) {
                System.out.println("发现数据" + xs.getName() + "执行修改");
                System.out.println("修改学号为：");
                String srsz = shuru.nextLine();
                xs.setNumber(srsz);
                System.out.println("修改学生姓名为：");
                String srxm = shuru.nextLine();
                xs.setName(srxm);
                System.out.println("修改学生年龄：");
                String srxl = shuru.nextLine();
                xs.setAge(srxl);
                System.out.println("修改学生地址：");
                String srdz = shuru.nextLine();
                xs.setAddress(srdz);
                //太复杂了---------------------
            } else {
                System.out.println("学号不存在");
            }
        }
        System.out.println("修改完成");
    }

    //444444444444444444444444
    public static void ck(ArrayList<bbb066lei> ceshi) {
        Scanner shuru = new Scanner(System.in);
        //        String sr=shuru.nextLine();
        if (ceshi.size() != 0) {
            for (int xx = 0; xx < ceshi.size(); xx++) {
                System.out.println("开始遍历");
                bbb066lei xs = ceshi.get(xx);
                System.out.println(xs.getNumber());
            }
        } else {
            System.out.println("无数据，请先输入学生信息！");
        }
    }


}
