package wo1261931780.stjavaSE.history.c2stage_20220203.ccc043calendar;

import lombok.extern.slf4j.Slf4j;

import java.util.Calendar;
import java.util.Date;

@Slf4j
public class ddd063calendar {
	public static void main(String[] args) {
		Calendar x = Calendar.getInstance();// 相当于我新建了一个日历对象x
		// 日历的本质是，可变日期对象
		log.info(String.valueOf(x));
		// time=1644037567997,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
		// zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,
		// transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,
		// WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=5,DAY_OF_YEAR=36,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,
		// AM_PM=1,HOUR=1,HOUR_OF_DAY=13,MINUTE=6,SECOND=7,MILLISECOND=997,ZONE_OFFSET=28800000,DST_OFFSET=0
		// 直接输出，会得到日历中的所有信息, 但是我们只需要其中的一部分.

		int cYear = x.get(Calendar.YEAR);// 获取日历中的year数据
		// 然后将int类型的year数据赋值给c_year这个变量
		log.info("今年:" + cYear);
		log.info("未修改时间：" + x.getTimeInMillis());
		// boolean xx = x.getTimeInMillis() == x.get(Calendar.time());
		// 源代码：
		// protected long time;
		// time本身是存在日历中的，但是修饰符为protect，无法直接访问
		// 最关键的是，源代码没看明白
		// log.info(xx);

		x.add(Calendar.MONTH, 55);// 对日期进行增加操作

		log.info(String.valueOf(x.get(Calendar.YEAR)));// 即使增加了时间，前面展示的时间仍然是不变的
		log.info(String.valueOf(x.get(Calendar.YEAR)));// 但是后面的所有时间，因为基于同一个对象，所以会发生改变

		Date demoDate = x.getTime();// getTime方法，得到的是一个final常量
		log.info(String.valueOf(demoDate));// 这个常量
		log.info("时间毫秒值：" + x.getTimeInMillis());
	}
}
