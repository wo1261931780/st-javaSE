package c2stage_20220502.ccc173reflect_class;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc173reflect_api
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-14-37  星期一
 */
public class ccc002 {
    @Test
    public void showcons() {
        Class x = ccc001object.class;
        Constructor[] demo = x.getConstructors();
        for (Constructor constructor : demo) {
            System.out.println(constructor.getName() + "----内部的参数数量：" + constructor.getParameterCount());
        }
    }
    @Test
    public void showallcons() {
        Class x = ccc001object.class;
        Constructor[] demo = x.getDeclaredConstructors();
        for (Constructor constructor : demo) {
            System.out.println(constructor.getName() + "----内部的参数数量：" + constructor.getParameterCount());
        }
    }
    @Test
    public void showsinglecons() throws NoSuchMethodException {
        Class x = ccc001object.class;
        Constructor demo = x.getConstructor();// 注意这里，尾巴没有s，只能获得单个构造器
        // 这里默认获取public修饰的
        System.out.println(demo.getName() + "----内部的参数数量：" + demo.getParameterCount());
    }
    @Test
    public void showparticularcons() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class x = ccc001object.class;
        Constructor demo = x.getDeclaredConstructor();// 只要构造器存在，就可以获得
        demo.setAccessible(true);// 对于private修饰的构造器，直接暴力反射，打开访问性，
        // 但是这里是一次性的
        ccc001object o = (ccc001object) demo.newInstance();
        // 根据获得的构造器，直接新建一个对象
        // 这里新建的对象都是被默认初始化的，需要自己赋值
        System.out.println(o);// ccc001{name='null', address='null', age=0}
        System.out.println(demo.getName() + "----内部的参数数量：" + demo.getParameterCount());
        System.out.println("-----------------------------");
        Constructor demo1 = x.getDeclaredConstructor(String.class, String.class, int.class);// 根据参数的类型去获得对应的构造器
        System.out.println(demo1.getName() + "----内部的参数数量：" + demo1.getParameterCount());
        ccc001object o1 = (ccc001object) demo1.newInstance("111", "111", 123);
        System.out.println(o1);// ccc001{name='111', address='111', age=123}
    }
}
