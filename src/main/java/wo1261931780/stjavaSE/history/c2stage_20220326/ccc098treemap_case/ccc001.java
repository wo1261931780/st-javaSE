package c2stage_20220326.ccc098treemap_case;

import java.util.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326.ccc098treemap_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-28  星期日
 */
public class ccc001 {
    public static void main(String[] args) {
        Map<String, List<String>> map1 = new HashMap<>();
        // 相当于，我这里是构造了一个map对象，
        // 所以指定的是对象的数据类型
        List<String> x = new ArrayList<>();
        Collections.addAll(x, "a", "b", "c");
        // 通过可变参数，将选择项添加到数组中
        map1.put("name1", x);// 注意，这里是添加了一个数组进入map中，而一个map，可以添加无数个数组，每个数组作为value可以相同，可以不同
        List<String> x1 = new ArrayList<>();
        Collections.addAll(x1, "b", "c", "asd", "d");
        map1.put("name2", x1);
        System.out.println(map1);// 结果是，name1=数组1，name2=数组2
        // 每个数组都是value形式存储
        Collection<List<String>> result = map1.values();
        System.out.println(result);// [[b, c, asd, d], [a, b, c]]
        // 相当于我就是一个数组，只不过数组中的元素全部是list类型
        Map<String, Integer> xx = new HashMap<>();
        for (List<String> re1 : result) {
            for (String s : re1) {
                if (xx.containsKey(s)) {
                    //判断是否包含这个key
                    xx.put(s, xx.get(s) + 1);
                    //因为key是不变的，所以直接对value数据变化即可
                } else {
                    xx.put(s, 1);
                }
            }
        }
        System.out.println(xx);
    }
}
