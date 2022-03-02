package c2stage_20220302.ccc079linkedhashset;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet集合特点
 * 1:哈希表和链表实现的Set接口，具有可预测的迭代次序
 * 2:由链表保证元素有序，也就是说元素的存储和取出顺序是一致的
 * 3:由哈希表保证元素唯一，也就是说没有重复的元素
 */

public class ddd080linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<String> x = new LinkedHashSet<>();
        x.add("a1");
        x.add("a2");
        x.add("a3");
        x.add("a4");
        x.add("a5");
        x.add("a5");
        x.add("a5");
        for (String i : x) {
            System.out.println(i);
        }
    }

}
