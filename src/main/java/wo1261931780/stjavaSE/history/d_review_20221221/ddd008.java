package d_review_20221221;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:d_review_20221221
 *
 * @author liujiajun_junw
 * @Date 2022-12-17-12  星期四
 * @description
 */
public class ddd008 {
	public static void main(String[] args) {
		int[] demo1 = {0, 1, 21, 3, 546, 547, 8, 7};
		int[] demo2 = {0, 1, 21, 3, 546, 547, 7, 8};
		System.out.println(test(demo1, demo2));

	}

	static String name1;

	public static String show(String name) {
		name = "1";
		name1 = "123";

		return name;
	}

	public static Boolean test(int[] demo1, int[] demo2) {

		if (demo1.length != demo2.length) {
			return Boolean.FALSE;
		} else {
			for (int i = 0; i < demo1.length; i++) {
				if (demo1[i] != demo2[i]) {
					return Boolean.FALSE;
				}
			}
		}
		return Boolean.FALSE;
	}
}
