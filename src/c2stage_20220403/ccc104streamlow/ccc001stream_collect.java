package c2stage_20220403.ccc104streamlow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220331.ccc001stream_case2
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-22-20  星期四
 */
public class ccc001stream_collect {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.add("a1");
        x.add("a2");
        x.add("a3");
        x.add("e4");
        x.add("b5");
        Stream<String> demo1 = x.stream().filter(s -> s.startsWith("a"));
        List<String> demo2 = demo1.collect(Collectors.toList());
        // 首先我们要清楚，stream流的收集方法，必须要本身是stream类型的对象
        // 其次，需要收集为什么类型的对象，就必须要to什么类型的
        // 比如我设置tolist，那就是收集为list类型的
        // toset，就是收集为set类型的
        System.out.println(demo2);

        // 在没有新建stream流的情况下，默认只能被收集一次
        // 这个有点类似于流水的概念
        // Set<String> demo4 = demo1.collect(Collectors.toSet());//直接运行会报错

        // 要使用新的收集器，前提是stream流没有被收集过
        Stream<String> demo3 = x.stream().filter(s -> s.startsWith("c"));
        Set<String> demo4 = demo3.collect(Collectors.toSet());
        System.out.println(demo4);
    }

    public static void show(List<String> x) {
        // 换句话来说，
        // 任何一个集合，能被无数次调用为stream流，并被多个stream流收集
        Stream<String> demo1 = x.stream().filter(s -> s.startsWith("c"));
        Object[] demo2 = demo1.toArray();// 直接调用方法将其转化为集合类型的对象
        // 注意上面的集合数据类型为object
        // 有点时候，业务需要将其转化为string类型去接收
        String[] demo3 = demo1.toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        // 上面就是将一个stream流，指定转化为string类型的数组
        // 简化写法，就是方法引用：
        String[] demo4 = demo1.toArray(String[]::new);

    }
}
