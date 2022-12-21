package ab_history_20211002.bbb035学生储存然后遍历;

import java.util.ArrayList;

public class bbb037测试 {
    public static void main(String[] args) {
        // ArrayList<String> xx=new ArrayList<>();
        // xx.add("asd");
        ArrayList<bbb036学生类> xs = new ArrayList<>();
        // 首先在类中添加一个集合
        // 然后在类中添加一个对象
        // 最后将新增的对象，放入集合中
        bbb036学生类 x1 = new bbb036学生类("aa", 11);
        xs.add(x1);
        // x1.zz("asd",123);
        // 因为这里的对象有两个元素，添加到集合中的，实际上不是对象，而是对象对应的地址
        // 最后输出的结果，也是集合中储存的地址
        // bbb032学生储存然后遍历.bbb036学生类@119d7047
        // 如果要获取对象对应的属性，需要根据地址，使用get方法，做进一步的分析
        System.out.println(xs.get(0));
        System.out.println(x1);
        // 同理，这里也不能直接获取对象+对象属性，因为对象在类中，也是按照地址来储存的
        // bbb032学生储存然后遍历.bbb036学生类@119d7047
        for (int x = 0; x < xs.size(); x++) {
            bbb036学生类 s = xs.get(x);
            System.out.println("学生姓名：" + s.getName() + "，学生年龄：" + s.getAge());
        }
    }
}
