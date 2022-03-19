package c2stage_20220220.ccc068list_case;
/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
    思路：
        1:定义学生类
        2:创建List集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合(迭代器方式，for循环方式)
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ddd044list案例 {
    public static void main(String[] args) {
        System.out.println("开始");
        List<ddd043对象类> x = new ArrayList<>();
        ddd043对象类 x1 = new ddd043对象类("a", 11);
        ddd043对象类 x2 = new ddd043对象类("b", 22);
        ddd043对象类 x3 = new ddd043对象类("c", 33);
        x.add(x1);
        x.add(x2);
        x.add(x3);
        // System.out.println(x1.getName() + x1.getAge());
        System.out.println();
        // showdemo(x);
        showdemo2(x);
        // 这里通常可以使用for循环，但是考虑到list为collection的子类
        // 所以迭代器也可以使用
    }


    public static void showdemo(List<ddd043对象类> x) {
        for (int i = 0; i < x.size(); i++) {
            ddd043对象类 xx = x.get(i);
            System.out.println(xx.getName() + "," + xx.getAge());
            System.out.println("遍历次数" + i);
        }
    }

    public static void showdemo2(List<ddd043对象类> x) {
        Iterator<ddd043对象类> x1 = x.iterator();
        while (x1.hasNext()) {
            ddd043对象类 x2 = x1.next();
            System.out.print("迭代器输出：");
            System.out.println(x2.getName() + x2.getAge());
        }
    }
}
