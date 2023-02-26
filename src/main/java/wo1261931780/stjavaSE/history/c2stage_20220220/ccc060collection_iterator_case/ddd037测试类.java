package c2stage_20220220.ccc060collection_iterator_case;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ddd037测试类 {
    public static void main(String[] args) {
        System.out.println("开始");
        Collection<ddd036student> x = new ArrayList<>();
        ddd036student x1 = new ddd036student("a1", 11);
        ddd036student x2 = new ddd036student("a2", 22);
        ddd036student x3 = new ddd036student("a3", 33);
        x.add(x1);
        x.add(x2);
        x.add(x3);
        Iterator<ddd036student> x4 = x.iterator();
        while (x4.hasNext()) {
            // System.out.println(x4.next());
            // 上面直接调用方法，只能得到对象的地址
            ddd036student s = x4.next();
            // 这里也出错，原先使用string格式创建对象
            // 要么使用valueof去包装x4，要么将string类型替换为student类型
            // 包括上面的迭代器，也需要做类似的处理
            // System.out.println(s);
            // 直接展示，只会得到地址
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
