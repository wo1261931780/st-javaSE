package wo1261931780.stjavaSE.history.c2stage_20220329.ccc100stream_flow;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220329.ccc002stream_float
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-22-13  星期二
 */

/**
 * 目标：Stream流的获取
 * <p>
 * Stream流式思想的核心：
 * 是先得到集合或者数组的Stream流（就是一根传送带）
 * 然后就用这个Stream流操作集合或者数组的元素。
 * 然后用Stream流简化替代集合操作的API.
 * <p>
 * 集合获取流的API:
 * (1) default Stream<E> stream();
 * <p>
 * 小结：
 * 集合获取Stream流用: stream();
 * 数组：Arrays.stream(数组)   /  Stream.of(数组);
 */
public class ccc001stream {
    public static void main(String[] args) {
        show1();// 获取集合的stream流
        show2();// 获取map的stream流
        show3();// 获取数组的stream流
    }

    public static void show1() {
        Collection<String> demo1 = new ArrayList<>();
        demo1.add("a1");
        demo1.add("a1");
        demo1.add("a1");
        demo1.add("a1");
        Stream<String> demo1_stream = demo1.stream();
        System.out.println(demo1_stream);
    }

    public static void show2() {
        Map<String, Integer> demo2 = new HashMap<>();
        demo2.put("a1", 111);
        demo2.put("a2", 111);
        demo2.put("a3", 111);
        demo2.put("a4", 111);
        System.out.println("***************");
        Stream<String> demo2_stream = demo2.keySet().stream();
        // System.out.println(demo2_stream);
        demo2_stream.forEach(s -> System.out.print(s + "--"));// a1--a2--a3--a4--
        System.out.println("***************");
        Stream<Integer> demo2_value_stream = demo2.values().stream();
        // System.out.println(demo2_value_stream);
        demo2_value_stream.forEach(s -> System.out.print(s + "--"));// 111--111--111--111--
        System.out.println("***************");
        Stream<Map.Entry<String, Integer>> demo2_entryset = demo2.entrySet().stream();
        // System.out.println(demo2_entryset);// java.util.stream.ReferencePipeline$Head@776ec8df
        // 上面四个直接打印只会得到具体的地址
        demo2_entryset.forEach(s -> System.out.print(s + "--"));// a1=111--a2=111--a3=111--a4=111--
    }

    public static void show3() {
        String[] demo1 = {"a1", "a1", "a1", "a1", "a1", "a1"};
        Stream<String> demo1_stream = Arrays.stream(demo1);
        Stream<String> demo1_stream2 = Stream.of(demo1);
        // 这样看来，stream应该本身就是一个构造类，只不过这个构造类对数组，集合，map都可以生效
    }

    public static void show4() {
        /** --------------------Collection集合获取流-------------------------------   */
        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();

        /** --------------------Map集合获取流-------------------------------   */
        Map<String, Integer> maps = new HashMap<>();
        // 键流
        Stream<String> keyStream = maps.keySet().stream();
        // 值流
        Stream<Integer> valueStream = maps.values().stream();
        // 键值对流（拿整体）
        Stream<Map.Entry<String, Integer>> keyAndValueStream = maps.entrySet().stream();

        /** ---------------------数组获取流------------------------------   */
        String[] names = {"赵敏", "小昭", "灭绝", "周芷若"};
        Stream<String> nameStream = Arrays.stream(names);
        Stream<String> nameStream2 = Stream.of(names);
    }
}
