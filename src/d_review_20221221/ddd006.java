package d_review_20221221;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:d_review_20221221
 *
 * @author liujiajun_junw
 * @Date 2022-12-14-25  星期四
 * @description
 */
public class ddd006 {
	public static int select(int[] demo) {
		Arrays.sort(demo);
		System.out.println(Arrays.toString(demo));
		return demo[demo.length - 1];
	}

	public static void main(String[] args) {
		int[] demo1 = {1, 21, 3, 454, 8, 7, 897, 9};
		System.out.println(select(demo1));
	}
}
