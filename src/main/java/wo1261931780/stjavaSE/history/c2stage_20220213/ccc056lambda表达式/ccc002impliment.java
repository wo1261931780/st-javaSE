package wo1261931780.stjavaSE.history.c2stage_20220213.ccc056lambda表达式;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc056lambda表达式
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-20-36  星期五
 */
@Slf4j
public class ccc002impliment {
	public static void main(String[] args) {
		ccc001FunctionalInterface x = new ccc001FunctionalInterface() {
			@Override
			public void show() {
				log.info("show");
			}
		};
		// 正因为接口内部只有一个方法，所以可以认定匿名内部类的重写形式完全相同
		// 同时，代码简化也能够被java理解

		ccc001FunctionalInterface x1 = () -> {// 括号内就是形参
			log.info("show");
		};
		// 前面我们说过，匿名内部类本身就是一个对象
		// 因此，可以直接调用匿名内部类来进一步简化
		run(() -> {
			log.info("进一步的简化形式");
		});
	}

	public static void run(ccc001FunctionalInterface x) {
		x.show();
		log.info("我是方法");
	}
}
