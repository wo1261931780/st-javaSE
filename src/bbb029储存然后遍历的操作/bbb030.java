package bbb029储存然后遍历的操作;

import java.util.ArrayList;

public class bbb030 {
    public static void main(String[] args) {
        ArrayList<String> xx = new ArrayList<>();//需要导包
        xx.add("S");//这里无法自动识别，必须添加双引号
        xx.add("SS");
        xx.add("SSS");
        System.out.println(xx);        //结果为：[S, SS, SSS]
        xx.add(2, "sada");//结果为：[S, SS, sada, SSS]
        //指定位置插入后，其他字符自动延后

        System.out.println(xx);
        System.out.println(xx.remove("S"));
        //去除指定内容，并返回去除是否成功
        System.out.println(xx);        //结果为：[SS, sada, SSS]
        System.out.println(xx.remove(2));
        //去除指定位置元素，返回被去除的内容 SSS
        System.out.println(xx);        //结果为：[SS, sada]
        System.out.println(xx.set(1, "00"));
        //返回(显示)被修改的元素sada
        System.out.println(xx);        //修改后的结果：[SS, 00]
        System.out.println(xx.get(0));
        //获得0号位置的元素SS
        System.out.println(xx);        //结果：[SS, 00]
        System.out.println(xx.size());
        //总长度：2
//        ArrayList<String> zz=new ArrayList<>("1","2","3","44","55","66","77","88","99","00");
//        System.out.println(zz);
    }
}
