package bbb032学生储存然后遍历;

import java.util.ArrayList;

public class bbb037测试 {
    public static void main(String[] args) {
//        ArrayList<String> xx=new ArrayList<>();
        ArrayList<bbb036学生类> xs = new ArrayList<>();
//        xx.add("asd");
        bbb036学生类 x1 = new bbb036学生类("aa", 11);
        xs.add(x1);
//        x1.zz("asd",123);
        System.out.println(xs.get(0));
        //bbb032学生储存然后遍历.bbb036学生类@119d7047
        System.out.println(x1);
        //bbb032学生储存然后遍历.bbb036学生类@119d7047
        for (int x = 0; x < xs.size(); x++) {
            bbb036学生类 s = xs.get(x);
            System.out.println("学生姓名：" + s.getName() + "，学生年龄：" + s.getAge());
        }
    }
}
