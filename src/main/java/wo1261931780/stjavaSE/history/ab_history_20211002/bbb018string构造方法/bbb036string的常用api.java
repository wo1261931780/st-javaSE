package wo1261931780.stjavaSE.history.ab_history_20211002.bbb018string构造方法;

import java.util.Arrays;
import java.util.Scanner;

public class bbb036string的常用api {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("请输入对应的字符串：");
		String xx = x.nextLine();
		// slength(xx);
		// srindex(xx);
		// blindex(xx);
		arrst(xx);
		// subst(xx);
		// zjst(xx);
		tihuanst(xx);
		statwi(xx);
	}

	// 1、public int length(): 获取字符串的长度

	public static void slength(String x) {
		System.out.println("字符串的长度为：" + x.length());
	}

	// 2、public char charAt(int index): 获取某个索引位置处的字符

	public static void srindex(String x) {
		System.out.println("获取字符串的指定位置：" + x.charAt(1));
	}

	// 3、public char[] toCharArray()：: 把字符串转换成字符数组

	public static void blindex(String x) {
		for (int i = 0; i < x.length(); i++) {
			System.out.println("遍历字符串" + i + "位置字符是：" + (byte) x.charAt(i));
			System.out.println("遍历字符串" + i + "位置字符是：" + (char) x.charAt(i));
		}
	}

	public static void arrst(String x) {
		char[] democh = x.toCharArray();
		System.out.println("返回一个字符数组：" + Arrays.toString(democh));
	}

	// 4、public String substring(int beginIndex, int endIndex) ：截取内容，(包前不包后的)

	public static void subst(String x) {
		// [0, 1, 2, 3, 4, 5, 6, 7, 8]
		System.out.println("截取的字符串为：" + x.substring(0, 5));// 这里表示截取了几个字符，结果01234
		System.out.println("截取的字符串为：" + x.substring(2, 5));// 234
		System.out.println("截取的字符串为：" + x.substring(4, 5));// 4
	}

	// 5、public String substring(int beginIndex):从当前索引一直截取到末尾

	public static void zjst(String x) {
		// [0, 1, 2, 3, 4, 5, 6, 7, 8]
		System.out.println("截取的字符串为：" + x.substring(2));// 从第几个字符截取到最后，结果2345678
		System.out.println("截取的字符串为：" + x.substring(4));// 45678
		System.out.println("截取的字符串为：" + x.substring(5));// 5678
	}

	// 6、public String replace(CharSequence target, CharSequence replacement)

	public static void tihuanst(String x) {
		// [0, 1, 2, 3, 4, 5, 6, 7, 8]
		System.out.println("替换后的结果是：：" + x.replace("4", "**"));// 0123**5
	}

	// 7、public boolean contains(CharSequence s)

	public static void containst(String x) {
		// [0, 1, 2, 3, 4, 5, 6, 7, 8]
		System.out.println("包含的内容：" + x.contains("4"));// 结果返回true和false
	}

	// 8、public boolean startsWith(String prefix)

	public static void statwi(String x) {
		// [0, 1, 2, 3, 4, 5, 6, 7, 8]
		System.out.println("以什么开始：" + x.startsWith("012"));// 结果返回true和false
		System.out.println("以什么开始：" + x.startsWith("4"));// 结果返回true和false
		// 只判断用什么开始，中间字段无法判断
	}

	// 9、public String[] split(String s): 按照某个内容把字符串分割成字符串数组返回。

	public static void spst(String x) {
		// [0, 1, 2, 3, 4, 5, 6, 7, 8]
		System.out.println("以什么开始：" + x.split("3"));// 最后得到的是一个数组
		String[] demo = x.split("4");
		System.out.println(Arrays.toString(demo));
	}

}
