package wo1261931780.stjavaSE.history.c2stage_20220113.ccc018Enumeration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ccc039demo {
	public static void main(String[] args) {

	}

	public static void show(ccc038demo x) {
		// 可以理解为，我在枚举中创建了一个类
		// 然后这个类可以有几种不同的
		switch (x) {
			case demo1:
				log.info("1");
				break;
			case demo2:
				log.info("12");
				break;
			case demo3:
				log.info("13");
				break;
			case demo4:
				log.info("14");
				break;
			default:
				log.info("end");
				break;
		}
	}
}
