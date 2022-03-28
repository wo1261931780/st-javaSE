package c2stage_20220326.ccc092map;

import java.util.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326.ccc092map
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-11-24  星期日
 */
public class ccc001map {
    public static void main(String[] args) {
        Map<String, Integer> x = new HashMap<>();
        x.put("qwe", 123);
        System.out.println(x.put("qwe", 123));
        x.put("qwe", 333);
        System.out.println(x);//{qwe=333}
        // 首先，不会添加重复元素，
        // 其次，当key相同的时候，会对之前的数据进行一次覆盖
        x.put("aa", 333);
        System.out.println(x);// {aa=333, qwe=333}
        // 栈类型的数据
        // 所有的集合都是写内容，因为内部重写了tostring方法
        System.out.println("******************************");
        show();// linkedhashmap是有序的，按照元素添加顺序进行设置
        // show_clear(x);
        // show_isempty(x);
        // show_contains(x);
        // show_getvalue(x);
        // show_set(x);
        // show_value(x);
        System.out.println("******************************");
        show_add();
    }

    public static void show() {
        System.out.println("******************************");

        Map<String, Integer> x = new LinkedHashMap<>();
        x.put("qwe", 123);
        System.out.println(x.put("qwe", 123));
        x.put("bbb", 333);
        System.out.println(x);
        x.put("aa", 333);
        System.out.println(x);
    }

    public static void show_clear(Map<String, Integer> x) {
        System.out.println("******************************");

        x.clear();
    }

    public static void show_isempty(Map<String, Integer> x) {
        System.out.println("******************************");

        System.out.println(x.isEmpty());
    }

    public static void show_getvalue(Map<String, Integer> x) {
        System.out.println("******************************");

        Integer result = x.get("1");// 没有的情况下就是null
        // 一般都是根据key去获取value
        System.out.println(result);
        x.remove("qwe");
        System.out.println(x);
    }

    public static void show_contains(Map<String, Integer> x) {
        System.out.println("******************************");

        System.out.println(x.containsKey("aa"));
        System.out.println(x.containsValue("aa"));
    }

    public static void show_set(Map<String, Integer> x) {
        System.out.println("******************************");

        Set<String> demoset = x.keySet();
        // 这里返回一个set类型的集合对象
        System.out.println(demoset);
    }

    public static void show_value(Map<String, Integer> x) {
        Collection<Integer> demo_value = x.values();
        // 获取所有值，设置为一个collection集合，因为值可以重复，所以collection内部是可以重复的
        System.out.println(demo_value);// [333, 333]
    }

    public static void show_add() {
        Map<String, Integer> x1 = new HashMap<>();
        x1.put("a1", 11);
        x1.put("a2", 22);
        Map<String, Integer> x2 = new HashMap<>();
        // x2.put("a1", 11);
        // x2.put("a2", 22);
        // x2.put("a3", 33);
        x2.put("aa1", 33);
        x2.put("aa2", 44);
        x2.put("aa3", 55);
        x1.putAll(x2);
        System.out.println(x1);// 如果二者的内容完全相同，就不会发生变化
        // {a1=11, aa1=33, a2=22, aa3=55, aa2=44}
        // 最终还是按照key的顺序进行添加
    }
}
