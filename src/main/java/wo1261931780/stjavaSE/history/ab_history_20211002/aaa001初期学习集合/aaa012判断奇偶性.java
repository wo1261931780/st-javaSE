package wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合;

import java.util.Random;
import java.util.Scanner;

public class aaa012判断奇偶性 {
	public static void main(String[] args) {
		Scanner b11 = new Scanner(System.in);
		System.out.println("请输入数值：");
		int x1 = b11.nextInt();
		// int xx = (x1 % 2);
		if (x1 % 2 == 1) {
			// x1除2的余数等于1
			System.out.println("输入数据：" + x1 + "为奇数");
		} else {
			System.out.println("输入数据：" + x1 + "为偶数");
		}
		show();
	}

	/**
	 * 判断数据的奇偶性
	 */
	public static void show() {
		System.out.println("show me money");
		Random random = new Random();
		int i = random.nextInt(200);
		System.out.println(i);
		int i1 = i % 2;
		String s = i1 > 0 ? "y" : "n";
		System.out.println(s);
	}
}
