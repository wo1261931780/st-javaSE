package wo1261931780.stjavaSE.history.c2stage_20220202.ccc031internal_classes;

public class ddd020static_inside_class {
	// 外部类，一般都是public或者缺省
	// public表示任何地方都可以访问
	// 但是缺省，表示只能在同个包下面访问
	// 内部类没有这种限制条件，一开始就可以使用private修饰

	private String name;
	public int name2 = 100;
	public static int name3 = 100;

	public static class inner {// 注意，类是没有括号的（没有方法体）
		private String demo;
		private int demo2;
		public String demo3;

		public void show() {
			// System.out.println(name2);// 无法访问普通变量
			System.out.println(name3);// 可以直接访问外部的static变量
		}

		// 内部类和类没有明显差别
		// 可以构造方法，可以getset，甚至可以有方法体
		// 内部类无法访问外部的私有变量
		public void show2() {
			ddd020static_inside_class x = new ddd020static_inside_class();
			System.out.println(x.name);
			// 但是可以通过构造对象的方式，来访问
		}

		public inner(String demo, int demo2, String demo3) {
			this.demo = demo;
			this.demo2 = demo2;
			this.demo3 = demo3;
		}

		public String getDemo() {
			return demo;
		}

		public void setDemo(String demo) {
			this.demo = demo;
		}

		public int getDemo2() {
			return demo2;
		}

		public void setDemo2(int demo2) {
			this.demo2 = demo2;
		}

		public String getDemo3() {
			return demo3;
		}

		public void setDemo3(String demo3) {
			this.demo3 = demo3;
		}
	}

	public ddd020static_inside_class() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ddd020static_inside_class(String name) {
		this.name = name;
	}
}
