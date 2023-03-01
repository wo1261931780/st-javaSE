package wo1261931780.stjavaSE.history.c2stage_20220503.ccc182Dynamic_Proxy;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220503.ccc182Dynamic_Proxy
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-08-45  星期二
 */
public class ccc003test {
    public static void main(String[] args) {
        // ccc001service x=new ccc002serviceimpl();
        ccc001service x=ccc004proxyUtil.getproxy(new ccc002serviceimpl());
        // 动态代理的思想，本质上是切面编程——
        // 在方法的前面和后面切入一段其他代码，实现对功能的增强，也称为AOP思想


        // 将原来的对象作为一个代理对象返回
        System.out.println(x.login("123","222"));
        x.deleteuser();
        x.deleteuser("111","222");
    }
}
