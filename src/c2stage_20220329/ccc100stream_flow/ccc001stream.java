package c2stage_20220329.ccc100stream_flow;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220329.ccc002stream_float
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-22-13  星期二
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

}
