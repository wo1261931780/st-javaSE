package d二阶段收尾2021年10月2日.ddd024集合进阶;

import java.util.ArrayList;
import java.util.Collection;

public class ddd025collection集合对象 {
    public static void main(String[] args) {
        System.out.println("开始执行");
        Collection<String> x = new ArrayList<>();
        // 通过多态的方式，创建子类对象
        // ArrayList<String> x1=new ArrayList<>();
        // 类似上面的方式
        x.add("aaaa");
        x.add("bbb");
        x.add("ccc");
        System.out.println(x);
        // 上面代码的结果：[aaaa, bbb, ccc]
    }
}
