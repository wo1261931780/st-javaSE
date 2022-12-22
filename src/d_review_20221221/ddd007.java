package d_review_20221221;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:d_review_20221221
 *
 * @author liujiajun_junw
 * @Date 2022-12-15-29  星期四
 * @description
 */
public class ddd007 {
	public static void main(String[] args) {
		int max = 0;
		int min = 0;
		int[] demo = {0, 1, 2, 3, 456, 47, 98};
		for (int i = 0; i < demo.length; i++) {
			// max = max > demo[i] ? max : demo[i];
			max = Math.max(max, demo[i]);
			// 直接通过math获取数组中的最值
			min = Math.min(min, demo[i]);
		}
		System.out.println(max);
		System.out.println(min);
	}
}
