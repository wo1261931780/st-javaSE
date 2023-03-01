package wo1261931780.stjavaSE.history.c2stage_20220220.ccc069collection_conflict;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ddd046list {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.add("hello");
        x.add("world");
        x.add("java");
        Iterator<String> x1 = x.iterator();
        System.out.println("循环开始");
        // while (x1.hasNext()) {
        //     String x2 = x1.next();
        //     System.out.println(x2);
        //     if (x2.equals("world")) {
        //         x.add("javaee");
        //         // ConcurrentModificationException
        //         // 出现并发修改异常
        //     }
        // }
        for (int i = 0; i < x.size(); i++) {
            String x2 = x.get(i);
            if (x2.equals("world")) {
                x.add("javaee");
            }
        }
        // 从源码分析，没有报错是因为没有做判断
        // next方法，每次都会判断实际数量和预计数量，二者不相同的时候出现异常
        // get方法没有类似的校验，所以可行
        System.out.println(x);
        System.out.println("结束");
    }
}
