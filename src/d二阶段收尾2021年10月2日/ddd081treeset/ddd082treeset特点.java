package d二阶段收尾2021年10月2日.ddd081treeset;
/*
    TreeSet集合特点
        1:元素有序，这里的顺序不是指存储和取出的顺序，而是按照一定的规则进行排序，具体排序方式取决于构造方法
            TreeSet()：根据其元素的自然排序进行排序
            TreeSet(Comparator comparator) ：根据指定的比较器进行排序
        2:没有带索引的方法，所以不能使用普通for循环遍历
        3:由于是Set集合，所以不包含重复元素的集合
 */

import java.util.TreeSet;

public class ddd082treeset特点 {
    public static void main(String[] args) {
        System.out.println("showdemo");
        TreeSet<Integer> x = new TreeSet<>();
        // 集合内部存储的是引用类型
        // 基本类型存储的时候，用基本类的包装类类型
        // 如果存整数，就用int类型的包装类integer
        x.add(11);
        x.add(33);
        x.add(22);
        x.add(22);
        for (Integer i : x) {
            System.out.println(i);
            // 即使上面调换顺序，这里也会按照自然排序做处理
            // 输出结果11-22-33
            // 实际业务中，操作的不是这种类型，是带参数的对象类，
            // 如果需要按照指定参数进行自然排序，那么就需要做重写操作
        }
    }
}
