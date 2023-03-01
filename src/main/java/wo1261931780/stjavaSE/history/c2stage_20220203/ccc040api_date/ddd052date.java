package wo1261931780.stjavaSE.history.c2stage_20220203.ccc040api_date;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * 目标：学会使用Date类处理时间，获取时间的信息
 */
@Slf4j
public class ddd052date {
	public static void main(String[] args) {
		Date x = new Date();
		log.info("时间是：" + x);// 时间是：Thu Feb 03 23:03:22 CST 2022
		long x1 = x.getTime();// 直接获取当前时间的毫秒值，1643900602715
		log.info(String.valueOf(x1));// 1643900602715
		log.info("**********************");
		// 其实每次命令执行都是有时间的，为什么这个时间没有计算进入毫秒值
		Date x2 = new Date();
		x2.setTime(x1);// 这里set可以直接使用毫秒值，也可以使用new出来的默认date
		log.info(String.valueOf(x2));// Thu Feb 03 23:03:22 CST 2022
		// 实际上，是新建了一个date类型的对象
		// 而这个date类型的，内部有get/set方法
		Date x3 = new Date(x1);// 直接传入一个确定的时间作为参数，进行设置
		log.info(String.valueOf(x3));
		show();
	}

	public static void show() {
		// 获取系统时间的几种方式：
		Date demo1 = new Date();
		long millis = System.currentTimeMillis(); // 直接获取当前ms值
		log.info(String.valueOf(millis));
		demo1.setTime(millis);// 将其转化为date类型输出
		log.info(String.valueOf(demo1));
		log.info(String.valueOf(new Date(System.currentTimeMillis())));// 直接这样写也可以
	}
}
