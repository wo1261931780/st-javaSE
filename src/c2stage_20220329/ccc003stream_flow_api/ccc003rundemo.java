package c2stage_20220329.ccc003stream_flow_api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220329.ccc003stream_flow_api
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-20-47  星期四
 */
public class ccc003rundemo {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.stream().map(s -> new ccc002object(s)).forEach(System.out::println);
        // 上面的代码就是，我先使用一个map方法，对内部的对象加工
        // 加工以后将获得的对象封装为object类中的对象
        // 然后对结果进行遍历操作
        x.stream().map(ccc002object::new).forEach(System.out::println);
        // 这里就是简化写法，首先进行一个构造器引用，然后进行一个方法引用
        // 引用的特征就是双引号
    }
}
