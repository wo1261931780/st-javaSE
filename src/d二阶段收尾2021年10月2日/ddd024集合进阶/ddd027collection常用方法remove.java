package d二阶段收尾2021年10月2日.ddd024集合进阶;

import java.util.ArrayList;
import java.util.Collection;

public class ddd027collection常用方法remove {
    public static void main(String[] args) {
        System.out.println("开始");
        Collection<String> x = new ArrayList<>();
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        System.out.println(x);
        // [aaa, aaa, aaa, aaa]
        x.remove("aaa");
        System.out.println(x);
        // [aaa, aaa, aaa]
        // 默认每个aaa作为一个对象，移除操作按照次数进行
        System.out.println(x.remove("aaa"));
        // true
        System.out.println(x.remove("aaa1"));
        // 结果有true/false，对不存在的对象进行移除，导致失败
        // false

    }
}
