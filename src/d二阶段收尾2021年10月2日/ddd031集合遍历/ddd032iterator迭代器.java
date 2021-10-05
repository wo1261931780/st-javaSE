package d二阶段收尾2021年10月2日.ddd031集合遍历;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ddd032iterator迭代器 {
    public static void main(String[] args) {
        Collection<String> x = new ArrayList<>();
        x.add("aaa1");
        x.add("aaa2");
        x.add("aaa3");
        Iterator<String> x1 = x.iterator();
        // 这里返回的是Iterator的实现类，
        // 也是一个Itr的对象
        // -----------------------------------------------------------
        // 说人话，
        // 这里是集合x调用了内部的iterator方法，
        // 而iterator方法，返回了一个Itr的对象，
        // iterator本身是一个接口，相当于Itr是这个接口的实现类
        // 换句话说，x1是通过多态的方式创建出来的
        // -----------------------------------------------------------
        // 源代码为接口，我们要找实现类
        // public Iterator<E> iterator() {
        //     return new ArrayList.Itr();
        // 返回该接口的实现类对象，Itr实现了iterator接口
        // }
        // private class Itr implements Iterator<E> {
        // ...
        // }
        // ArrayList中的结构，返回的是一个Itr
        // -----------------------------------------------------------
        System.out.println(x1.next());
        // 上面调用完方法后，实际上是多态方式创建了接口对象x1，
        // x1可以使用接口中的next方法
        System.out.println(x1.next());
        System.out.println(x1.next());
        // System.out.println(x1.next());
        // 上述的next方法，实际是按照顺序展示对应元素，超出集合范围直接报错
        // NoSuchElementException
        // -----------------------------------------------------------
        x1.hasNext();
        // 返回true/false，判断下一个元素是否存在
        if (x1.hasNext()) {
            System.out.println(x1.next());
        }
        
        System.out.println("执行完毕");


    }
}
