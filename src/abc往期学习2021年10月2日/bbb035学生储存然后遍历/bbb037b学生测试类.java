package abc往期学习2021年10月2日.bbb035学生储存然后遍历;

import java.util.ArrayList;

public class bbb037b学生测试类 {
    public static void main(String[] args) {
        System.out.println("开始测试");
        // 这里，相当于我的集合，是在学生类中创建的
        ArrayList<bbb037a学生类> x = new ArrayList<>();
        // 下面添加的对象，也是针对学生类这个类进行的
        bbb037a学生类 x1 = new bbb037a学生类(11, "s1");
        bbb037a学生类 x2 = new bbb037a学生类(22, "s2");
        bbb037a学生类 x3 = new bbb037a学生类(33, "s3");
        // 添加好了学生类以后，再往集合中，添加对象
        // 这里添加的是对象对应的地址
        // 如果要获取对象具体的信息，需要访问地址，然后使用get/set方法
        x.add(x1);
        x.add(x2);
        x.add(x3);
        for (int i = 0; i < x.size(); i++) {
            // System.out.println(x.get(i));
            System.out.println(x.get(i).getName() + "的年龄为：" + x.get(i).getAge());
            // 同理，也可以按照下面的写法去执行
            // bbb036学生类 s = xs.get(x);
            // System.out.println("学生姓名：" + s.getName() + "，学生年龄：" + s.getAge());
        }
    }
}

