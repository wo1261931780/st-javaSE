package c2stage_20220326.ccc094map_for;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326.ccc094map_for
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-17-28  星期日
 */
public class ccc003lambda表达式 {
    public static void main(String[] args) {
        Map<String, Integer> x = new HashMap<>();
        x.put("a1", 11);
        x.put("a2", 22);
        x.put("a3", 33);
        x.put("a4", 44);
        x.put("a5", 55);
        x.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + "---------" + integer);
            }
        });
        x.forEach((s, inter) -> System.out.println(s + "" + inter));
    }
}
