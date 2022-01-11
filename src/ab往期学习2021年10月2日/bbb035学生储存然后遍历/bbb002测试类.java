package ab往期学习2021年10月2日.bbb035学生储存然后遍历;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb002测试类 {
    public static void main(String[] args) {
        ArrayList<bbb001学生类> x = new ArrayList<>();
        Scanner x1 = new Scanner(System.in);
        while (true) {
            int i = x1.nextInt();
            if (i == 1) {
                addshow(x);
            } else if (i == 2) {
                show(x);
            } else if (i == 3) {
                query(x);
            } else {
                break;
            }
        }


    }

    public static void addshow(ArrayList<bbb001学生类> xx) {
        bbb001学生类 x1 = new bbb001学生类();
        System.out.println();
        Scanner x = new Scanner(System.in);
        Scanner x2 = new Scanner(System.in);
        System.out.println("姓名：");
        x1.setName(x.nextLine());
        System.out.println("地址：");
        x1.setAddress(x.nextLine());
        System.out.println("年龄：");
        x1.setAge(x2.nextInt());
        xx.add(x1);
    }

    public static void show(ArrayList<bbb001学生类> x) {
        System.out.println("姓名：" + "\t" + "地址" + "\t" + "年龄");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i).getName() + "\t" + x.get(i).getAddress() + "\t" + x.get(i).getAge());
        }
    }

    public static void query(ArrayList<bbb001学生类> x) {
        Scanner x1 = new Scanner(System.in);
        String s = x1.nextLine();
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i).getName().equals(s)) {
                System.out.println(x.get(i).getName() + "\t" + x.get(i).getAddress() + "\t" + x.get(i).getAge());
            }
        }
    }
}
