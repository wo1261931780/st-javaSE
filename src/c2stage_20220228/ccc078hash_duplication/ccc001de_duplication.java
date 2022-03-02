package c2stage_20220228.ccc078hash_duplication;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220228.ccc078hash_duplication
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-22-43  星期一
 */
public class ccc001de_duplication {
    public static void main(String[] args) {
        // set集合只会使用默认的equals方法去判断是否相同
        // 如果有一个对象类，需要判断对象类中的内容是否相同
        // 就需要重写hashcode和equals方法
        Set<ccc002st_object> x = new HashSet<>();
        x.add(new ccc002st_object("demo", 11, "aa"));
        x.add(new ccc002st_object("demo", 11, "aa"));
        x.add(new ccc002st_object("demo", 12, "aa"));
        // 对象类去除重复，直接在对象类中重写equals和hashcode方法即可
        System.out.println(x);
    }
}
