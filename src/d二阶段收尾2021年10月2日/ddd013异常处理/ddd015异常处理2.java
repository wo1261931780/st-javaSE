package d二阶段收尾2021年10月2日.ddd013异常处理;
/*
    public String getMessage():返回此 throwable 的详细消息字符串
    public String toString():返回此可抛出的简短描述
    public void printStackTrace():把异常的错误信息输出在控制台
 */

import java.io.Serializable;

public class ddd015异常处理2 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        try {
            int[] x = {1, 1, 2};
            System.out.println(x[3]);
        } catch (ArrayIndexOutOfBoundsException x) {
            // 在源代码中，catch内部相当于一个构造方法：
            // new ArrayIndexOutOfBoundsException("x");
            // x就是下面构造参数中的对象
            // ----------------------------------------------
            // 异常的输出语句一共三个：
            // getmessage
            // tostring
            // printstacktrace
            // 三个语句打印的结果不同
            // ----------------------------------------------
            System.out.println(x.getMessage());
            // 1.语句输出：
            // Index 3 out of bounds for length 3
            // ----------------------------------------------
            System.out.println(x.toString());
            // 2.语句输出：
            // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            // ----------------------------------------------
            x.printStackTrace();
            // 3.语句输出：
            // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            // at d二阶段收尾2021年10月2日.ddd013异常处理.ddd014异常处理2.method(ddd014异常处理2.java:20)
            // at d二阶段收尾2021年10月2日.ddd013异常处理.ddd014异常处理2.main(ddd014异常处理2.java:13)
            // ----------------------------------------------
            // 需要注意的是：
            // 上面两个命令都可以用对象来接受结果，但是printstacktrace不可以，但是信息最全，用得最多
        }
        // 源代码：
        // public class Throwable {

        // private String detailMessage;

        // public Throwable(String message) {
        //             detailMessage = message;
        //     }
        // public String getMessage() {
        //     return detailMessage;
        //     }
        // }
        // 外部首先传递一个对象x过来，
        // x调用getmessage方法，获得返回的detailMessage，
        // 在构造方法中，detailMessage的数据来源于message，
        // 2021年10月3日15:09:08，这里总感觉有问题


    }
}
