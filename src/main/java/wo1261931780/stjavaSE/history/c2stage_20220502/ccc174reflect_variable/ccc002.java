package wo1261931780.stjavaSE.history.c2stage_20220502.ccc174reflect_variable;



import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc174reflect_variable
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-15-06  星期一
 */
public class ccc002 {
    // @Test
    public void show_v() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class x = ccc001.class;
        // Constructor constructor = x.getConstructor();
        // ddd050做数组拷贝 o = (ddd050做数组拷贝) constructor.newInstance();
        Field[] fields = x.getDeclaredFields();// 可以拿所有变量
        for (Field field : fields) {
            System.out.println(field.getName() + "-----" + field.getType());
        }
    }
    // @Test
    public void show_v2() {
        Class x = ccc001.class;
        Field[] fields = x.getFields();// 只能拿到公开变量
        for (Field field : fields) {
            System.out.println(field.getName() + "-----" + field.getType());
        }
    }
    // @Test
    public void show_v3() throws NoSuchFieldException, IllegalAccessException {
        Class x = ccc001.class;
        // Field age = x.getField("age");
        Field age = x.getDeclaredField("age");
        age.setAccessible(true);// 这里设置的不是访问权限，而是读写权限，
        // 本身private是不会变化的，可以照常访问，但是无法修改
        ccc001 demo = new ccc001();
        age.set(demo, 123);// 赋值
        System.out.println(demo);// ddd050做数组拷贝{name='null', address='null', age=123}
        System.out.println(age + "------" + age.getType());
        // private int c2stage_20220502.ccc174reflect_variable.ddd050做数组拷贝.age------int
        int res = (Integer) age.get(demo);// 根据变量，得到值
        System.out.println(res);
    }
}
