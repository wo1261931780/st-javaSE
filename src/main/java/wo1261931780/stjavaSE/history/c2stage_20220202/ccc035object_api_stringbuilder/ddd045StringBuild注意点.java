package wo1261931780.stjavaSE.history.c2stage_20220202.ccc035object_api_stringbuilder;

// 使用stringbuilder类的意义在于：
// 每次使用string设置字符串，都会因为新字符串，出现一个新的内存地址
// 进而导致内存占用过多
// stringbuilder可以理解为一个可变容器

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ddd045StringBuild注意点 {
	public static void main(String[] args) {
		// 上面一共两种构造方法，一种带参数，一种不带参数
		StringBuilder a1 = new StringBuilder();
		// new也可以通过后缀，自动补充前缀
		StringBuilder demostring = new StringBuilder("111");
		// demostring的结果为111
		log.info("demostring的字符为：" + demostring);
		log.info("-------------------------------------------");

		StringBuilder x0 = demostring.append(222);
		// x0的意思是，在demostring的后面加上222，然后赋值给x0
		// 输出x0，实际上会输出已经增加长度的demostring
		// 同时，这里是把demostring赋值给x0，所以二者地址相同，
		log.info("x0的结果为：" + x0);// 结果是111222333

		log.info("-------------------------------------------");

		if (demostring == x0) {// 结果为true
			log.info(String.valueOf(true));
			log.info("demostring和x0完全相同");
		} else {
			log.info(String.valueOf(false));
			log.info("不相同");
		}
		log.info("-------------------------------------------");

		demostring.append("iii");// 括号内是字符串需要加上双引号，其他可以直接跟结果
		demostring.append(555).append(666).append(777);// 链式编程，也说明不需要加前缀。,而且结果是直接跟在后面
		log.info("demostring的字符为：" + demostring);// 结果为111222333iii555666777
		log.info("-------------------------------------------");

		if (demostring == x0) {
			log.info(String.valueOf(true));
			log.info("现在x0的数据为：" + x0);// 结果是111222333iii555666777
		} else {
			log.info(String.valueOf(false));
		}
		log.info("-------------------------------------------");
		// 这里demostring和xx一起改变
		demostring.reverse();
		// 直接进行字符串反转，前提要求demostring是string类型
		// 反转字符串以后，demostring展示：777666555iii333222111
		log.info("demostring的字符为：" + demostring);
	}
}
