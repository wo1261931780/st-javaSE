package d二阶段收尾2021年10月2日.ddd065set集合;
/*
    Set集合特点
        不包含重复元素的集合
        没有带索引的方法，所以不能使用普通for循环遍历
    HashSet:对集合的迭代顺序不作任何保证
 */

import java.util.HashSet;
import java.util.Set;

public class ddd066set方法 {
    public static void main(String[] args) {
        Set<String> x = new HashSet<>();
        x.add("a2");
        x.add("a1");
        x.add("aaa3");
        x.add("aaa5");
        x.add("a0");
        x.add("aaa4");
        x.add("aaa5");
        x.add("bbb2");
        // System.out.println(x);
        for (String x1 : x) {
            System.out.println(x1);
        }
    }

}
