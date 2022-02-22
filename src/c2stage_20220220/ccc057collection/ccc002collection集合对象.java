package c2stage_20220220.ccc057collection;

import java.util.ArrayList;
import java.util.Collection;

public class ccc002collection集合对象 {
    public static void main(String[] args) {
        System.out.println("开始执行");
        Collection<String> x = new ArrayList<>();
        // 通过多态的方式，创建子类对象
        // ArrayList<String> x1=new ArrayList<>();
        // 类似上面的方式
        x.add("aaaa");
        x.add("bbb");//add方法返回true和false
        x.add("ccc");//表示添加成功
        System.out.println(x);
        // 上面代码的结果：[aaaa, bbb, ccc]
    }
}
