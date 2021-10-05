package d二阶段收尾2021年10月2日.ddd024集合进阶;

import java.util.ArrayList;
import java.util.Collection;

public class ddd030collection常用方法isempty {
    public static void main(String[] args) {
        System.out.println("开始");
        Collection<String> x = new ArrayList<>();
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        System.out.println(x.isEmpty());
        // false
        // 集合是否为空
        
    }
}
