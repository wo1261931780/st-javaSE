package e二阶段收尾2021年10月8日.eee013map;
/*
    Map集合的基本功能：
        V put(K key,V value)：添加元素
        V remove(Object key)：根据键删除键值对元素
        void clear()：移除所有的键值对元素
        boolean containsKey(Object key)：判断集合是否包含指定的键
        boolean containsValue(Object value)：判断集合是否包含指定的值(自学)
        boolean isEmpty()：判断集合是否为空
        int size()：集合的长度，也就是集合中键值对的个数
 */

import java.util.HashMap;
import java.util.Map;

public class eee015map基本功能 {
    public static void main(String[] args) {
        Map<String, String> x = new HashMap<>();
        x.put("111", "a1");
        x.put("222", "a2");
        x.put("333", "a3");
        x.put("444", "a4");
        System.out.println(x);
        System.out.println(x.remove("aaa"));
        // 结果为null
        System.out.println(x.remove("111"));
        // 返回被删除的元素a1
        System.out.println(x);
        // {222=a2, 333=a3, 444=a4}
        // ----------------------------------------------------
        System.out.println(x.containsKey("222"));
        System.out.println(x.containsValue("a3"));
        // 判断map中是否包含指定和key和value
        // 返回的都是true和false
        // ----------------------------------------------------
        // x.clear();
        // System.out.println(x);
        // 直接清空所有的数据
        // ----------------------------------------------------
        System.out.println(x.isEmpty());
        // 判断集合是否为空
        System.out.println(x.size());
        // 判断集合长度


    }
}
