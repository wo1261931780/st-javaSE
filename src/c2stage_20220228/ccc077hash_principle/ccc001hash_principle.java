package c2stage_20220228.ccc077hash_principle;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220228.ccc077hashset
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-22-10  星期一
 */
public class ccc001hash_principle {
    public static void main(String[] args) {
        String x = "demo1";
        String x1 = "demo";
        System.out.println(x.hashCode());
        System.out.println(x.hashCode());
        System.out.println(x1.hashCode());

        // hash算法：
        // JDK8的新特性，使用哈希值和数组的长度求余，
        // 举例：
        // 一个哈希值对数组的长度求余，长度为16，
        // 那么余数一定在0-15之间
        // 所以根据结果，就将元素放在对应位置（index为0-15）

        // 计算出应该存入的位置
        // （也正是因为结果来自计算，所以无法对结果进行排序）

        // null，直接存入，
        // 不是null，就equals比较内容以后存入
        // JDK7是新元素占老元素的位置，指向老元素，替换掉
        // JDK8，老元素在新元素下面挂载
        // 多次挂载，相同索引的就形成了一个链表的形式
    }
}
