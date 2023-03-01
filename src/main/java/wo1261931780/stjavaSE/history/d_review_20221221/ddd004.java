package wo1261931780.stjavaSE.history.d_review_20221221;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:d_review_20221221
 *
 * @author liujiajun_junw
 * @Date 2022-12-13-53  星期四
 * @description
 */
public class ddd004 {
	public static void main(String[] args) {
		int[] demo = {1, 2, 3, 4, 5};
		for (int i = 0, j = demo.length - 1; i < demo.length / 2; i++, j--) {
			int mid = 0;
			mid = demo[j];
			demo[j] = demo[i];
			demo[i] = mid;
		}
		System.out.println(Arrays.toString(demo));
	}

}
