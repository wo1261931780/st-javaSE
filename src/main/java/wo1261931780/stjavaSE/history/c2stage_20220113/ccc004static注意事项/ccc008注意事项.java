package wo1261931780.stjavaSE.history.c2stage_20220113.ccc004static注意事项;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ccc008注意事项 {
	public static String name1;
	String name2;

	public static void show1() {
		log.info(name1);
		// log.info(name2);//直接报错，静态方法不能直接访问成员变量

		ccc008注意事项 x = new ccc008注意事项();
		log.info(x.name2);// 只能先创建一个对象，通过间接的方式访问name

		show2();// 静态方法可以访问静态方法
		// show3();//静态方法不能直接访问实例方法
		// log.info(this);//同样的，不能直接访问this，因为this指向的就是对象
	}

	public static void show2() {
		log.info("我是show2");
	}

	public void show3() {
	}
}
