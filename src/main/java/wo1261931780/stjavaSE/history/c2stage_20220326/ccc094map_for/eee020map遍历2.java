package wo1261931780.stjavaSE.history.c2stage_20220326.ccc094map_for;
/*
    Map集合的遍历(方式2):
        1:获取所有键值对对象的集合
            Set<Map.Entry<K,V>> entrySet()：获取所有键值对对象的集合
        2:遍历键值对对象的集合，得到每一个键值对对象
            用增强for实现，得到每一个Map.Entry
        3:根据键值对对象获取键和值
            用getKey()得到键
            用getValue()得到值
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class eee020map遍历2 {
    public static void main(String[] args) {
        Map<String, String> x = new HashMap<>();
        x.put("111", "a1");
        x.put("222", "a2");
        x.put("333", "a3");
        x.put("444", "a4");
        System.out.println(x);
        Set<Map.Entry<String, String>> x1 = x.entrySet();
        // String都是map构建的时候设定好的
        // Map.Entry<String, String>这是一个整体
        // 可以理解为，我用set构建了一个xx类型的x1
        // 而这个xx就是Map.Entry<String, String>
        System.out.println(x1);
        // x1和x不同，x1属于一个集合
        for (Map.Entry<String, String> x2 : x1) {
            System.out.println(x2.getValue());
            System.out.println(x2.getKey());
        }
    }

}
