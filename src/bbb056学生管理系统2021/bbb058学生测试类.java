package bbb056学生管理系统2021;


import java.util.ArrayList;
import java.util.Scanner;

public class bbb058学生测试类 {
    public static void main(String[] args) {
        // System.out.println("--------------");
        // Scanner x = new Scanner(System.in);
        // int x1 = x.nextInt();
        // def();
        ArrayList<bbb057学生类> xx1 = new ArrayList<>();
        // switch (def()) {
        //     case 1:
        //         adds(xx1);
        //         def();
        //         break;
        //     case 2:
        //         del(xx1);
        //         def();
        //         break;
        //     case 3:
        //         changeme(xx1);
        //         def();
        //         break;
        //     case 4:
        //         showme(xx1);
        //         def();
        //         break;
        //     case 5:
        //         quits();
        //         break;
        //     default:
        //         def();
        // }
        for (int i = 1; i > 0 && i < 5; ) {
            // def();
            // System.out.println("***");
            i = def();
            if (i == 1) {
                adds(xx1);
            } else if (i == 2) {
                del(xx1);
            } else if (i == 3) {
                changeme(xx1);
            } else if (i == 4) {
                showme(xx1);
            } else if (i == 5) {
                // quits();
            } else {
            }
        }
        System.out.println("程序结束");
    }

    // 管理界面
    public static int def() {
        System.out.println("-----------------欢迎来到学生管理系统-----------------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查看所有学生");
        System.out.println("5.退出");
        System.out.println("请输入你的选择：");
        Scanner x = new Scanner(System.in);
        int x1 = x.nextInt();
        if (x1 < 0 || x1 > 6) {
            System.out.println("错误代码，程序退出");
        }
        return x1;
    }

    // 添加方法
    public static void adds(ArrayList<bbb057学生类> xx1) {
        Scanner x0 = new Scanner(System.in);
        Scanner x1 = new Scanner(System.in);
        Scanner x2 = new Scanner(System.in);
        Scanner x3 = new Scanner(System.in);
        bbb057学生类 a1 = new bbb057学生类();
        System.out.println("请输入学号：");
        int nun = x0.nextInt();
        a1.setNun(nun);
        System.out.println("请输入姓名：");
        String xname = x1.nextLine();
        a1.setName(xname);
        System.out.println("请输入年龄：");
        int xage = x2.nextInt();
        a1.setAge(xage);
        System.out.println("请输入居住地：");
        String xcity = x3.nextLine();
        a1.setCity(xcity);
        xx1.add(a1);
        System.out.println("添加结束------------------");
    }

    // 删除方法
    public static void del(ArrayList<bbb057学生类> xx1) {
        Scanner x = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        int x1 = x.nextInt();
        for (int i = 0; i < xx1.size(); i++) {
            bbb057学生类 x2 = xx1.get(i);
            if (x1 == x2.getNun()) {
                xx1.remove(i);
                System.out.println("找到账号，执行删除操作");
                break;
            }
        }
        System.out.println("搜索结束");

    }

    // 修改方法
    public static void changeme(ArrayList<bbb057学生类> xx1) {
        Scanner xx0 = new Scanner(System.in);
        Scanner xx2 = new Scanner(System.in);
        Scanner xx3 = new Scanner(System.in);
        Scanner xx4 = new Scanner(System.in);
        System.out.println("请输入学号：");
        int x1 = xx0.nextInt();
        for (int i = 0; i < xx1.size(); i++) {
            if (x1 == xx1.get(i).getNun()) {
                System.out.println("请重新输入姓名");
                String x2 = xx2.nextLine();
                xx1.get(i).setName(x2);
                System.out.println("请重新输入年龄");
                int x3 = xx3.nextInt();
                xx1.get(i).setAge(x3);
                System.out.println("请重新输入居住地");
                String x4 = xx4.nextLine();
                xx1.get(i).setCity(x4);
                System.out.println("修改成功,回到首页");
            }
        }
        System.out.println("搜索结束");
    }

    // 查看所有学生
    public static void showme(ArrayList<bbb057学生类> xx1) {
        System.out.println("执行集合遍历");
        System.out.println("学号\t" + "姓名\t" + "年龄\t" + "居住地\t");
        for (int i = 0; i < xx1.size(); i++) {
            bbb057学生类 a = xx1.get(i);
            System.out.println(a.getNun() + "\t" + a.getName() + "\t" + a.getAge() + "\t" + a.getCity());
        }
    }

    // public static void quits() {
    //     System.out.println("退出程序--------");
    // }

}
