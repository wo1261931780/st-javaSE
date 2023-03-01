package wo1261931780.stjavaSE.history.c2stage_20220203.ccc045Localdatetime;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;

@Slf4j
public class ddd070updatetime {

	public static void main(String[] args) {
		LocalTime nowTime = LocalTime.now();
		log.info(String.valueOf(nowTime));// 当前时间
		log.info(String.valueOf(nowTime.minusHours(1)));// 一小时前
		log.info(String.valueOf(nowTime.minusMinutes(1)));// 一分钟前
		log.info(String.valueOf(nowTime.minusSeconds(1)));// 一秒前
		log.info(String.valueOf(nowTime.minusNanos(1)));// 一纳秒前
		log.info("----------------");

		log.info(String.valueOf(nowTime.plusHours(1)));// 一小时后
		log.info(String.valueOf(nowTime.plusMinutes(1)));// 一分钟后
		log.info(String.valueOf(nowTime.plusSeconds(1)));// 一秒后
		log.info(String.valueOf(nowTime.plusNanos(1)));// 一纳秒后

		log.info("------------------");
		// 不可变对象，每次修改产生新对象！
		log.info(String.valueOf(nowTime));

		log.info("---------------");
		LocalDate myDate = LocalDate.of(2018, 9, 5);
		LocalDate nowDate = LocalDate.now();

		log.info("今天是2018-09-06吗？ " + nowDate.equals(myDate));// 今天是2018-09-06吗？ false
		log.info(myDate + "是否在" + nowDate + "之前？ " + myDate.isBefore(nowDate));// 2018-09-05是否在2018-09-06之前？ true
		log.info(myDate + "是否在" + nowDate + "之后？ " + myDate.isAfter(nowDate));// 2018-09-05是否在2018-09-06之后？ false

		log.info("---------------------------");
		// 判断今天是否是你的生日
		LocalDate birDate = LocalDate.of(1996, 8, 5);
		LocalDate nowDate1 = LocalDate.now();

		MonthDay birMd = MonthDay.of(birDate.getMonthValue(), birDate.getDayOfMonth());
		MonthDay nowMd = MonthDay.from(nowDate1);

		log.info("今天是你的生日吗？ " + birMd.equals(nowMd));// 今天是你的生日吗？ false
	}
}
