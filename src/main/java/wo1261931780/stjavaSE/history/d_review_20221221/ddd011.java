package d_review_20221221;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:d_review_20221221
 *
 * @author liujiajun_junw
 * @Date 2022-12-15-42  星期五
 * @description
 */
public class ddd011 {
	public static void main(String[] args) {
		char[] demo = {'a', 'b', 'g'};
		String s = new String(demo);
		String demo1 = new String(demo);
		System.out.println(s);
		// System.out.println(s instanceof String);// true
		System.out.println(demo1);// char[]
		System.out.println(demo1.equals(demo));
	}
}
