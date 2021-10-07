package d二阶段收尾2021年10月2日.ddd070hashset概述;

import java.util.HashSet;

public class ddd071hashset {
    public static void main(String[] args) {
        // hashset，底层为哈希表
        // 对迭代顺序没有保证，也不能使用for循环遍历
        // 这里的遍历，主要针对需要index的遍历方式，其他的都可以
        // 同时，这里的set都是不含重复元素的
        HashSet<String> x = new HashSet<>();
        x.add("a1");
        x.add("a2");
        x.add("a3");
        x.add("a4");
        // x.add("asfgsd2");
        // x.add("fgjfghj3");
        // x.add("ghfkghj4");
        x.add("a5");
        x.add("a5");
        x.add("a5");
        
        for (String x1 : x) {
            System.out.println(x1);
            System.out.println(x1.hashCode());
            // a1-a5，五个元素对应hash数据为：3056-3060
            // 实际按顺序排列
        }
        // 这里，如果按照a1-5的方式去添加，
        // 最终还是得到按顺序排列的元素


    }

}
