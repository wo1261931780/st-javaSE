package d二阶段收尾2021年10月2日.ddd024集合进阶;

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
