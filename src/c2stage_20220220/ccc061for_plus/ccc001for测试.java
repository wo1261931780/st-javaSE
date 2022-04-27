package c2stage_20220220.ccc061for_plus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc060增强for
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-13-12  星期五
 */
public class ccc001for测试 {
    public static void main(String[] args) {
        showint();
        showstring();
        // 这里直接切换不同的元素即可
        // 也可以直接切换为对象，例如新建一个student类，然后对类中的元素执行遍历
    }

    public static void showint() {
        int[] x = {1, 32, 16, 54, 654, 8, 7};
        System.out.println(Arrays.toString(x));// [1, 32, 16, 54, 654, 8, 7]
        for (int i : x) {
            System.out.println(i);
        }
    }

    public static void showstring() {
        Collection<String> x = new ArrayList<>();
        x.add("demo1");
        x.add("demo2");
        x.add("demo3");
        x.add("demo4");
        System.out.println("集合：" + x);// 集合：[demo1, demo2, demo3, demo4]
        for (String i : x) {
            System.out.println("集合元素：" + i);
        }
    }
}
