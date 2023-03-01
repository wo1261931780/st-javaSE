package wo1261931780.stjavaSE.history.d_review_20221221;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:d_review_20221221
 *
 * @author liujiajun_junw
 * @Date 2022-12-22-52  星期三
 * @description
 */
public class ddd003 {
	public static void main(String[] args) {
		// 冒泡排序
		int[] demo = {1, 22, 13, 6, 458, 4798, 7, 8, 5};
		for (int i = 0, mid = 0; i < demo.length - 1; i++) {
			for (int j = 0; j < demo.length - 1 - i; j++) {
				if (demo[j] > demo[j + 1]) {
					mid = demo[j];
					demo[j] = demo[j + 1];
					demo[j + 1] = mid;
				}
			}
		}
		System.out.printf(Arrays.toString(demo));
	}
}
