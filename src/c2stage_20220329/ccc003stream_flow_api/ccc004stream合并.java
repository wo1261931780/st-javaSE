package c2stage_20220329.ccc003stream_flow_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220329.ccc003stream_flow_api
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-20-59  星期四
 */
public class ccc004stream合并 {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.add("1");
        x.add("1");
        x.add("1");
        Stream<String> demo1 = x.stream().skip(2);
        Stream<String> demo2 = x.stream().limit(3);
        // 合并的前提是二者的类型一致
        Stream<String> demo3 = Stream.concat(demo1, demo2);
        // 如果不一致，就需要指定stream流的类型为object
        demo1.distinct();// 去除重复的方法
        // 因为demo1本身就是stream流类型，所以这里直接调用stream流的api即可
        
    }
}
