package c2stage_20220326.eee028ArrayList嵌套;
/*
    需求：
        创建一个ArrayList集合，存储三个元素，每一个元素都是HashMap，每一个HashMap的键和值都是String，并遍历

    思路：
        1:创建ArrayList集合
        2:创建HashMap集合，并添加键值对元素
        3:把HashMap作为元素添加到ArrayList集合
        4:遍历ArrayList集合

    给出如下的数据:
        第一个HashMap集合的元素：
  		    孙策		大乔
  		    周瑜		小乔
        第二个HashMap集合的元素：
  		    郭靖		黄蓉
  		    杨过		小龙女
        第三个HashMap集合的元素：
  		    令狐冲	任盈盈
  		    林平之	岳灵珊
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class eee029ArrayList嵌套 {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> x = new ArrayList<>();
        // ArrayList<String> x=new ArrayList<>();
        // 相当于我的x，就是一个hashmap类型的对象
        // 也就是说，
        // 在后面进行任意add命令时，新增的都是hashmap集合

        HashMap<String, String> x1 = new HashMap<>();
        x1.put("11", "a1");
        x1.put("22", "a2");
        HashMap<String, String> x2 = new HashMap<>();
        x2.put("33", "a3");
        x2.put("44", "a4");
        HashMap<String, String> x3 = new HashMap<>();
        x3.put("55", "a5");
        x3.put("66", "a6");
        x.add(x1);
        x.add(x2);
        x.add(x3);
        for (HashMap<String, String> x4 : x) {
            // 设置一个x4去遍历x中的所有hashmap
            Set<String> x5 = x4.keySet();
            // 然后使用x5去获取x4中的key键
            for (String q : x5) {
                System.out.println(x4.get(q));
                // 对key进行遍历，get获取值
            }
        }

        // for (int i = 0; i < x.size(); i++) {
        //     System.out.println(x.get(i));
        //     // {11=a1, 22=a2}
        //     // {33=a3, 44=a4}
        //     // {55=a5, 66=a6}
        // }

    }
}
