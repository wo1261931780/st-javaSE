package wo1261931780.stjavaSE.history.c2stage_20220203.ccc040api_date;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

@Slf4j
public class ddd057课堂运行 {
	public static void main(String[] args) throws ParseException {
		Scanner x = new Scanner(System.in);
		log.info("请输入字符串：");
		String x1 = x.nextLine();
		Date x2 = new Date();
		String x3 = ddd056课堂写法.Datetostring(x2, "yyyy-MM-dd-HH-mm-ss");
		log.info(x3);
		// log.info("请输入字符串：");
		// String x2 = x.nextLine();
		Date x4 = ddd056课堂写法.stringtodate(x1, "yyyy-MM-dd-HH-mm-ss");
		log.info(String.valueOf(x4));
	}
}
