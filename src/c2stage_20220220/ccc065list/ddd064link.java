package c2stage_20220220.ccc065list;

import java.util.LinkedList;

/**
 * LinkedList集合的特有功能：
 * public void addFirst(E e)：在该列表开头插入指定的元素
 * public void addLast(E e)：将指定的元素追加到此列表的末尾
 * public E getFirst()：返回此列表中的第一个元素
 * public E getLast()：返回此列表中的最后一个元素
 * public E removeFirst()：从此列表中删除并返回第一个元素
 * public E removeLast()：从此列表中删除并返回最后一个元素
 */
public class ddd064link {
    public static void main(String[] args) {
        // 注意，这里的底层是链表
        LinkedList<String> x = new LinkedList<>();
        x.add("a1");
        x.add("a2");
        x.add("a3");
        System.out.println(x);
        x.addFirst("first_code");
        x.addLast("last_code");
        System.out.println(x);
        // [first_code, a1, a2, a3, last_code]
        System.out.println("----------------------------");
        System.out.println(x.getFirst());
        System.out.println(x.getLast());
        // 直接返回获取到的元素
        System.out.println("----------------------------");
        System.out.println(x.removeFirst());
        System.out.println(x.removeLast());
        // 返回被修改的元素
        System.out.println("----------------------------");
        System.out.println(x);
        // [a1, a2, a3]
    }
}
