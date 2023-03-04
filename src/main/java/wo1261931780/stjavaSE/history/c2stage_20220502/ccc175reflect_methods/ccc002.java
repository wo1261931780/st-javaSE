package wo1261931780.stjavaSE.history.c2stage_20220502.ccc175reflect_methods;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc175reflect_methods
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-16-03  星期一
 */
public class ccc002 {
	// @Test
	public void show_method() {
		Class x = ccc001dog.class;
		Method[] declaredMethods = x.getDeclaredMethods();
		for (Method demo : declaredMethods) {
			System.out.println(demo.getName() + "------" + demo.getReturnType() + "-------" + demo.getParameterCount());
			// getName------class java.lang.String
			// setName------void
			// eat------void
		}
	}

	// @Test
	public void show_invoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		Class x = ccc001dog.class;
		Method eat = x.getDeclaredMethod("eat", String.class);
		eat.setAccessible(true);
		ccc001dog demo = new ccc001dog();

		Object res = eat.invoke(demo, "123");// 反射的意义，是将方法/参数的调用反转，让方法使用对象，而不是对象使用方法
		System.out.println(res);
	}
}
