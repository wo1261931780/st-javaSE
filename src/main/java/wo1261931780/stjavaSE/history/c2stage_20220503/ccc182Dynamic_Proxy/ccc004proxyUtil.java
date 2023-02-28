package c2stage_20220503.ccc182Dynamic_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220503.ccc182Dynamic_Proxy
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-08-55  星期二
 */
public class ccc004proxyUtil {
    // public static ccc001service getproxy(ccc001service ccc038demo) {
    public static <T> T getproxy(T demo) {
        // public static Object newProxyInstance(ClassLoader loader,
        //                                           Class<?>[] interfaces,
        //                                           InvocationHandler h)
        Object o = Proxy.newProxyInstance(demo.getClass().getClassLoader(), demo.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long starttime = System.currentTimeMillis();// 一开始的处理

                Object result = method.invoke(demo, args);// 分别代表被传入的对象，传入的参数

                long endtime = System.currentTimeMillis();// 之后的处理
                System.out.println(method.getName() + "方法耗时：" + (endtime - starttime) / 1000.00 + "s");
                return result;
            }
        });
        // 类加载器，先获得class对象，然后根据class对象调用类加载器，底层重新获得一个新的类
        // return (ccc001service) o;// 这里返回的本质上是一个service对象
        return (T) o;// 使用泛型，扩大适用范围
    }
}
