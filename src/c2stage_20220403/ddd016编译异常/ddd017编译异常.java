package c2stage_20220403.ddd016编译异常;
/*
    Java 中的异常被分为两大类：编译时异常和运行时异常，也被称为受检异常和非受检异常
    所有的 RuntimeException 类及其子类的实例被称为运行时异常，其他的异常都是编译时异常

    编译时异常：必须显示处理，否则程序就会发生错误，无法通过编译
    运行时异常：无需显示处理，也可以和编译时异常一样处理
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ddd017编译异常 {

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
