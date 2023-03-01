package wo1261931780.stjavaSE.history.c2stage_20220502.ccc181Junit_framework;

import java.lang.reflect.Method;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc181Junit_framework
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-21-10  星期一
 */
public class ccc002 {
    public static void main(String[] args) {
        ccc002 o = new ccc002();
        Class x = ccc002.class;
        Method[] demo = x.getDeclaredMethods();
        for (Method method : demo) {
            if (method.isAnnotationPresent(ccc001.class)) {
                // 方法，必须保留有类的注解
                // 这个地方要注意
                try {
                    method.invoke(o);// 这里还是需要新建对象
                } catch (Exception e) {
                    // throw new Exception(e);
                    e.printStackTrace();
                }

            }
        }
    }

    @ccc001
    public static void show() {
        System.out.println("自动运行1");
    }

    @ccc001
    public static void show2() {
        System.out.println("自动运行2");
    }

    public static void show3() {
        System.out.println("自动运行3");
    }

    public static void show4() {
        System.out.println("自动运行4");
    }

    @ccc001
    public static void show5() {
        System.out.println("自动运行5");
    }
}
