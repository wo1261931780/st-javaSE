package wo1261931780.stjavaSE.history.d_review_20221221;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:d_review_20221221
 *
 * @author liujiajun_junw
 * @Date 2022-12-19-02  星期三
 * @description
 */
public class ddd001 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("请输入分钟：");
		int input_time = x.nextInt();
		System.out.println("输入时间是：" + input_time + "分钟");
		if (input_time < 0) {
			System.out.println("时间错误，请重新输入");
			return;
		}
		int re_minutes = input_time > 60 ? input_time : input_time % 60;
		System.out.println("当前剩余时间是：" + re_minutes + "分钟");
		re_minutes--;
		// int re_second = 60;
		for (int re_second = 60; re_second >= 0; re_second--) {
				if (re_second == 0 && re_minutes != 0) {
					re_minutes--;
					re_second = 60;
				}
				if (re_second == 0 && re_minutes == 0) {
					System.out.println("倒计时结束");
					break;
				}
				System.out.println("当前剩余时间是：" + re_minutes + "分钟," + re_second + "秒");
		}
	}
}
