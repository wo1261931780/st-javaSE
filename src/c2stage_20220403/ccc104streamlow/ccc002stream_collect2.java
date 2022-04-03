package c2stage_20220403.ccc104streamlow;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc104streamlow
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-12-56  星期日
 */
public class ccc002stream_collect2 {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.add("a1");
        x.add("a2");
        x.add("a3");
        x.add("d4");
        x.add("g5");
        Stream<String> demo1 = x.stream().filter(s -> s.startsWith("g"));
        List<String> demo2 = demo1.collect(Collectors.toList());
        List<String> demo3 = demo1.toList();
        // 上面的两个方法都可以直接将stream转化为list类型的集合对象
        // 差别在于tolist获得的集合不能修改集合中的元素，为不可变集合
        // 不可变集合，就有点类似于Listof方法
        // stream获得的方法就可变
    }
}
