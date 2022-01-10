package abc往期学习2021年10月2日.bbb029储存然后遍历的操作;

import java.util.ArrayList;

public class bbb030b集合remove方法 {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<>();
        System.out.println("开始执行");
        x.add("111");
        x.add("222");
        x.add("3333");
        System.out.println(x);
        System.out.println("------------------------------");
        // [111, 222, 3333]
        x.remove("222");
        // remove删除指定元素，返回删除成功/失败
        // remove一共两种类型，一种指定要删除的元素，一种指定要删除的元素的位置
        x.add("222");
        System.out.println(x);
        System.out.println("------------------------------");
        x.remove(1);
        System.out.println(x);
        // 结果为：[111, 222]
    }
}
