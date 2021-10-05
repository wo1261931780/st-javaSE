package d二阶段收尾2021年10月2日.ddd024集合进阶;

import java.util.ArrayList;
import java.util.Collection;

public class ddd028collection常用方法clear {
    public static void main(String[] args) {
        System.out.println("开始运行");
        Collection<String> x = new ArrayList<>();
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        System.out.println(x);
        // [aaa, aaa, aaa, aaa, aaa, aaa]
        x.clear();
        System.out.println(x);
        // []

    }
}
