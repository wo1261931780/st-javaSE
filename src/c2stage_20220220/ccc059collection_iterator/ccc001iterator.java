package c2stage_20220220.ccc059collection_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc059collection_iterator
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-20-13  星期四
 */
public class ccc001iterator {
    public static void main(String[] args) {
        Collection<String> x = new ArrayList<>();
        x.add("c1");
        x.add("c4");
        x.add("c3");
        x.add("c2");
        Iterator<String> demo = x.iterator();
        System.out.println(x);// 本身就进行过一次重写，所以直接展示结果
        // [c1, c4, c3, c2]
        // System.out.println(demo.hasNext());//返回是否有结果，true/false
        // System.out.println(demo.next());//返回具体的结果，c1
        while (demo.hasNext()) {// 是否有结果，true/false
            // String xx= demo.next();// 将元素取出来，然后赋值给xx
            //同时，移动到下一个元素
            System.out.println(demo.next());
        }
        // 迭代器，如果索引越界，会直接抛出异常，导致程序崩溃
    }
    public static void show(){
        Collection<String> x = new ArrayList<>();
        x.add("c1");
        x.add("c4");
        x.add("c2");
        Iterator<String> demo = x.iterator();
        while (demo.hasNext()) {
            System.out.println(demo.next());
            System.out.println(demo.next());
        }
        // 上面相当于询问一次，移动两次，
        // 如果是偶数元素个数，没有问题
        // 如果是奇数元素个数，会报错，因为索引越界
    }
}
