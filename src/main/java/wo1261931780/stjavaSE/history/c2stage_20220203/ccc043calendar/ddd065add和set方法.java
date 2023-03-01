package wo1261931780.stjavaSE.history.c2stage_20220203.ccc043calendar;

import lombok.extern.slf4j.Slf4j;

import java.util.Calendar;

/**
 * public abstract void add?(int field, int amount):
 * <p>
 * 根据日历的规则，将指定的时间量添加或减去给定的日历字段
 * <p>
 * public final void set?(int year,int month,int date):
 * <p>
 * 设置当前日历的年月日
 */
@Slf4j
public class ddd065add和set方法 {
	public static void main(String[] args) {
		log.info("开始测试");
		Calendar x = Calendar.getInstance();
		// int yy = x.get(Calendar.YEAR);
		// int mm = x.get(Calendar.MONTH)+1;
		// int dd = x.get(Calendar.DATE);
		// log.info(yy + "," + mm + "," + dd);
		// -------------------------------------------------------------------
		// x.add(Calendar.YEAR, -10);
		// public abstract void add?(int field, int amount):根据日历的规则，将指定的时间量添加或减去给定的日历字段
		// add方法，执行的是时间的添加操作
		// 这里的添加，可以是正数，也可以是负数
		// 例如，当前时间2021，10，3
		// add添加-10以后，得到的时间为：2011，10，3
		// int yy = x.get(Calendar.YEAR);
		// int mm = x.get(Calendar.MONTH) + 1;
		// int dd = x.get(Calendar.DATE);
		// log.info(yy + "," + mm + "," + dd);
		// -------------------------------------------------------------------
		// public final void set?(int year,int month,int date):设置当前日历的年月日
		// x.set(2088, 10, 10);// 用下面的常量，比较规范
		x.set(2088, Calendar.NOVEMBER, 10);
		// 上面的set方法，也是专门针对日历对象x设置的
		// 在设置时间后，仍然可以在下面进行数据的添加和删除
		int yy = x.get(Calendar.YEAR);
		// int mm = x.get(Calendar.MONTH);// 10
		int mm = x.get(Calendar.MONTH) + 1;// 11
		int dd = x.get(Calendar.DATE) + 20;
		log.info(yy + "," + mm + "," + dd);
		// 最终结果：2088,11,30
	}
}
