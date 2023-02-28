package wo1261931780.stjavaSE.history.c2stage_20220113.ccc005代码块;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ccc002代码块2 {

	private String name;

	/**
	 属于对象的，与对象一起加载，自动触发执行。
	 */
	{
		log.info("==无参构造代码块被触发执行一次==");
		name = "张麻子";
	}

	public ccc002代码块2() {
		log.info("==无参构造器被触发执行==");
	}

	public static void main(String[] args) {
		// 目标：学习构造代码块的特点、基本作用
		ccc002代码块2 t = new ccc002代码块2();
		log.info(t.name);

		ccc002代码块2 t1 = new ccc002代码块2();
		log.info(t1.name);
	}

	// 最终结果
	// ==构造代码块被触发执行一次==
	// ==无参构造器被触发执行==
	// 张麻子
	// ==构造代码块被触发执行一次==
	// ==无参构造器被触发执行==
	// 张麻子


}
