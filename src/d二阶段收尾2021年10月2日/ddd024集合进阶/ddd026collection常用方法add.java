package d二阶段收尾2021年10月2日.ddd024集合进阶;
/*
    Collection集合常用方法:
        boolean add(E e):添加元素
        boolean remove(Object o):从集合中移除指定的元素
        void clear():清空集合中的元素
        boolean contains(Object o):判断集合中是否存在指定的元素
        boolean isEmpty():判断集合是否为空
        int size():集合的长度，也就是集合中元素的个数

    Alt+7   打开一个窗口，能够看到类的所有信息
 */
/*
        //创建集合对象
        Collection<String> c = new ArrayList<String>();

        //boolean add(E e):添加元素
        // System.out.println(c.add("hello"));
        c.add("hello");

        //boolean remove(Object o):从集合中移除指定的元素
        // System.out.println(c.remove("world"));
        // System.out.println(c.remove("javaee"));

        //void clear():清空集合中的元素
        // c.clear();

        //boolean contains(Object o):判断集合中是否存在指定的元素
        // System.out.println(c.contains("world"));
        // System.out.println(c.contains("javaee"));

        //boolean isEmpty():判断集合是否为空
        // System.out.println(c.isEmpty());

        //int size():集合的长度，也就是集合中元素的个数
        System.out.println(c.size());

        //输出集合对象
        System.out.println(c);
 */

import java.util.ArrayList;
import java.util.Collection;

public class ddd026collection常用方法add {
    public static void main(String[] args) {
        Collection<String> x = new ArrayList<>();
        x.add("aaa");
        x.add("bbb");
        // x.add("aaa");
        System.out.println(x);
        // 输出结果：[aaa, bbb, aaa]
        // 实际上是存在重复添加的情况
        // --------------------------------------------------------
        // 查看源码：
        // public boolean add(E e) {
        //     modCount++;
        //     add(e, elementData, size);
        //     return true;
        // }
        // --------------------------------------------------------
        System.out.println(x.add("aaa"));
        // 所有的x.add()都会返回true
        System.out.println(x);
        // 和上面的不同，集合的输出可以按顺序
        // 第一次输出两个对象，添加完成以后，输出三个
        // 进入源代码视图以后，
        // alt+7即可进入项目结构


    }
}
