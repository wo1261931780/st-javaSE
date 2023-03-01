package wo1261931780.stjavaSE.history.c2stage_20220203.ccc045Localdatetime;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

@Slf4j
public class ddd067Localtime {
	// Localtime/ LocalDate/ LocalDateTime

	public static void main(String[] args) {
		// 1、获取本地时间对象。
		LocalTime nowTime = LocalTime.now();
		log.info("今天的时间：" + nowTime);// 今天的时间：

		int hour = nowTime.getHour();// 时
		log.info("hour：" + hour);// hour：

		int minute = nowTime.getMinute();// 分
		log.info("minute：" + minute);// minute：

		int second = nowTime.getSecond();// 秒
		log.info("second：" + second);// second：

		int nano = nowTime.getNano();// 纳秒
		log.info("nano：" + nano);// nano：

		log.info("---------------");
		log.info(LocalTime.of(8, 20).toString());// 时分
		log.info(LocalTime.of(8, 20, 30).toString());// 时分秒
		log.info(LocalTime.of(8, 20, 30, 150).toString());// 时分秒纳秒
		// LocalTime mTime = LocalTime.of(8, 20, 30, 150);

		log.info("---------------");
		log.info(LocalDateTime.of(1991, 11, 11, 8, 20).toString());
		log.info(LocalDateTime.of(1991, Month.NOVEMBER, 11, 8, 20).toString());
		log.info(LocalDateTime.of(1991, 11, 11, 8, 20, 30).toString());
		log.info(LocalDateTime.of(1991, Month.NOVEMBER, 11, 8, 20, 30).toString());
		log.info(LocalDateTime.of(1991, 11, 11, 8, 20, 30, 150).toString());
		log.info(LocalDateTime.of(1991, Month.NOVEMBER, 11, 8, 20, 30, 150).toString());
	}
}
