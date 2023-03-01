package wo1261931780.stjavaSE.history.c2stage_20220203.ccc050包装类;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220203.ccc050包装类
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-11-24  星期六
 */
@Slf4j
public class ddd075自动装箱和拆箱的好处 {
	public static void main(String[] args) {
		Integer x = 23;// 这里是整数，但是是对象类型
		String x1 = x.toString();// 因为是对象，所以可以继承object类，有tostring方法
		// tostring方法将其变成一个字符串
		log.info(x1);
		// 字符串类型变成整数类型
		String x2 = "11";
		int x3 = Integer.parseInt(x2);
		log.info(String.valueOf(++x3));// 12
		String x4 = "123.12";
		Double x5 = Double.parseDouble(x4);
		log.info(String.valueOf(++x5));// 124.12
		// *****************************************
		int x6 = Integer.valueOf(x2);// 这里x2必须是整数类型，否则报错
		Double x7 = Double.valueOf(x4);// 同理，包装类只能转化为对应的类型
		// 直接使用valueof进行转换即可
	}
}
