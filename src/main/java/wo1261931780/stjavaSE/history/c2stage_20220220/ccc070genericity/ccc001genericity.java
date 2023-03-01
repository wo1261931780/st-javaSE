package wo1261931780.stjavaSE.history.c2stage_20220220.ccc070genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc070genericity
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-22-48  星期六
 */
public class ccc001genericity {
    public static void main(String[] args) {
        // 泛型的介绍
        List<String> x = new ArrayList<>();
        x.add("java");
        x.add("java");
        x.add("java");
        // x.add(23.3);// 无法添加双浮点类型
        List x1 = new ArrayList();// 在未指定类型的情况下，默认可以添加所有类型
        x1.add(23.3);
        x1.add("demo");
        x1.add("demo");
        x1.add(true);
        for (Object i : x1) {
            // String ccc038demo = (String) x1;// 强转失败
            // 泛型比较灵活
        }
    }
}
