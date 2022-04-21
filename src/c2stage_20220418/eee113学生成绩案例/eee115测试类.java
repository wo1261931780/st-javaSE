package c2stage_20220418.eee113学生成绩案例;
/*
    需求：键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩)。要求按照成绩总分从高到低写入文本文件
          格式：姓名,语文成绩,数学成绩,英语成绩	举例：林青霞,98,99,100

    思路：
        1:定义学生类
        2:创建TreeSet集合，通过比较器排序进行排序
        3:键盘录入学生数据
        4:创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
        5:把学生对象添加到TreeSet集合
        6:创建字符缓冲输出流对象
        7:遍历集合，得到每一个学生对象
        8:把学生对象的数据拼接成指定格式的字符串
        9:调用字符缓冲输出流对象的方法写数据
        10:释放资源
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class eee115测试类 {
    public static void main(String[] args) throws IOException {
        // ArrayList<eee114对象类> xx = new ArrayList<>();
        // 需要比较，所以排序使用treeset集合，
        // 这里需要重写方法，使用匿名内部类的方式定义
        TreeSet<eee114对象类> xx = new TreeSet<>(new Comparator<eee114对象类>() {
            @Override
            public int compare(eee114对象类 o1, eee114对象类 o2) {
                int num = o1.getScore_all() - o2.getScore_all();
                int num2 = num == 0 ? o1.getScore_yw() - o2.getScore_yw() : num;
                int num3 = num2 == 0 ? o1.getScore_math() - o2.getScore_math() : num2;
                int num4 = num3 == 0 ? (o1.getName().compareTo(o2.getName())) : num3;
                return num4;
            }
        });

        int i = 0;
        while (i < 3) {
            wri(xx);
            System.out.println("------");
            i++;
        }
        filewri(xx);

    }

    public static void wri(TreeSet<eee114对象类> xx) {
        Scanner x = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String x2 = x.nextLine();
        System.out.println("请输入学号：");
        String x3 = x.nextLine();
        System.out.println("请输入语文成绩：");
        int x4 = x.nextInt();
        System.out.println("请输入数学成绩：");
        int x5 = x.nextInt();
        System.out.println("请输入英语成绩：");
        int x6 = x.nextInt();
        int sum = x4 + x5 + x6;
        eee114对象类 x1 = new eee114对象类(x2, x3, x4, x5, x6, sum);
        // System.out.println(x1.getName() + "，" + x1.getNum() + "，" + x1.getScore_yw() + "，" + x1.getScore_math() + "，" + x1.getScore_en());
        xx.add(x1);
    }

    public static void filewri(TreeSet<eee114对象类> xx) throws IOException {
        BufferedWriter x = new BufferedWriter(new FileWriter("l:\\java\\demo.txt"));
        for (eee114对象类 i : xx) {
            StringBuilder x1 = new StringBuilder();
            x1.append(i.getName()).append(",").append(i.getNum()).append(",").append(i.getScore_yw()).append(",").append(i.getScore_math()).append(",").append(i.getScore_en()).append(",").append(i.getScore_all());
            // x.write(String.valueOf(x1));
            // 官方推荐使用tostring方法写入
            x.write(x1.toString());
            x.newLine();
            x.flush();
        }
        x.close();
    }
}
