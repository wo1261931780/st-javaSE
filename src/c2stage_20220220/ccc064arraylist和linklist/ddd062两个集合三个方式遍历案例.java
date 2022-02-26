package c2stage_20220220.ccc064arraylist和linklist;
/*
    List集合常用子类：ArrayList，LinkedList
        ArrayList：底层数据结构是数组，查询快，增删慢
        LinkedList：底层数据结构是链表，查询慢，增删快

    练习：
        分别使用ArrayList和LinkedList完成存储字符串并遍历
 */
/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

    思路：
        1:定义学生类
        2:创建ArrayList集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合
            迭代器：集合特有的遍历方式
            普通for：带有索引的遍历方式
            增强for：最方便的遍历方式
 */

import java.util.*;

public class ddd062两个集合三个方式遍历案例 {
    public static void main(String[] args) {
        ArrayList<ddd061对象类> x = new ArrayList<>();
        ddd061对象类 x2 = new ddd061对象类("a1", 11);
        ddd061对象类 x3 = new ddd061对象类("a2", 22);
        ddd061对象类 x4 = new ddd061对象类("a3", 33);
        x.add(x2);
        x.add(x3);
        x.add(x4);
        System.out.println("----------------------------------");
        for (int i = 0; i < x.size(); i++) {
            ddd061对象类 xx = x.get(i);
            System.out.println(xx.getName() + "," + xx.getAge());
        }
        System.out.println("----------------------------------");
        Iterator<ddd061对象类> x5 = x.iterator();
        while (x5.hasNext()) {
            ddd061对象类 x6 = x5.next();
            System.out.println(x6.getName() + "--" + x6.getAge());
        }
        System.out.println("----------------------------------");
        for (ddd061对象类 i : x) {
            System.out.println(i.getName() + "**" + i.getAge());
        }
        System.out.println("----------------------------------");
        // System.out.println("----------------------------------");
        // System.out.println("----------------------------------");
        LinkedList<ddd061对象类> x1 = new LinkedList<>();
        x1.add(x2);
        x1.add(x3);
        x1.add(x4);
        for (int i = 0; i < x1.size(); i++) {
            ddd061对象类 xx = x1.get(i);
            System.out.println(xx.getName() + "," + xx.getAge());
        }
        System.out.println("----------------------------------");
        Iterator<ddd061对象类> x7 = x1.iterator();
        while (x7.hasNext()) {
            ddd061对象类 x8 = x7.next();
            System.out.println(x8.getName() + "--" + x8.getAge());
        }
        System.out.println("----------------------------------");
        for (ddd061对象类 i : x1) {
            System.out.println(i.getName() + "**" + i.getAge());
        }
    }

}
