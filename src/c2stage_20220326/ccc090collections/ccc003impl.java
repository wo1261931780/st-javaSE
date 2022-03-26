package c2stage_20220326.ccc090collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326.ccc090collections
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-16-13  星期六
 */
public class ccc003impl {
    public static void main(String[] args) {
        List<ccc002object> x = new ArrayList<>();
        Collections.sort(x, new Comparator<ccc002object>() {
            @Override
            public int compare(ccc002object o1, ccc002object o2) {
                return o1.getAge() - o2.getAge();
            }
        });
    }

    public static void show2(List<ccc002object> x) {
        // Collections.sort(x, (ccc002object o1, ccc002object o2) -> {
        //     return o1.getAge() - o2.getAge();
        // });
        // Collections.sort(x, (o1, o2) -> {
        //     // return o1.getAge() - o2.getAge();
        //     return Integer.compare(o1.getAge(), o2.getAge());
        // });
        Collections.sort(x, (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));
        // lambda表达式，最简化的场景：对象名->重写后的方法体
    }
}
