package c2stage_20220502.ccc177reflect_framework;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc177reflect_framework
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-16-51  星期一
 */
public class ccc002 {
    public static void main(String[] args) {
        ccc001 x = new ccc001();
        x.setName("111");
        x.setAge("222");
        x.setAddress("333");
        show(x);
    }
    public static void show(Object obj) {
        Class x = ccc001.class;
        Field[] variable = x.getDeclaredFields();
        Method[] demo_m = x.getDeclaredMethods();
        for (Field field : variable) {
            try (
                    PrintStream pr = new PrintStream(new FileOutputStream("src/c2stage_20220502/ccc177reflect_framework/ccc038demo.txt", true));
            ) {
                // pr.println(field.getName() + "------" + field.getType());
                // pr.println("全限名：" + x.getName());
                // pr.println("简单名称：" + x.getSimpleName());
               pr.println("----------------------" + x.getSimpleName() + "----------------------");
                field.setAccessible(true);
                String o = field.get(obj) + "";// 获取变量在对象中的值
                pr.println("简单名称：" + x.getSimpleName() + "变量名：" + o);
                // Method getName = x.getDeclaredMethod("getName", String.class);
                // getName.invoke(obj,"123");
            } catch (Exception e) {
                // throw new RuntimeException(e);
                e.printStackTrace();
            }
        }
    }
}
