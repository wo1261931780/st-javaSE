package e二阶段收尾2021年10月8日.eee021hashmap案例;
/*
    需求：
        创建一个HashMap集合，键是学号(String)，值是学生对象(Student)。存储三个键值对元素，并遍历

    思路：
        1:定义学生类
        2:创建HashMap集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合
            方式1：键找值
            方式2：键值对对象找键和值
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class eee024测试类 {
    public static void main(String[] args) {
        System.out.println("开始");
        eee023学生类 x1 = new eee023学生类("111", "a1");
        eee023学生类 x2 = new eee023学生类("222", "a2");
        eee023学生类 x3 = new eee023学生类("333", "a3");
        HashMap<String, eee023学生类> x = new HashMap<>();
        // 这里需要根据设置的对象做出改变
        x.put("001", x1);
        x.put("002", x2);
        x.put("003", x3);
        Set<Map.Entry<String, eee023学生类>> xx = x.entrySet();
        for (Map.Entry<String, eee023学生类> xx1 : xx) {
            System.out.println(xx1.getKey() + "----" + xx1.getValue().getName() + "--" + xx1.getValue().getNum());
        }
        System.out.println("结束");
        // 这个案例的意义在于，展示hashmap的功能
        // 比如我有一个学生类，然后学生类中有各种变量
        // 我寻找学生对象，只需要通过key获取即可
        // 然后通过我获取的key去定位学生，再使用get/set方法即可拿到对象内部的变量
        // 举例：
        // 我的账号一个key，对应的账号信息有用户名，ip地址，手机号等等
        // 我只需要根据key去获取用户，就能查到用户名下的所有信息
    }
}
