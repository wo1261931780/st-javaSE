package wo1261931780.stjavaSE.history.c2stage_20220203.ccc046instant;

import lombok.extern.slf4j.Slf4j;

import java.sql.Date;
import java.time.Instant;
import java.time.ZoneId;

@Slf4j
public class ddd071Instant {
	public static void main(String[] args) {
		Instant x = Instant.now();
		log.info("默认国际标准时间：" + x);// 2022-02-06T06:45:00.892641100Z
		log.info("当前时区标准时间：" + x.atZone(ZoneId.systemDefault()));// 2022-02-06T14:45:00.892641100+08:00[Asia/Shanghai]
		// 默认国际标准时间：2022-02-06T06:45:00.892641100Z
		// 当前时区标准时间：2022-02-06T14:45:00.892641100+08:00[Asia/Shanghai]
		// 二者差别在于时区，和时间戳后面跟的毫秒值
		// ******************************************
		// Date x1 = Date.from(x);//直接写会报错
		java.util.Date dateTransf = Date.from(x);// 将instant迁移到date类型
		log.info("instant迁移到date：" + dateTransf);// Sun Feb 06 14:53:10 CST 2022
		Instant instTransf = dateTransf.toInstant();// date迁移到instant类型
		log.info("date迁移到instant：" + instTransf);// 2022-02-06T06:53:10.203Z
	}
}
