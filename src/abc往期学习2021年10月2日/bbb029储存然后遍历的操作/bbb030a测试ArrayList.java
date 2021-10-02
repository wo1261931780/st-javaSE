package abc往期学习2021年10月2日.bbb029储存然后遍历的操作;

import java.util.ArrayList;

public class bbb030a测试ArrayList {
    public static void main(String[] args) {
        System.out.println("开始测试");
        ArrayList<String> x = new ArrayList<>();
        x.add("s");
        x.add("ss");
        System.out.println(x);
        System.out.println("------------------");
        x.add(0, "222");
        // 在0号位置插入元素以后，其他元素会自动顺延
        // 第一次打印，结果为：[s, ss]
        // 这里的结果是：[222, s, ss]
        // 也说明，即使会发生变化，这里的显示也是按照堆内存的元素进行展示

        System.out.println(x);
    }
}
