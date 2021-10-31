package abc往期学习2021年10月2日.bbb029储存然后遍历的操作;

import java.util.ArrayList;

public class bbb030c集合set方法 {
    public static void main(String[] args) {
        System.out.println("---------------");
        ArrayList<String> x = new ArrayList<>();
        x.add("1111");
        x.add("2222");
        x.add("3333");
        System.out.println(x);
        x.set(0, "000");
        System.out.println(x);
        // 原式为[1111, 2222, 3333]，修改后结果为[000, 2222, 3333]
        // 将指定位置的元素修改为指定内容
        // 如果用一个变量去接收x.set(0, "000")，
        // 得到的结果为被修改的元素1111
        // String x1 = x.set(0, "000");
        // System.out.println(x1);

    }
}
