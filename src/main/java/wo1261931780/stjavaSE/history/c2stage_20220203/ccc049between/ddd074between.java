package wo1261931780.stjavaSE.history.c2stage_20220203.ccc049between;

import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.time.LocalDateTime;

@Slf4j
public class ddd074between {
	public static void main(String[] args) {
		log.info("start");
		LocalDateTime x = LocalDateTime.now();
		log.info(String.valueOf(x));// 2022-02-06T17:16:46.805553300
		LocalDateTime bd = LocalDateTime.of(1996, 11, 22, 0, 0, 0);
		log.info("设定时间：" + bd);// 设定时间：1996-11-22T00:00
		// ****************************************************
		Duration xx = Duration.between(bd, x);
		log.info("天数：" + xx.toDays());// 天数：9207
		log.info("小时：" + xx.toHours());// 小时：220985
		log.info("分钟：" + xx.toMinutes());// 分钟：13259116
		log.info("秒数：" + xx.toMillis());// 秒数：795547006805
	}
}
