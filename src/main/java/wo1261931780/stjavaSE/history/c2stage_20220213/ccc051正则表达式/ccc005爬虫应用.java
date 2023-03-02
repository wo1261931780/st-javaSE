package wo1261931780.stjavaSE.history.c2stage_20220213.ccc051正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc051正则表达式
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-17-03  星期日
 */
public class ccc005爬虫应用 {
	public static void main(String[] args) {
		// 首先拿到一个字符串
		String x = "来黑马程序学习Java,电话020-43422424，或者联系邮箱" +
				           "itcast@itcast.cn,电话18762832633，0203232323" +
				           "邮箱bozai@itcast.cn，400-100-3233 ，4001003232";
		// String regex = "(\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2})|(1[3-9]\\d{9})" + "|(0\\d{2,6}-?\\d{5,20})|(400-?\\d{3,9}-?\\d{3,9})";

		// 设置正则表达式，用来作为解析的规则
		String x1 = "(\\w{2,9}@\\w[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2})|(1[3-9]\\d{9})|(0\\d{2,6}-?\\d{5,20})|(400-?\\d{3,9}-?\\d{3,9})";
		// 上面每个|就是一个分组

		// 创建一个pattern对象，对象使用x1的规则
		Pattern x2 = Pattern.compile(x1);

		// 创建出来的对象，调用方法，解析拿到的字符串x
		Matcher x3 = x2.matcher(x);
		// 进行解析，按照分组获取结果
		while (x3.find()) {
			String demo1 = x3.group();
			System.out.println(demo1);
		}
	}
}
