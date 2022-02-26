package c2stage_20220220.ccc070genericity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ddd095泛型 {
    public static void main(String[] args) {
        Collection x = new ArrayList();
        // 在没有指定类型的情况下，出现的都是泛型
        // 泛型创建的都是对象
        x.add("a1");
        // 这里默认是object类型
        x.add("a2");
        x.add("a3");
        x.add(200);
        // 有自动装箱的操作，int自动封装为integer类型
        // 我觉得泛型的好处在于，可以对不同的对象直接使用
        // 不需要执行一次类型转换，同时避免了类型转换带来的报错和修改，简单来说，提高易用性
        Iterator x1 = x.iterator();
        while (x1.hasNext()) {
            // String x2=(String) x1.next();
            // 这里是对象，所以需要执行一个转型操作
            Object x2 = x1.next();
            System.out.println(x2);
        }

    }
}
