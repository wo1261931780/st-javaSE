package c2stage_20220329.ccc099mapof;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220329.ccc001
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-32  星期二
 */
public class ccc001 {
    public static void main(String[] args) {
        List<String> demo = new ArrayList<>();
        demo.add("a1");
        demo.add("fg2");
        demo.add("awq3");
        demo.add("rqwr4");
        List<String> demo2 = new ArrayList<>();
        for (String s : demo) {
            if (s.startsWith("a") && s.length() < 3) {
                demo2.add(s);
            }
        }
        System.out.println(demo);// [a1, fg2, awq3, rqwr4]
        System.out.println(demo2);// [a1]
        show1(demo);// a1

    }

    public static void show1(List<String> demo) {
        demo.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() < 3).forEach(System.out::println);
        // 解释一下上面的代码，
        // 首先是链式编程，每次结果都返回一个对象
        // 将以stream流的形式开始写，添加一个筛选器，筛选器内部使用lambda表达式进行操作
        // 然后进行遍历，内部foreach加上lambda表达式进行输出
    }

    public static void show2() {
        // 1、不可变的List集合
        List<Double> lists = List.of(569.5, 700.5, 523.0, 570.5);
        // lists.add(689.0);
        // lists.set(2, 698.5);
        // System.out.println(lists);
        double score = lists.get(1);
        System.out.println(score);

        // 2、不可变的Set集合
        Set<String> names = Set.of("迪丽热巴", "迪丽热九", "马尔扎哈", "卡尔眨巴");
        // names.add("三少爷");
        System.out.println(names);

        // 3、不可变的Map集合
        Map<String, Integer> maps = Map.of("huawei", 2, "Java开发", 1, "手表", 1);
        // maps.put("衣服", 3);
        System.out.println(maps);
    }
}
