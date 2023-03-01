package wo1261931780.stjavaSE.history.c2stage_20220113.ccc022abstract_class_feature;

public abstract class ccc053animal {
	/**
	 * final后，一般就称为常量
	 */
	private final String nn = "222";
	private int age = 20;

	/**
	 * 默认存在的构造方法
	 */
	public ccc053animal() {
	}

	/**
	 * 可以选择存在的带参构造
	 */
	public ccc053animal(int age) {
		// 抽象类可以进行构造，这样子类才能实现对父类的访问
		// 这种构造主要为了实现数据的初始化
		this.age = age;
	}

	/**
	 * 可存在的成员方法
	 */
	public void show() {
		age = 12;
		System.out.println(age);
	}

	/**
	 * 可存在的带参方法
	 * 带参方法的存在，一方面提高了代码的复用性，
	 * 反过来说，也限制了子类，必须去执行重写操作
	 */
	public abstract void eat();
}
