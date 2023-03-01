package wo1261931780.stjavaSE.history.c2stage_20220220.ccc067list_analysis;

import java.util.LinkedList;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc067list_analysis
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-20-30  星期六
 */
public class ccc001list分析 {
    public static void main(String[] args) {
        LinkedList<String> x = new LinkedList<>();
        // 测试特有功能的时候，就不能按照多态去做
        x.addFirst("1q");
        x.addFirst("2q");
        x.addFirst("3q");
        x.addFirst("4q");
        x.addFirst("5q");
        x.addFirst("6q");
        // 先进，后出
        // 栈的队列结构
        System.out.println(x);// [6q, 5q, 4q, 3q, 2q, 1q]

        // ************************
        System.out.println("获取第一个子弹：" + x.getFirst());// 6q
        // 按照栈的结构，先进后出
        System.out.println("打出第一个子弹：" + x.removeFirst());
        System.out.println(x);// 剩余子弹
        System.out.println("***********");
        show();
        showpush();
    }

    public static void show() {
        LinkedList<String> x = new LinkedList<>();
        x.addLast("第1个");
        x.addLast("第2个");
        x.addLast("第3个");
        x.addLast("第4个");
        x.addLast("第5个");
        x.addLast("第6个");
        System.out.println(x);// [第1个, 第2个, 第3个, 第4个, 第5个, 第6个]
        // 按照生活的添加顺序
        System.out.println(x.removeFirst());// 第1个
        System.out.println(x);// [第2个, 第3个, 第4个, 第5个, 第6个]
    }

    public static void showpush() {
        LinkedList<String> x = new LinkedList<>();
        x.addFirst("1a");
        x.push("demo");// 源代码就是addfirst
        System.out.println(x);// [ccc038demo, 1a]
        System.out.println(x.pop());// ccc038demo，源代码就是removefirst

        System.out.println(x.offerLast("lll"));//返回有没有成功，源代码就是addlast
    }
}
