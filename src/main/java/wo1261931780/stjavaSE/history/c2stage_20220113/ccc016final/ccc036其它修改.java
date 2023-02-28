package wo1261931780.stjavaSE.history.c2stage_20220113.ccc016final;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ccc036其它修改 {
	public static void main(String[] args) {
		// final修改，将变量的数据固定为常量，后续无法对变量赋值
		final int age = 20;
		log.info(String.valueOf(age));

		// final处理新建对象，固定地址数据

		final ccc034zi x = new ccc034zi();
		x.age = 20;
		log.info(String.valueOf(x.age));
	}
}
