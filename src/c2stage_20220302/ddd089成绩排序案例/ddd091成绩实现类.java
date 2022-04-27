package c2stage_20220302.ddd089成绩排序案例;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ddd091成绩实现类 {
    public static void main(String[] args) {
        System.out.println("开始运行");
        TreeSet<ddd090对象类> x = new TreeSet<>(new Comparator<ddd090对象类>() {
            @Override
            public int compare(ddd090对象类 o1, ddd090对象类 o2) {
                int num = o1.getTotalscore() - o2.getTotalscore();
                // System.out.println(o1.getName().compareTo(o2.getName()));
                // 解析一下三元运算符：
                // 1.判断num是否为0，也就是分数是否相同
                // 相同的情况下，结果为true，执行o1.getName().compareTo(o2.getName())
                // 2.o1.getName().compareTo(o2.getName())判断姓名是否相同
                // 相同则返回0，否则返回其他数据，其他数据就表示会添加到数组中
                // 3.如果分数不相同，就直接返回二者的分数差值num，然后直接添加对象
                int num2 = num == 0 ? o1.getYwscore() - o2.getYwscore() : num;
                int num3 = num == 0 ? o1.getName().compareTo(o2.getName()) : num2;
                // 这里的选择过程是：
                // 1.先看总成绩是否相同，
                // 2.看语文成绩是否相同，去除相同成绩
                // 3.看姓名是否相同，去除相同人员
                return num3;
                // int compareTo(T o)
                // 将此对象与指定的对象进行比较以进行排序。 返回一个负整数，零或正整数，因为该对象小于，等于或大于指定对象。
            }
            // 使用比较器排序，就需要比较器接口的实现类对象
        });
        ddd090对象类 x1 = addst();
        ddd090对象类 x2 = addst();
        ddd090对象类 x3 = addst();
        x.add(x1);
        x.add(x2);
        x.add(x3);
        for (ddd090对象类 i : x) {
            System.out.println("同学：" + i.getName() + ",总成绩为：" + i.getTotalscore() + "，语文成绩：" + i.getYwscore() + "，数学成绩：" + i.getMathscore());
        }
        // ddd090对象类 x1 = new ddd090对象类("a1", 98, 99, 197);
    }

    public static ddd090对象类 addst() {
        Scanner x = new Scanner(System.in);
        ddd090对象类 x1 = new ddd090对象类();
        System.out.println("请输入姓名");
        String x2 = x.nextLine();
        x1.setName(x2);
        System.out.println("请输入语文成绩");
        int x3 = x.nextInt();
        x1.setYwscore(x3);
        System.out.println("请输入数学成绩");
        int x4 = x.nextInt();
        x1.setMathscore(x4);
        x1.setTotalscore(x1.getYwscore() + x1.getMathscore());
        return x1;
    }
}
