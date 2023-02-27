package wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合;

import java.util.Random;
import java.util.Scanner;

public class aaa041输入数据用方法判断大小 {
	public static void main(String[] args) {
		// mm的值是多少都不重要，最后还是x1和z1进行比较
		max(10);
	}

	/**
	 * 获取最大值
	 * <p>
	 * 两个int类型的数据比较后，得到double类型的数据结果
	 *
	 * @param mm 输入数据
	 */
	public static void max(double mm) {
		Scanner xx = new Scanner(System.in);
		Random zz = new Random();
		System.out.println("请输入比较值：");
		// double x1 = xx.nextInt();
		int x1 = xx.nextInt();
		// double z1 = zz.nextInt(1000);
		int z1 = zz.nextInt(1000);
		// 上面设置对比数据为int类型，但是最终展示的是double类型的mm
		// 所以结果带上小数点
		// 效果为：两个int类型的数据比较后，得到double类型的数据结果

		if (x1 > z1) {
			mm = x1;
			System.out.println("较大值为：" + mm);
		} else {
			mm = z1;
			System.out.println("较大值为：" + mm);
		}
	}
}
