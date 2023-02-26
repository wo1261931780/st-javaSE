package c2stage_20220326.eee030hashmap嵌套;
/*
    需求：创建一个HashMap集合，存储三个键值对元素，每一个键值对元素的键是String，值是ArrayList，
         每一个ArrayList的元素是String，并遍历

    思路：
        1:创建HashMap集合
        2:创建ArrayList集合，并添加元素
        3:把ArrayList作为元素添加到HashMap集合
        4:遍历HashMap集合

    给出如下的数据:
        第一个ArrayList集合的元素：(三国演义)
  		    诸葛亮
  		    赵云
        第二个ArrayList集合的元素：(西游记)
  		    唐僧
  		    孙悟空
        第三个ArrayList集合的元素：(水浒传)
  		    武松
  		    鲁智深
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class eee031hashmap嵌套 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> x = new HashMap<>();
        ArrayList<String> x1 = new ArrayList<>();
        x1.add("x1-a1");
        x1.add("x1-a2");
        ArrayList<String> x2 = new ArrayList<>();
        x2.add("x2-a1");
        x2.add("x2-a2");
        ArrayList<String> x3 = new ArrayList<>();
        x3.add("x3-a1");
        x3.add("x3-a2");
        x.put("11", x1);
        x.put("22", x2);
        x.put("33", x3);
        Set<String> x4 = x.keySet();
        for (String i : x4) {
            // for (String i : x) {
            // 这里不能直接遍历x，因为x属于hashmap，
            // 遍历必须针对单一元素的集合
            // 这里的单一元素指的是，专门储存x键集合的x4
            ArrayList<String> x5 = x.get(i);
            // x5得到的是3个ArrayList
            System.out.println(i + "---------------------");
            for (String i2 : x5) {
                System.out.println(i2);
            }
        }

    }
}
