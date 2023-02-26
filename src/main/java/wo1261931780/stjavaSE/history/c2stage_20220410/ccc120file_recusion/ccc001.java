package c2stage_20220410.ccc120file_recusion;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220410.ccc120file_recusion
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-10-51  星期日
 */
public class ccc001 {
    public static void main(String[] args) {
        show();
    }

    public static void show() {
        System.out.println("进入方法1");
        // show();
        // 方法调用本身，就是递归，
        // 出现递归的时候，左边会给出提示
        // 如果递归没有出口，就会报错，因为递归太深
        // 这个时候报错信息，就是栈内存溢出，因为方法都是在栈内存中加载
        show2();
        System.out.println("方法执行结束");
    }

    private static void show2() {
        System.out.println("show2被调用");
        show3();// 方法内，调用其他的方法，这种叫间接递归
    }

    private static void show3() {
        System.out.println("show3被调用");
        show();//再回到方法1，出现死循环
    }
    // 整体的执行流程是：
    // 方法1出现，加载方法2
    // 方法2执行，调用方法3
    // 方法3出现，回到方法1，如果这里没有结果，就直接结束
    // 然后结束的顺序：3-2-1
    // 最后回到方法1，输出：方法结束

}
