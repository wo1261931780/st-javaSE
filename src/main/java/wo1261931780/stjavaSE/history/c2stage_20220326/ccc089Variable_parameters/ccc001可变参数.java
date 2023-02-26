package c2stage_20220326.ccc089Variable_parameters;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-12-13  星期六
 */
public class ccc001可变参数 {
    public static void main(String[] args) {
        show(123);
        show(222);
        show(222, 123, 1234123456);
        show(new int[2]);
        show(123123, 12, 31, 23, 123);
        show(12, 12, 3, 12, 31);
    }

    public static void show(int... num) {
        // 这里的格式是：int类型的数组，数组的长度和参数不设置
        // 可变参数，实际上就是将num作为int类型，
        // 然后num本质上是一个数组，这个数组的长度和参数可变
        System.out.println("参数：" + num);
        System.out.println("参数长度：" + num.length);
        System.out.println(Arrays.toString(num));
    }

    public static void show2(int x, int... demo) {
        // 可变参数只能在内部有一个，
        // 但是可变参数不影响单个参数的存在
    }

    // public static void show2(int... demo,int x2) {
    // 可变参数放到前面没影响，但是放到后面不可以，
    // 所有的参数都会默认被可变参数接收
    // }
    // public static void show2(int x, int... demo,int x2) {
    // 同理，这里也不能放到后面
    // }
    public static void show2(int x, int x2, int... demo) {
        // 所以可变参数放到前面没影响，但是放到后面不行
    }
}
