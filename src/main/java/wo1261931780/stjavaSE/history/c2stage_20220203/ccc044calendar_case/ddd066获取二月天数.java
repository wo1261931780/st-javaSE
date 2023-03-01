package wo1261931780.stjavaSE.history.c2stage_20220203.ccc044calendar_case;

/**
 * 需求：
 * 获取任意一年的二月有多少天
 * <p>
 * 思路：
 * 1:键盘录入任意的年份
 * 2:设置日历对象的年、月、日
 * 年：来自于键盘录入
 * 月：设置为3月，月份是从0开始的，所以设置的值是2
 * 日：设置为1日
 * 3:3月1日往前推一天，就是2月的最后一天
 * 4:获取这一天输出即可
 */

import lombok.extern.slf4j.Slf4j;

import java.util.Calendar;
import java.util.Scanner;

@Slf4j
public class ddd066获取二月天数 {
	public static void main(String[] args) {
		Calendar x = Calendar.getInstance();
		Scanner x1 = new Scanner(System.in);
		log.info("请输入具体时间：");
		int x2 = x1.nextInt();
		x.set(x2, Calendar.MARCH, 1);
		// 设置具体年月日
		// 月份是从0开始计算的，所以输入3，实际上是2月
		// 同时，设置日期为1，那么就会得到3.1的初始时间
		// x.get(Calendar.DAY_OF_MONTH);
		x.add(Calendar.DATE, -1);
		// 在设定好初始时间以后，对日期进行增减操作
		// 最终得到的时间，是3.1日往前一天，也就得到二月份的最终日期
		int mm = x.get(Calendar.MONTH) + 1;
		// 这里加一，是为了方便展示
		int dd = x.get(Calendar.DATE);
		// int mm = x.get(Calendar.MONTH);
		// int dd = x.get(Calendar.DATE) - 5;
		// 这里的get方法，做出的展示全部是基于数字的
		// 所以会出现和实际情况不匹配的日历时间
		// 比如我设定3.1，在展示的时候给日期-5，最终得到3.-4
		log.info(mm + "," + dd);
	}
}
