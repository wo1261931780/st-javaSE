package wo1261931780.stjavaSE.history.c2stage_20220203.ccc045Localdatetime;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.Month;

@Slf4j
public class ddd068Localdate {
	public static void main(String[] args) {
		// 1、获取本地日期对象。
		LocalDate nowDate = LocalDate.now();
		log.info("今天的日期：" + nowDate);// 今天的日期：

		int year = nowDate.getYear();
		log.info("year：" + year);

		int month = nowDate.getMonthValue();
		log.info("month：" + month);

		int day = nowDate.getDayOfMonth();
		log.info("day：" + day);

		// 当年的第几天
		int dayOfYear = nowDate.getDayOfYear();
		log.info("dayOfYear：" + dayOfYear);

		// 星期
		log.info(nowDate.getDayOfWeek().toString());
		log.info(String.valueOf(nowDate.getDayOfWeek().getValue()));

		// 月份
		log.info(nowDate.getMonth().toString());// AUGUST
		log.info(String.valueOf(nowDate.getMonth().getValue()));// 8

		log.info("------------------------");
		LocalDate bt = LocalDate.of(1991, 11, 11);
		log.info(bt.toString());// 直接传入对应的年月日
		log.info(LocalDate.of(1991, Month.NOVEMBER, 11).toString());// 相对上面只是把月换成了枚举
	}
}
