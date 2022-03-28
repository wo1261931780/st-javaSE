package c2stage_20220326.ccc093map_api;
/*
    Map集合的获取功能：
        V get(Object key):根据键获取值
        Set<K> keySet():获取所有键的集合
        Collection<V> values():获取所有值的集合
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class eee017map常用功能 {
    public static void main(String[] args) {
        Map<String, String> x = new HashMap<>();
        x.put("111", "a1");
        x.put("222", "a2");
        x.put("333", "a3");
        x.put("444", "a4");
        System.out.println(x.get("111"));
        // 根据键获取数据，a1
        System.out.println(x.get("ww"));
        // 不存在的键，返回null
        // ------------------------------------------
        // 获取所有key键的集合
        Set<String> x1 = x.keySet();
        for (String x2 : x1) {
            System.out.println(x2);
        }
        System.out.println(x1);
        // [111, 222, 333, 444]
        // ------------------------------------------
        // 获取所有值的集合
        Collection<String> x2 = x.values();
        for (String i : x2) {
            System.out.println(i);
        }
        System.out.println(x2);
        // 表示这里x2就是一个collection集合
        // [a1, a2, a3, a4]
    }
}
