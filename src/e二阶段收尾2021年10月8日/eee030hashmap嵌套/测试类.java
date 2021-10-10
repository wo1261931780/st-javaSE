package e二阶段收尾2021年10月8日.eee030hashmap嵌套;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * 需求：创建一个HashMap集合，存储三个键值对元素，每一个键值对元素的键是String，值是ArrayList，
 * 每一个ArrayList的元素是String，并遍历
 * 思路：
 * 1:创建HashMap集合
 * 2:创建ArrayList集合，并添加元素
 * 3:把ArrayList作为元素添加到HashMap集合
 * 4:遍历HashMap集合
 * 给出如下的数据:
 * 第一个ArrayList集合的元素：(三国演义)
 * 诸葛亮
 * 赵云
 * 第二个ArrayList集合的元素：(西游记)
 * 唐僧
 * 孙悟空
 * 第三个ArrayList集合的元素：(水浒传)
 * 武松
 * 鲁智深
 */
public class 测试类 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> x = new HashMap<>();
        ArrayList<String> x1 = new ArrayList<>();
        x1.add("a1");
        x1.add("a2");
        ArrayList<String> x2 = new ArrayList<>();
        x2.add("a3");
        x2.add("a4");
        ArrayList<String> x3 = new ArrayList<>();
        x3.add("a5");
        x3.add("a6");
        x.put("111", x1);
        x.put("222", x2);
        x.put("333", x3);
        Set<String> x4 = x.keySet();
        for (String x5 : x4) {
            ArrayList<String> x6 = x.get(x5);
            for (String i : x6) {
                System.out.println(i + "--" + x5);
            }
            // for (int i = 0; i < x6.size(); i++) {
            //     System.out.println(x6.get(i) + "--" + x5);
            // }
        }
    }
}
