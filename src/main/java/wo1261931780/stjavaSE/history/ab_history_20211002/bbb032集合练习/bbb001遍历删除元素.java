package ab_history_20211002.bbb032集合练习;

import java.util.ArrayList;

public class bbb001遍历删除元素 {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(97);
        x.add(123);
        x.add(214);
        x.add(23);
        x.add(53);
        x.add(66);
        x.add(456);
        x.add(74);
        x.add(4);
        ArrayList<Integer> x1 = show(x);
        System.out.println(x1);
    }

    public static ArrayList<Integer> show(ArrayList<Integer> x) {
        // for (int i = 0; i < x.size(); i++) {
        //     if (x.get(i) < 80) {
        //         x.remove(i);
        //     }
        // }
        // 集合的大小可变，从前删除会出现数组长度缩小和index发生变化的问题
        // 直接倒着删除即可

        for (int i = x.size() - 1; i > 0; i--) {
            if (x.get(i) < 80) {
                x.remove(i);
            }
        }
        return x;
    }
}
