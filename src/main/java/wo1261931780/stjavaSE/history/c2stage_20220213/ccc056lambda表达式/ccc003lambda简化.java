package wo1261931780.stjavaSE.history.c2stage_20220213.ccc056lambda表达式;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc056lambda表达式
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-22-28  星期五
 */
@Slf4j
public class ccc003lambda简化 {
	public static void main(String[] args) {
		ccc001FunctionalInterface x = new ccc001FunctionalInterface() {
			@Override
			public void show() {
				log.info("简化1");
			}
		};
		show(x);
		// ******************************************
		ccc001FunctionalInterface x1 = () -> {
			log.info("简化2");
		};
		show(x1);
		// ******************************************
		ccc001FunctionalInterface x2 = () -> log.info("简化3");
		show(x2);

		// ******************************************
		// ccc001FunctionalInterface x3 = () -> log.info("简化4");
		show(() -> log.info("简化4"));
	}

	public static void show(ccc001FunctionalInterface x) {
		x.show();
		log.info("结束");
	}
}
