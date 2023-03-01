package wo1261931780.stjavaSE.history.c2stage_20220228.ccc076set;
/*
    Set集合特点
        不包含重复元素的集合
        没有带索引的方法，所以不能使用普通for循环遍历
    HashSet:对集合的迭代顺序不作任何保证
 */

import java.util.HashSet;
import java.util.Set;

public class ccc001set方法 {
    public static void main(String[] args) {
        Set<String> x = new HashSet<>();
        // Set<String> x = new LinkedHashSet<>();
        // 直接解耦做成linkedhashset，就会变成有序集合
        // [a2, a1, aaa3, aaa5, a0, aaa4, bbb2]
        // 按照添加顺序
        x.add("a2");
        x.add("a1");
        x.add("aaa3");
        x.add("aaa5");
        x.add("a0");
        x.add("aaa4");
        x.add("aaa5");
        x.add("bbb2");
        System.out.println(x);// [a1, a2, aaa5, aaa4, bbb2, aaa3, a0]
        // 因为内部重写了tostring方法，直接展示内容
        // 同时，因为是set类型，所以是无序的
        // set类型特点，不重复
        for (String x1 : x) {
            System.out.println(x1);
        }
    }
}
