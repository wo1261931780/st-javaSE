package wo1261931780.stjavaSE.history.c2stage_20220502.ccc176operator_class;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc176operator_class
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-16-32  星期一
 */
public class ccc001 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> x1 = new ArrayList<>();
        List<String> x2 = new ArrayList<>();
        System.out.println(x1.getClass());// class java.util.ArrayList
        System.out.println(x1.getClass() == x2.getClass());// true

        System.out.println("---------------------------------------");
        List<Integer> x3 = new ArrayList<>();
        x3.add(123);
        x3.add(123);
        Class demo = x3.getClass();
        Method add = demo.getDeclaredMethod("add", Object.class);
        boolean res = (Boolean) add.invoke(x3, "测试");
        System.out.println(x3);// [123, 123, 测试]
        System.out.println(res);// true
        System.out.println("---------------------------------------");
        List x4 = x3;// 把地址赋值给x4
        x4.add(true);
        x4.add("555");
        System.out.println(x3);//[123, 123, 测试, true, 555]
    }
}
