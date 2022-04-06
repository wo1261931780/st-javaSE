package c2stage_20220403.ccc106by_exceptions;
/*
    Java 中的异常被分为两大类：编译时异常和运行时异常，也被称为受检异常和非受检异常
    所有的 RuntimeException 类及其子类的实例被称为运行时异常，其他的异常都是编译时异常

    编译时异常：必须显示处理，否则程序就会发生错误，无法通过编译
    运行时异常：无需显示处理，也可以和编译时异常一样处理
 */

/**
 * 目标：编译时异常的处理方式一。
 * <p>
 * 编译时异常：编译阶段就会报错，一定需要程序员处理的，否则代码无法通过！！
 * <p>
 * 抛出异常格式：
 * 方法 throws 异常1 ,  异常2 , ..{
 * <p>
 * }
 * 建议抛出异常的方式：代表可以抛出一切异常，
 * 方法 throws Exception{
 * <p>
 * }
 * <p>
 * 方式一：
 * 在出现编译时异常的地方层层把异常抛出去给调用者，调用者最终抛出给JVM虚拟机。
 * JVM虚拟机输出异常信息，直接干掉程序，这种方式与默认方式是一样的。
 * 虽然可以解决代码编译时的错误，但是一旦运行时真的出现异常，程序还是会立即死亡！
 * 这种方式并不好!
 * <p>
 * 小结：
 * 方式一出现异常层层跑出给虚拟机，最终程序如果真的出现异常，程序还是立即死亡！这种方式不好！
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ccc003编译异常1 {

    public static void main(String[] args) {
        werror();
        Scanner x = new Scanner(System.in);
        System.out.println("YYYY-MM-dd");
        String x1 = x.nextLine();
        dddx(x1);
    }

    /**
     * 运行异常，也称为非受检异常
     * 写代码的时候没问题，但是执行程序的时候出现错误信息
     */
    public static void werror() {
        try {
            int[] x = {1, 2, 3};
            System.out.println(x[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println(e);
            e.printStackTrace();
            System.out.println("程序已经执行");
        }
    }

    /**
     * 编译异常，也称为受检异常
     * 写代码的时候，parse就提示错误信息
     */
    public static void dddx(String x) {
        try {
            SimpleDateFormat x1 = new SimpleDateFormat("YYYY-MM-dd");
            Date x2 = x1.parse(x);
            // 错误代码
            // ParseException
            System.out.println(x2);
        } catch (ParseException e) {
            // System.out.println("错误代码ParseException");
            e.printStackTrace();
        }
        // return x2;
    }
}
