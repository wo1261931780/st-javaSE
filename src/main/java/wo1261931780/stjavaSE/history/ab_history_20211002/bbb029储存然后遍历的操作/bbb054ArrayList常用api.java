package wo1261931780.stjavaSE.history.ab_history_20211002.bbb029储存然后遍历的操作;

import java.util.ArrayList;

/**
 * ArrayList构造方法：
 * public ArrayList?()：创建一个空的集合对象
 * ArrayList添加方法：
 * public boolean add(E e)：将指定的元素追加到此集合的末尾
 * public void add(int index,E element)：在此集合中的指定位置插入指定的元素
 */
public class bbb054ArrayList常用api {
    public static void main(String[] args) {
        // 需要导包
        ArrayList<String> xx = new ArrayList<>();
        // 这里无法自动识别，必须添加双引号
        xx.add("S");
        xx.add("SS");
        xx.add("SSS");
        // 结果为：[S, SS, SSS]
        // 这里是在字符后面自动顺延添加字符串，
        // 比如[1,2]，add添加以后，自动变成[1,2,3]
        System.out.println(xx);
        System.out.println("-----------------------------------------");
        // 结果为：[S, SS, sada, SSS]
        xx.add(2, "sada");
        // 指定位置插入后，其他字符自动延后
        System.out.println(xx);
        System.out.println("-----------------------------------------");
        System.out.println(xx.remove("S"));
        // 去除指定内容，并返回去除是否成功
        // 只会删除第一次出现的元素
        // 结果为：[SS, sada, SSS]
        System.out.println(xx);
        System.out.println("-----------------------------------------");
        System.out.println(xx.remove(2));
        // 去除指定位置元素，返回被去除的内容 SSS，
        // 结果为：[SS, sada]
        System.out.println(xx);
        System.out.println("-----------------------------------------");
        System.out.println(xx.set(1, "00"));
        // 返回(显示)被修改的元素sada
        // 修改后的结果：[SS, 00]
        System.out.println(xx);
        System.out.println("-----------------------------------------");
        System.out.println(xx.get(0));
        // 获得0号位置的元素SS
        // 结果：[SS, 00]
        System.out.println(xx);
        System.out.println("-----------------------------------------");
        System.out.println(xx.size());
        // 总长度：2
        // ArrayList<String> zz=new ArrayList<>("1","2","3","44","55","66","77","88","99","00");
        // System.out.println(zz);
    }

    public static void show() {
        ArrayList x = new ArrayList<>();
        // ArrayList<string> x=new ArrayList<>();如果指定了元素，add过程中就必须设置好对应的类型，否则
        x.add("11");
        x.add(22);
    }
}
