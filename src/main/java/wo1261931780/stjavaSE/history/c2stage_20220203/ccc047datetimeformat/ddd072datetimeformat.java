package wo1261931780.stjavaSE.history.c2stage_20220203.ccc047datetimeformat;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
public class ddd072datetimeformat {
	public static void main(String[] args) {
		LocalDateTime x = LocalDateTime.now();
		log.info("默认的时间对象" + x);
		DateTimeFormatter x1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");
		log.info("格式化器：" + x1.format(x));
		log.info("日期对象逆向格式化：" + x.format(x1));
		// ******************************************************
		DateTimeFormatter string_x = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		// 这里的时间必须按照指定格式设置，如果单纯按照2020-11-11，会报错
		LocalDateTime xx = LocalDateTime.parse("2020-11-11 11:11:11", string_x);// 注释见上文
		log.info("获取当年的天数：" + xx.getDayOfYear());
	}
}
