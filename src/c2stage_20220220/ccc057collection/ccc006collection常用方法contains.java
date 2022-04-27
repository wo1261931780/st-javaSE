package c2stage_20220220.ccc057collection;

import java.util.ArrayList;
import java.util.Collection;

public class ccc006collection常用方法contains {
    public static void main(String[] args) {
        System.out.println("开始");
        Collection<String> x = new ArrayList<>();
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        x.contains("bbb");
        System.out.println(x.contains("bbb"));
        // false
        // 判断元素是否存在
        x.add("bbb");
        System.out.println(x.contains("bbb"));
    }
}
