package c2stage_20220403.ccc105exceptions;

/**
 * 目标：常见的编译时异常认识。
 * <p>
 * 编译时异常：继承自Exception的异常或者其子类，没有继承RuntimeException
 * "编译时异常是编译阶段就会报错"，
 * 必须程序员编译阶段就处理的。否则代码编译就报错！！
 * <p>
 * 编译时异常的作用是什么：
 * 是担心程序员的技术不行，在编译阶段就爆出一个错误, 目的在于提醒!
 * 提醒程序员这里很可能出错，请检查并注意不要出bug。
 * 编译时异常是可遇不可求。遇到了就遇到了呗。
 */

/**
 * JVM的默认处理方案
 * 目标：异常的产生默认的处理过程解析。(自动处理的过程！)
 * （1）默认会在出现异常的代码那里自动的创建一个异常对象：ArithmeticException。
 * （2）异常会从方法中出现的点这里抛出给调用者，调用者最终抛出给JVM虚拟机。
 * （3）虚拟机接收到异常对象后，先在控制台直接输出异常栈信息数据。
 * （4）直接从当前执行的异常点干掉当前程序。
 * （5）后续代码没有机会执行了，因为程序已经死亡。
 * <p>
 * 小结：
 * 异常一旦出现，会自动创建异常对象，最终抛出给虚拟机，虚拟机
 * 只要收到异常，就直接输出异常信息，干掉程序！！
 * <p>
 * 默认的异常处理机制并不好，一旦真的出现异常，程序立即死亡！
 */
public class ddd012jvm处理方案 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        int[] arr = {1, 2, 3};
        //        System.out.println(arr[1]);
        System.out.println(arr[3]);
    }

    // 下面是异常展示，
    // jvm出现问题后，会停止虚拟机运行，
    // ArrayIndexOutOfBoundsException是错误原因
    // Index 3错误位置，java:16行数
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    // at c2stage_20220403.ccc105exceptions.ddd012jvm处理方案.method(ddd012jvm处理方案.java:16)
    // at c2stage_20220403.ccc105exceptions.ddd012jvm处理方案.main(ddd012jvm处理方案.java:9)
}
