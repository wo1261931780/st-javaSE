package wo1261931780.stjavaSE.history.c2stage_20220502.ccc172reflect;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc172reflect
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-14-24  星期一
 */
public class ccc015 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 这里使用的是全限名=包名+类名
        Class x = Class.forName("c2stage_20220502.ccc172reflect.ddd036object");
        // 反射，实际上是将类作为一个对象进行操作
        Class x2 = ccc014object.class;

        ccc014object x3 = new ccc014object();
        Class x4 = x3.getClass();
    }
}
