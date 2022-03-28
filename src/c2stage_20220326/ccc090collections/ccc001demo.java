package c2stage_20220326.ccc090collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326.ccc090collections
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-15-51  星期六
 */
public class ccc001demo {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        // x.add("a1");
        // x.add("a2");
        // x.add("a3");
        // x.add("a4");
        // x.add("a5");
        Collections.addAll(x, "a1", "a2", "a3", "a4", "a5");
        System.out.println(x);// [a1, a2, a3, a4, a5]
        // Collections<? super cat,cat... x> demo=new eee035collections()
        // 解释一下上面的代码
        // 首先有一个可变参数cat... x，cat就是对象类
        // 这里就是collections通过api，进行批量添加数据

        Collections.shuffle(x);
        // 这里只能对list进行操作
        System.out.println(x);// [a4, a3, a1, a2, a5]

        Collections.sort(x);// 重新排序
        System.out.println(x); // [a1, a2, a3, a4, a5]
        // 对于指定的对象类型，只要实现了排序comparator接口，排序还是可以进行的
    }

}
