package wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合;

import java.util.Random;
import java.util.Scanner;

public class aaa028遍历数组数字 {
	public static void main(String[] args) {
		System.out.println("开始定义数组:");
		// int[] xx = new int[10];动态初始化。
		// int[] xx = new int[]{123,13545,16541,6546748};
		// 静态初始化，相当于直接给数组数字
		int[] xx = {111, 222, 333, 44, 6854, 654, 564, 31, 65, 4896, 74, 61, 4, 867, 6};
		// 这里只会显示数组的地址
		System.out.println(xx);
		// System.out.println(xx[1]);
		// System.out.println(xx[2]);
		// System.out.println(xx[0]);数组都是从0开始计数
		// xx.length表示的是，数组长度是一个数字，[]中的数字也可以直接定义.
		System.out.println(xx.length);
		int x = 0;
		for (System.out.println("开始输出："); x < xx.length; x++) {
			System.out.println("第" + x + "个数是：" + xx[x]);
			// System.out.println(xx[x]);
			System.out.println("重复显示--------------------");
		}
		// show();
		// sum();
		// mx();
		guessnum();
		// rank();
	}

	/**
	 * 定义一个数组，然后遍历
	 */
	public static void show() {
		int[] x = new int[9];
		x[8] = 11;
		for (int i = 0; i < 9; i++) {
			System.out.println(x[i]);
		}
		System.out.println("结束");
	}

	/**
	 * 直接使用数组名.fori就会自动生成一个遍历循环
	 */
	public static void sum() {
		int[] x = {1, 1, 1, 1, 1, 1, 1};
		System.out.println(x.length);
		int sim = 0;
		for (int i = 0; i < x.length; i++) {
			sim += x[i];
		}
		System.out.println(sim);
	}

	/**
	 * 求最大值
	 */
	public static void mx() {
		int[] x = {11, 1, 56, 4, 165, 1, 65, 4, 8, 498};
		int max = 0;
		int min = 0;
		for (int i = 0; i < x.length; i++) {
			max = max < x[i] ? x[i] : max;
			min = min > x[i] ? x[i] : min;
			// if(max<x[i]){
			//     max=x[i];
			// }else if(min>x[i]){
			//     min=x[i];
			// }
		}
		System.out.println(max + "***" + min);
	}

	/**
	 * 猜测随机出来的数字
	 */
	public static void guessnum() {
		Random xx = new Random();
		int[] x = new int[5];
		for (int i = 0; i < 5; i++) {
			int i1 = xx.nextInt(20);
			x[i] = i1;
		}
		Scanner x1 = new Scanner(System.in);
		OUT:
		/* 循环结束的位置 */
		while (true) {
			System.out.println("请输出你的数:");
			int i = x1.nextInt();
			for (int j = 0; j < x.length; j++) {
				if (i == x[j]) {
					System.out.println("right num");
					// for (int i1 = 0; i1 < x.length; i1++) {
					//     System.out.println(x[i1]);
					// }
					break OUT;// 直接结束到out位置
				}
			}
		}
	}
}
