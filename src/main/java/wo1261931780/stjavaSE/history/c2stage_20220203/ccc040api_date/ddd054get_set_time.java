package wo1261931780.stjavaSE.history.c2stage_20220203.ccc040api_date;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * public long getTime():获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
 * <p>
 * public void setTime(long time):设置时间，给的是毫秒值
 *
 * @author junw
 */

@Slf4j
public class ddd054get_set_time {
	public static void main(String[] args) {
		Date dd = new Date();
		log.info(String.valueOf(dd));
		// 结果为：
		// Sat Oct 02 18:13:35 CST 2021
		// dd.setTime(12648);
		log.info(String.valueOf(dd.getTime()));// 1677670153015
		// gettime实际上获取的是，标准时间到具体时间，两个时间差距的毫秒数
		log.info(String.valueOf(dd.getTime() / 1000 / 3600 / 24 / 365));
		// 上面的代码，获取的时间为标准时间到目前时间，经过的年份
		// -----------------------------------------------
		long x2 = System.currentTimeMillis();
		dd.setTime(x2);
		log.info(String.valueOf(dd));
		// 上面的set和get方法，都需要有一个dd存在才可以进行
	}
}
