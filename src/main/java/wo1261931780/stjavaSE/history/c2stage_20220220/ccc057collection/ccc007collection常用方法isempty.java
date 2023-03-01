package wo1261931780.stjavaSE.history.c2stage_20220220.ccc057collection;

import java.util.ArrayList;
import java.util.Collection;

public class ccc007collection常用方法isempty {
    public static void main(String[] args) {
        System.out.println("开始");
        Collection<String> x = new ArrayList<>();
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        System.out.println(x.isEmpty());
        // false
        // 集合是否为空
    }
}
