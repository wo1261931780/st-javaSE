package d_review_20221221;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:d_review_20221221
 *
 * @author liujiajun_junw
 * @Date 2022-12-21-40  星期三
 * @description
 */
public class ddd002 {
	public static void main(String[] args) {
		int[] demo = {1, 2, 3};
		System.out.println(Arrays.toString(demo));
		int[] demo2 = new int[4];
		System.out.println(Arrays.toString(demo2));
		System.out.println(demo2[2]);// 0
		String[] demo3 = new String[2];
		System.out.println(Arrays.toString(demo3));// null
		Boolean[] demo4 = new Boolean[2];
		System.out.println(Arrays.toString(demo4));
	}
}
