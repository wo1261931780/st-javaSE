package c2stage_20220326.eee025hashmap案例2;
/*
    需求：
        创建一个HashMap集合，键是学生对象(Student)，值是居住地 (String)。存储多个键值对元素，并遍历。
        要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象

    思路：
        1:定义学生类
        2:创建HashMap集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合
        6:在学生类中重写两个方法
            hashCode()
            equals()
 */

import java.util.HashMap;
import java.util.Set;

public class eee027实现类 {
    public static void main(String[] args) {
        System.out.println("开始");
        HashMap<eee026学生类, String> x = new HashMap<>();
        eee026学生类 x1 = new eee026学生类("11", "cc");
        eee026学生类 x2 = new eee026学生类("22", "dd");
        eee026学生类 x3 = new eee026学生类("33", "ee");
        eee026学生类 x4 = new eee026学生类("33", "ee");
        // 这里new的是地址，在地址不同的情况下，我们认为是一个元素，
        // 即使内容相同，也会产生重复添加的情况
        // 要解决问题，就需要在对象类中进行重写操作
        // ------------------------------------------------------------------
        // x.put(x1, x1.getCity());
        // x.put(x2, x2.getCity());
        // x.put(x3, x3.getCity());
        // x.put(x3, x3.getCity());
        x.put(x1, "x1的值");
        x.put(x2, "x2的值");
        x.put(x3, "x3的值");
        x.put(x3, "x3的值");
        x.put(x4, "x4的值");
        // ------------------------------------------------------------------
        // Set<Map.Entry<eee026学生类, String>> xx1 = x.entrySet();
        // for (Map.Entry<eee026学生类, String> xx : xx1) {
        //     eee026学生类 x4 = xx.getKey();
        //     System.out.println(x4.getCity() + "--" + x4.getAge() + "--" + xx.getValue());
        // }
        // ------------------------------------------------------------------
        Set<eee026学生类> xx1 = x.keySet();
        // System.out.println(xx1);
        // xx1实际上是key的集合
        // 也就是x1-x5的地址集合
        // 这个时候，x去getx5的地址，实际上是获取键对应的数值
        for (eee026学生类 x5 : xx1) {
            System.out.println(x5.getCity() + "----" + x5.getAge() + "---" + x.get(x5));
        }
    }

}
