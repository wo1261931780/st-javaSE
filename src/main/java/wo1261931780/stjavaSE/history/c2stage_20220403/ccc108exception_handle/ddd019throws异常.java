package wo1261931780.stjavaSE.history.c2stage_20220403.ccc108exception_handle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ddd019throws异常 {
    public static void main(String[] args) {
        werror();
        Scanner x = new Scanner(System.in);
        System.out.println("YYYY-MM-dd");
        String x1 = x.nextLine();
        // dddx(x1);
        try {
            dddx(x1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // 自动这里也可以重新抛出异常，也可以直接try...catch跳过

    }

    /**
     * 运行异常，也称为非受检异常
     * 写代码的时候没问题，但是执行程序的时候出现错误信息
     */
    public static void werror() {
        int[] x = {1, 2, 3};
        System.out.println(x[3]);
    }

    /**
     * 编译异常，也称为受检异常
     * 写代码的时候，parse就提示错误信息
     */
    public static void dddx(String x) throws ParseException {
        // 这里，官方给出的定义：throws ParseException
        // 添加异常到方法声明
        // 这里只是添加一个待办，实际上没有解决问题
        // 延缓了编译异常，但是main方法中依然会报错
        SimpleDateFormat x1 = new SimpleDateFormat("YYYY-MM-dd");
        Date x2 = x1.parse(x);
        System.out.println(x2);
    }
}
