package wo1261931780.stjavaSE.history.c2stage_20220203.ccc042date_case;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class ddd062case {
	public static void main(String[] args) throws ParseException {
		String x = "2022年2月4日21:05:33";
		long stTime = showTime(x);
		String x2 = "2022年2月4日21:15:33";
		long endTime = showTime(x2);

		String s1 = "2022年2月4日21:06:26";
		long p1 = showTime(s1);
		winLose(p1, stTime, endTime);
		// log.info(winlose(p1, st_time, end_time));
		String s2 = "2022年2月4日21:15:44";
		long p2 = showTime(s2);
		winLose(p2, stTime, endTime);
		// log.info(winlose(p2, st_time, end_time));
	}


	public static boolean winLose(long xx, long stTime, long endTime) {
		if (xx > stTime && xx < endTime) {
			log.info("成功");
			return true;
		} else {
			log.info("失败");
			return false;
		}
	}

	public static long showTime(String xx) throws ParseException {
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
		Date m1 = f1.parse(xx);
		return m1.getTime();
	}
}
