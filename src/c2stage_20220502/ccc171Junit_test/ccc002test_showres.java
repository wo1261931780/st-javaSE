package c2stage_20220502.ccc171Junit_test;

import org.junit.jupiter.api.*;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc171Junit_test
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-13-51  星期一
 */
public class ccc002test_showres {
    @Test
    // public static void test_showres() {// 不能是static静态的，因为需要创建实例来测试结果
    public void test_showres() {
        ccc001 x = new ccc001();
        System.out.println("我执行了------------");

        String res = x.login("admin", "123");
        // 有返回值的时候才需要去断言
        // 平时不需要这样
        Assertions.assertEquals("登录成功", res, "账号密码错误");
    }

    @Test
    public void test_caculat() {
        ccc001 x = new ccc001();
        System.out.println("我执行了------------");

        x.showres();// java.lang.ArithmeticException: / by zero
    }

    @BeforeEach
    public void beforem() {
        System.out.println("我在方法以后执行一次");
    }

    @AfterEach
    public void afterm() {
        System.out.println("我在方法之前执行一次");
    }

    @BeforeAll
    public static void beforeAll() {
        // public void beforeAll() {
        System.out.println("我在类加载之前执行---------");

    }

    @AfterAll
    public static void AfterAll() {// 在类之前执行，因为类之前不存在实例，所以一定是静态的
        // public void AfterAll() {
        System.out.println("我在类加载之后执行---------");

    }


}
