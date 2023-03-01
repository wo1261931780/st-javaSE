package wo1261931780.stjavaSE.history.c2stage_20220203.ccc040api_date;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * SimpleDateFormat是一个解析器
 * <p>
 * 将string类型的对象通过parse解析为一个字符串
 * <p>
 * 或者将一个date类型的对象format为一个字符串
 * <p>
 * 说白了，format产生一个字符串，parse产生一个date对象
 */
@Slf4j
public class ddd055date {
	private ddd055date() {
	}

	public static void main(String[] args) throws ParseException {
		log.info("开始运行---------");
		Scanner x = new Scanner(System.in);
		log.info("请输入时间(YYYY-MM-dd-HH-mm-ss)");
		String x1 = x.nextLine();
		log.info(stringToDate(x1).toString());
		log.info("-----------------------------");
		String x2 = dateToString(stringToDate(x1));
		log.info(x2);
	}

	/**
	 * 输入指定格式字符串，将其解析为date类型的时间对象
	 *
	 * @param x 字符串
	 * @return date类型对象
	 * @throws ParseException
	 */
	public static Date stringToDate(String x) throws ParseException {
		SimpleDateFormat x2 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date x1 = x2.parse(x);
		// 注意事项：
		// 1.转换必须按照SimpleDateFormat中的格式进行
		// 意味着，输入的时候就必须按照这个格式操作
		// 2.解析的结果，按照标准结果出现
		// 标准格式：
		// Sun Dec 27 11:22:33 CST 1998
		log.info("转换结束");
		// date类型的时间格式都是这样：
		// Sun Dec 26 03:03:03 CST 2021
		return x1;
	}

	/**
	 * date类型对象解析为字符串
	 *
	 * @param x date对象
	 * @return 字符串，2022-12-26-030303
	 */
	public static String dateToString(Date x) {
		SimpleDateFormat x1 = new SimpleDateFormat("yyyy-MM-dd-HHmmss");
		String x2 = x1.format(x);// 2022-12-26-030303
		return x2;
	}
}
