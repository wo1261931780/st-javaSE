package wo1261931780.stjavaSE.history.c2stage_20220202.ccc034object_api;

public class ddd038object_equals {
	public static void main(String[] args) {
		show();
	}

	/**
	 * 定制相等规则。
	 * 两个对象的内容一样就认为是相等的
	 * s1.equals(s2)
	 * 比较者：s1 == this
	 * 被比较者： s2 ==> o
	 */
	public static void show() {
		ddd036object x = new ddd036object(11, "aaa");
		ddd036object x1 = new ddd036object(11, "aaa");
		// 对于上面的两个对象来说，内容相同，就意味着对象是同一个
		// 但是直接使用equals只能比较地址是否一致

		System.out.println(x.equals(x1));// 结果为false
		System.out.println(x == x1);// 结果为false
		// 如果需要比较内容，就要在对象类中，进行方法的重写
		// 这里的重写位置，不是show方法中，而是创建对象的类中
	}
}
