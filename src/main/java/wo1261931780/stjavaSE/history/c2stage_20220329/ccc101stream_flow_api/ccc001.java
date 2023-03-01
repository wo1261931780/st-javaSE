package wo1261931780.stjavaSE.history.c2stage_20220329.ccc101stream_flow_api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220329.ccc003stream_flow_api
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-22-31  星期二
 */
public class ccc001 {
    public static void main(String[] args) {
        List<String> demo1 = new ArrayList<>();
        demo1.add("aasda");
        demo1.add("aaasda");
        demo1.add("adsga");
        demo1.add("aadfgdfa");
        demo1.add("aaa");
        demo1.add("aa");
        demo1.stream().filter(s -> s.startsWith("a") && s.length() <= 3).forEach(System.out::println);
        // 进行一下说明：
        // System.out::println就是System.outprintln(s),
        // 这是一种方法引用的形式
        demo1.stream().limit(2).forEach(System.out::println);
        demo1.stream().skip(4).forEach(System.out::println);
        demo1.stream().limit(3).count();// stream流的结束方法有且仅有一个
        // 其实这里有点问题，如果我需要对结果的一半进行操作，然后另一半进行特殊操作，最终将二者结合返回，stream流就无法做到
        // 2022年4月6日21:41:07，回顾，这里其实可以多个stream流操作，然后合并到一起。
        // demo1.stream().map(new Function<String, String>() {
        //     // 这里就相当于，内部新建了一个构造器
        //     // 构造器先处理string类型的数据
        //     // 然后返回的结果也是string类型的数据
        //     @Override
        //     public String apply(String s) {
        //         return "片头：" + s;
        //     }
        // }).forEach(System.out::println);
        demo1.stream().map(s -> "测试：" + s).forEach(System.out::println);
        // 上面的代码简化以后的结果
    }
}
