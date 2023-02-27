package wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合;

public class aaa024数组和栈内存堆内存 {
	/**
	 * 动态初始化，2021年9月9日10:28:30
	 */
	public static void main(String[] args) {
		// 两种定义方式：
		// 数据类型[] 变量名
		int[] arr;
		// 定义了一个int类型的数组，名称为arr

		// 数据类型 变量名[]
		int[] arr2;
		// 定义了一个int类型的变量，变量名为arr2数组
		// 动态初始化：
		// 初始化时只指定数组长度，由系统为数组分配初始值
		// 格式：数据类型[] 变量名 =  new  数据类型[数组长度];
		// 范例：int[] arr = new int[3];
		int[] xx = new int[3];
		// int[]，表示新建一个int类型的数组
		// xx是数组的名称
		// new，表示会出现一个新的内存地址
		// int[3]，表示数组的长度为3
		System.out.println(xx);
		// 直接展示数组，只会出现数据的内存地址[I@4c873330
		// 这个内存地址是在堆内存中的，所以地址不会发生改变（堆内存中默认值不变）
		// jvm内容：
		// 堆内存中的数据，会在垃圾回收站空闲时被回收
		System.out.println(xx[0]);
		// 访问数组，必须直接定位到数组的具体元素
	}
}
