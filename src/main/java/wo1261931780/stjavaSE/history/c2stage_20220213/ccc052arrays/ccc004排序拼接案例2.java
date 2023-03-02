package wo1261931780.stjavaSE.history.c2stage_20220213.ccc052arrays;

import java.util.Arrays;

public class ccc004排序拼接案例2 {
	public static void main(String[] args) {
		// string数组中，空格也会包含在内
		String x = "12 5 456 465 968 65 4 84 8 8 748 48 668";
		// System.out.println(x);
		String[] x1 = x.split(" ");
		// 自动生成string类型的数组
		int[] x2 = new int[x1.length];
		for (int i = 0; i < x1.length; i++) {
			x2[i] = Integer.parseInt(x1[i]);
		}
		Arrays.sort(x2);
		System.out.println("返回的拼接值为：" + orderss(x2));
	}

	public static StringBuilder orderss(int[] x) {
		StringBuilder x1 = new StringBuilder();
		for (int i = 0; i < x.length; i++) {
			if (i == x.length) {
				x1.append(x[i]);
			} else {
				x1.append(x[i]).append(" ");
			}
		}
		return x1;
	}
}
