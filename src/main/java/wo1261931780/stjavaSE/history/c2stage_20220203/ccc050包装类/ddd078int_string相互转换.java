package wo1261931780.stjavaSE.history.c2stage_20220203.ccc050包装类;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ddd078int_string相互转换 {
	public static void main(String[] args) {
		int xx = 10;
		// 这里的所有操作也必须是在完全数字的情况下进行
		// int类型转化为string类型
		// 先定义为string
		String x1 = String.valueOf(xx);
		log.info(String.valueOf(xx));
		log.info("----------------");

		String s = "200";
		// 转化为integer
		Integer s1 = Integer.valueOf(s);
		// 然后变成int
		int s2 = s1.intValue();
		log.info(String.valueOf(s2));
		log.info("----------------");

		// 这里调用方法直接变成int
		int w = Integer.parseInt(s);
		log.info(String.valueOf(w));
	}
}
