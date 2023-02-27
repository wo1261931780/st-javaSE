package wo1261931780.stjavaSE.history.ab_history_20211002.bbb020输入学校人数;

import java.util.Scanner;

public class bbb040a练习string构造方法 {
	public static void main(String[] args) {
		Scanner xx = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String x1 = xx.nextLine();
		System.out.println("你输入的字符串为：" + x1);

		char[] s1 = {'a', 'b', 'c'};
		byte[] s2 = {97, 98, 99};
		System.out.println("s1数据为：" + s1);
		System.out.println("s2数据为：" + s2);
		// 这里定义的s1和s2都是数组，直接获取只会得到数据的地址


		String a1 = new String(s1);// 通过new一个string来接受数组中的字符串数据
		System.out.println("s1数据为：" + a1);// s1数据为：abc
		// 这里使用a1字符串去接收s1，就会得到s1数组中的所有字符串
		// s1会将数组中的字符串拼接到一起
		String a2 = new String(s2);
		// s1和s2的数组类型不同，一个是char，一个是byte，
		// 这里tostring的过程中，自动对其进行了一次转化
		System.out.println("s2数据为：" + a2);// s2数据为：abc


		String a3 = "abc";
		System.out.println(a3);
		// 需要说明的是，两个字符串之间的双等号，只是比较地址是否相同，内容相同必须使用equals
		// 但是有下面这种特殊情况：
		String d1 = "ss";
		String d2 = "ss";

		System.out.println(d1 == d2);// 结果为true
		// 解释一下原理：
		// 1.在堆内存中的常量池，生成一个ss字符串，同时字符串自动搭配一个地址数值，
		// 赋值的过程中，将内容和地址数值同时给d1
		// 2.同样的操作对d2进行一次，最终导致d1和d2的地址相同，内容也相同
	}
}
