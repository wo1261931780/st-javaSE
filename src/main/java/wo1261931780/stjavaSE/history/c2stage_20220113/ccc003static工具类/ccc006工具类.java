package wo1261931780.stjavaSE.history.c2stage_20220113.ccc003static工具类;

import java.util.Random;

public class ccc006工具类 {
	public static void show(int num) {
		String xx = "abcdefghijklmnopqrstuvwxyz0123456789";
		Random x1 = new Random();
		String x = "";
		for (int i = 0; i < num; i++) {
			int i1 = x1.nextInt(xx.length());
			x += xx.charAt(i1);
		}
		System.out.println(x);
	}
}
