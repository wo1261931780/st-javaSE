package ab往期学习2021年10月2日.bbb029储存然后遍历的操作;

import java.util.ArrayList;

public class bbb030d集合get和size方法 {
    public static void main(String[] args) {
        System.out.println("------------------------");
        ArrayList<String> x1 = new ArrayList<>();
        x1.add("111");
        x1.add("222");
        x1.add("333");
        String x2 = x1.get(1);
        // 直接返回1位置上的元素222
        // 这里指定位置不存在，就会出现索引越界的问题
        System.out.println(x2);
        System.out.println(x1.size());
        // 直接输出元素个数3

    }
}
