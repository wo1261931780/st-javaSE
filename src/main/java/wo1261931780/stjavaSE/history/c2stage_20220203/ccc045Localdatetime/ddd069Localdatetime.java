package wo1261931780.stjavaSE.history.c2stage_20220203.ccc045Localdatetime;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Slf4j
public class ddd069Localdatetime {
	public static void main(String[] args) {
		// 日期 时间
		LocalDateTime nowDateTime = LocalDateTime.now();
		log.info("今天是：" + nowDateTime);// 今天是：
		log.info(String.valueOf(nowDateTime.getYear()));// 年
		log.info(String.valueOf(nowDateTime.getMonthValue()));// 月
		log.info(String.valueOf(nowDateTime.getDayOfMonth()));// 日
		log.info(String.valueOf(nowDateTime.getHour()));// 时
		log.info(String.valueOf(nowDateTime.getMinute()));// 分
		log.info(String.valueOf(nowDateTime.getSecond()));// 秒
		log.info(String.valueOf(nowDateTime.getNano()));// 纳秒
		// 日：当年的第几天
		log.info("dayOfYear：" + nowDateTime.getDayOfYear());// dayOfYear：249
		// 星期
		log.info(String.valueOf(nowDateTime.getDayOfWeek()));// THURSDAY
		log.info(String.valueOf(nowDateTime.getDayOfWeek().getValue()));// 4
		// 月份
		log.info(String.valueOf(nowDateTime.getMonth()));// SEPTEMBER
		log.info(String.valueOf(nowDateTime.getMonth().getValue()));// 9

		LocalDate ld = nowDateTime.toLocalDate();
		log.info(String.valueOf(ld));

		LocalTime lt = nowDateTime.toLocalTime();
		log.info(String.valueOf(lt.getHour()));
		log.info(String.valueOf(lt.getMinute()));
		log.info(String.valueOf(lt.getSecond()));
	}
}
