package wo1261931780.stjavaSE;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class StJavaSeApplicationTests {

	@Test
	// public static void test_showres() {// 不能是static静态的，因为需要创建实例来测试结果
	public void TestShowResult() {
		// ccc001 x = new ccc001();
		log.info("TestShowResult我执行了------------");

		// String res = x.login("admin", "123");
		// 有返回值的时候才需要去断言
		// 平时不需要这样
		// Assertions.assertEquals("登录成功", res, "账号密码错误");
	}

	@Test
	public void TestCalculate() {
		// ccc001 x = new ccc001();
		log.info("TestCalculate执行了------------");
		// x.showres();// java.lang.ArithmeticException: / by zero
	}

	@BeforeEach
	public void BeforeMethod() {
		log.info("我在方法以后执行一次");
	}

	@AfterEach
	public void AfterMethod() {
		log.info("我在方法之前执行一次");
	}

	@BeforeAll
	public static void BeforeAll() {
		// public void beforeAll() {
		log.info("我在类加载之前执行---------");
	}

	@AfterAll
	public static void AfterAll() {// 在类之前执行，因为类之前不存在实例，所以一定是静态的
		// public void AfterAll() {
		log.info("我在类加载之后执行---------");
	}
}
