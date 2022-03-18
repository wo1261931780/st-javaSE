package c2stage_20220220.ccc065list;

import java.util.ArrayList;
import java.util.List;

public class ddd041list特有方法 {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        // list还是一个接口，所以本质上都是通过多态的方式来创建对象
        x.add("a1");
        x.add("a2");
        x.add("a3");
        x.add("a4");
        x.add("a5");
        x.add(2, "xx");
        // x.add(20, "xx");
        // 超出范围的插入，也是报错
        System.out.println(x);// 结果：[a1, a2, xx, a3, a4, a5]
        // ---------------------------------------------
        System.out.println(x.remove("a1"));
        System.out.println(x.remove("aa"));// 删除指定元素，只会返回删除是否成功
        System.out.println(x.remove(2));// 删除指定位置，返回删除的元素
        // ---------------------------------------------
        System.out.println(x);// [a2, xx, a4, a5]
        System.out.println(x.set(1, "a3"));// 设置指定位置的元素为指定内容，返回原始数据
        System.out.println(x);// [a2, a3, a4, a5]
        // ---------------------------------------------
        System.out.println(x.get(1));// 输出a3，获取指定位置的元素
        // x.get(i);
        // 获取指定位置的元素
        // for循环对集合进行操作，x.size()表示集合的大小
    }
}
