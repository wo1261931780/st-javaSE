package wo1261931780.stjavaSE.history.c2stage_20220220.ccc065list;
/*
    List集合特点
        有序：存储和取出的元素顺序一致
        可重复：存储的元素可以重复
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ddd040list {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.add("a1");
        x.add("a2");
        x.add("a3");
        x.add("a4");
        x.add("a5");
        // 迭代器的方式遍历
        // list属于collection的子类，
        // 所以同样可以调用collection的方法
        // list属于collection的子类，又属于arraylist的父类
        // 所以list的特有方法，collection中没有，但是ArrayList中存在
        Iterator<String> x1 = x.listIterator();
        while (x1.hasNext()) {
            System.out.println(x1.next());
        }
    }
}
