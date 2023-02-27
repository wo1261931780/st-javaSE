package wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合;

/**
 * Created by Intellij IDEA.
 * Project:st-javaSE
 * Package:wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合
 *
 * @author liujiajun_junw
 * @Date 2023-02-16-20  星期一
 * @description
 */
public class aaa038比价数组 {
	public static void main(String[] args) {
		System.out.println("测试");
	}

	/**
	 * 比较数组是否相同
	 *
	 * @param xx 数组1
	 * @param x1 数组2
	 */
	public static void que(int[] xx, int[] x1) {
		if (xx.length == x1.length) {
			OUT:
			for (int i = 0; i < xx.length; i++) {
				if (xx[i] == x1[i]) {
					System.out.println("right index");
				} else {
					System.out.println("someting wrong");
					break OUT;
				}
			}
			// System.out.println("total equal");
		} else {
			System.out.println("error");
		}
		System.out.println("****");
	}

	/**
	 * 数组比较，
	 * 2022年1月2日17:08:23，改进以后
	 *
	 * @param xx 数组1
	 * @param x1 数组2
	 * @return tf
	 */
	public static boolean que2(int[] xx, int[] x1) {
		if (xx.length == x1.length) {
			for (int i = 0; i < xx.length; i++) {
				if (xx[i] != x1[i]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
