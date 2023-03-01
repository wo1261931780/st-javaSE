package wo1261931780.stjavaSE.history.c2stage_20220403.ccc105exceptions;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc105exceptions
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-13-04  星期日
 */


/**
 * 目标：异常的概念和体系。
 * <p>
 * 什么是异常？
 * 异常是程序在"编译"或者"执行"的过程中可能出现的问题。
 * 异常是应该尽量提前避免的。
 * 异常可能也是无法做到绝对避免的，异常可能有太多情况了，开发中只能提前干预！！
 * 异常一旦出现了，如果没有提前处理，程序就会退出JVM虚拟机而终止，开发中异常是需要提前处理的。
 * <p>
 * 研究异常并且避免异常，然后提前处理异常，体现的是程序的安全, 健壮性！！！
 * Java会为常见的代码异常都设计一个类来代表。
 * <p>
 * 异常的体系:
 * Java中异常继承的根类是：Throwable。
 * <p>
 * Throwable(根类，不是异常类)
 * /              \
 * Error           Exception（异常，需要研究和处理）
 * /            \
 * 编译时异常      RuntimeException(运行时异常)
 * <p>
 * <p>
 * Error : 错误的意思，严重错误Error，无法通过处理的错误，一旦出现，程序员无能为力了，
 * 只能重启系统，优化项目。
 * 比如内存奔溃，JVM本身的奔溃。这个程序员无需理会。
 * <p>
 * Exception:才是异常类，它才是开发中代码在编译或者执行的过程中可能出现的错误，
 * 它是需要提前处理的。以便程序更健壮！
 * <p>
 * Exception异常的分类:
 * 1.编译时异常：继承自Exception的异常或者其子类，编译阶段就会报错，
 * 必须程序员处理的。否则代码编译就不能通过！！
 * <p>
 * 2.运行时异常: 继承自RuntimeException的异常或者其子类，编译阶段是不会出错的，它是在
 * 运行时阶段可能出现，运行时异常可以处理也可以不处理，编译阶段是不会出错的，
 * 但是运行阶段可能出现，还是建议提前处理！！
 * 小结：
 * 异常是程序在编译或者运行的过程中可能出现的错误！！
 * 异常分为2类：编译时异常，运行时异常。
 * -- 编译时异常：继承了Exception,编译阶段就报错，必须处理，否则代码不通过。
 * -- 运行时异常：继承了RuntimeException,编译阶段不会报错，运行时才可能出现。
 * 异常一旦真的出现，程序会终止，所以要研究异常，避免异常，处理异常，程序更健壮!!
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
