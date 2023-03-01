package wo1261931780.stjavaSE.history.c2stage_20220203.ccc048period;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.Period;

@Slf4j
public class ddd073period {
	public static void main(String[] args) {
		LocalDate x = LocalDate.now();// 首先获取一个当前的时间
		log.info("输出：" + x);
		LocalDate bd = LocalDate.of(1996, 11, 22);// 然后设置一个指定时间
		log.info("生日：" + bd);
		Period xx = Period.between(bd, x);// 第二个参数减去第一个参数
		// period获取两个时间的差值
		log.info("年：" + xx.getYears());
		// 年：25
		log.info("月：" + xx.getMonths());
		// 月：2
		log.info("日：" + xx.getDays());
		// 日：15
		// *********************************************************
		System.out.printf("自定义时间：%d年%d月%d日", xx.getYears(), xx.getMonths(), xx.getDays());
	}
}
