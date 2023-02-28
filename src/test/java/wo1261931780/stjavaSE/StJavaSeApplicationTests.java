package wo1261931780.stjavaSE;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class StJavaSeApplicationTests {

	@Test
	 void arrst() {
		String x="abd";
		char[] democh = x.toCharArray();
		System.out.println("返回一个字符数组：" + Arrays.toString(democh));
	}

}
