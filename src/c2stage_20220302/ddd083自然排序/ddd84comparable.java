package c2stage_20220302.ddd083自然排序;

import java.util.TreeSet;

public class ddd84comparable {
    public static void main(String[] args) {
        TreeSet<ddd85对象类> x = new TreeSet<>();
        // 这里的无参构造方法，是使用自然排序对元素进行处理
        // 但是，为了按照我们所需要的要求，
        // 需要对compare方法进行重写

        ddd85对象类 x1 = new ddd85对象类("a1", 11);
        ddd85对象类 x2 = new ddd85对象类("a2", 22);
        ddd85对象类 x3 = new ddd85对象类("a3", 33);
        ddd85对象类 x4 = new ddd85对象类("a4", 44);
        ddd85对象类 x5 = new ddd85对象类("d5", 44);
        ddd85对象类 x6 = new ddd85对象类("d5", 44);
        // 录入相同的元素，保证了元素的唯一性
        x.add(x2);
        x.add(x1);
        x.add(x4);
        x.add(x3);
        x.add(x5);
        x.add(x6);
        for (ddd85对象类 i : x) {
            System.out.println(i.getName() + "," + i.getAge());
        }
        // 111
    }
}
