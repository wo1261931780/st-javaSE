package wo1261931780.stjavaSE.history.c2stage_20220220.ccc061for_plus;
/*
    增强for：简化数组和Collection集合的遍历
        实现Iterable接口的类允许其对象成为增强型 for语句的目标
        它是JDK5之后出现的，其内部原理是一个Iterator迭代器

    格式：
        for(元素数据类型 变量名 : 数组或者Collection集合) {
            //在此处使用变量即可，该变量就是元素
        }
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ddd051增强for循环 {
    public static void main(String[] args) {
        int[] x = {1, 2, 2, 3, 32, 3, 13, 12};
        for (int i : x) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------");
        String[] x1 = {"a1", "a2", "a3", "a4", "a5", "a6", "a7"};
        for (String i : x1) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------");
        List<String> x3 = new ArrayList<>();
        x3.add("aaa");
        x3.add("bbb");
        x3.add("ccc");
        for (String i : x3) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------");
        for (String i : x3) {
            System.out.println(i);
            if (i.equals("ccc")) {
                x3.add("javaee");
            }
            // 只要出现异常，就代表其内部是iterator迭代器
            // 同样的，可以用类似方法来反向检测继承/实现体系
        }
        System.out.println("-------------------------------------");
        ListIterator<String> x4 = x3.listIterator();
        // 报错，for each循环不适用于listIterator集合
        // for (String i : x4) {
        //     System.out.println(i);
        // }
    }
}
