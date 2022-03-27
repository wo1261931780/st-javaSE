package c2stage_20220326.ccc092map;
/*
    Map集合概述
        Interface Map<K,V>	K：键的类型；V：值的类型
        将键映射到值的对象；不能包含重复的键；每个键可以映射到最多一个值
        举例：学生的学号和姓名
              itheima001	林青霞
              itheima002	张曼玉
              itheima003	王祖贤

    创建Map集合的对象
        多态的方式
        具体的实现类HashMap
 */

import java.util.HashMap;
import java.util.Map;

public class eee014map {

    public static void main(String[] args) {
        // interface Map<K,V>
        // K表示键的类型，V表示值的类型
        Map<String, String> x = new HashMap<>();
        x.put("aaaaaaa", "a1");
        x.put("bbbbbbb", "a2");
        x.put("ccccccc", "a3");
        x.put("ddddddd", "a4");
        x.put("eeeeeee", "a5");

        System.out.println(x);
        // 结果为：
        // {bbbbbbb=a2, aaaaaaa=a1, ddddddd=a4, eeeeeee=a5, ccccccc=a3}
        // 相当于hashmap重写了tostring方法，
        // 这里是无序的展示结果
        // 同时，这里的键值都是唯一的，如果重复，那么就会出现替换
        // 例如aaa已经出现，这时重新添加一个一样的键值，会将原来的对象替换掉
    }

}
