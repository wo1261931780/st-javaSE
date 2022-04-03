package c2stage_20220403.ccc105exceptions;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc105exceptions
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-13-04  星期日
 */
public class ccc001runtime_exceptions {
    public static void main(String[] args) {


    }

    public static void show1() {
        // 常见的异常种类：
        int[] x = {12, 123, 13};
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        // System.out.println(x[3]);// 出现索引异常
    }

    public static void show2() {
        String x2 = null;
        System.out.println(x2);
        // System.out.println(x2.length());//空指针异常
    }

    public static void show3() {
        Object x = 23;
        String x2 = (String) x;//强制类型转换
    }

    public static void show4() {
        int x = 10 / 0;//数学处理异常
        String x1 = "a321sd56";
        Integer demo = Integer.valueOf(x1);//编译阶段不报错，运行阶段发现无法转换
        System.out.println(demo);
    }

}
