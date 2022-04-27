package c2stage_20220220.ccc057collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc057collection
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-20-11  星期日
 */
public class ccc001collection导入 {
    public static void main(String[] args) {
        // 有序，可重复，有索引
        Collection x = new ArrayList();
        x.add("demo");
        x.add("demo");
        x.add(11);
        x.add(11);
        x.add(true);
        // 集合打印内容，因为内部已经将方法进行了一次重写
        System.out.println(x);// [demo, demo, 11, 11, true]

        // 无序，不重复，无索引
        // 由于多态可解耦，所以直接添加即可
        // ****************************************
        // 方便进行解耦操作（互相之间的依赖不强）
        // 比如我一开始new是一个dog，a.eat是dog的方法体
        // 但是后续我将dog改成cat，a.eat就自动变成了cat的方法体，不需要重新做方法的修改
        // ****************************************
        Collection x1 = new HashSet();
        x1.add("demo");
        x1.add("run");
        x1.add("demo");
        x1.add("run");
        x1.add(11);
        x1.add(11);
        x1.add(true);
        System.out.println(x1);//[run, 11, demo, true]
        // 这里自动清除内部的重复内容，同时未按照添加顺序排序
    }
}
