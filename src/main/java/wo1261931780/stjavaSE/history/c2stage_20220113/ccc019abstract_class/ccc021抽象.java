package wo1261931780.stjavaSE.history.c2stage_20220113.ccc019abstract_class;

public abstract class ccc021抽象 {
	public abstract void test();

	/**
	 * 抽象类里面可以没有抽象方法，但是如果没有抽象方法，抽象类没有存在的意义。
	 * 抽象方法必须在抽象类中，但是抽象类里面可以没有抽象方法
	 * 举例：
	 * public abstract class ccc021抽象{}就是一个抽象类
	 * <p>
	 * 但是这个抽象类的内部，可以有一个抽象的test方法，和一个不抽象的test2方法
	 */
	public void test2() {
		System.out.println("test2");
	}
	// 抽象类的诞生，是因为子类需要使用同样的方法来实现不同的功能。
	// 比如说，动物都可以吃东西，
	// 猫和狗属于动物，有吃东西的能力
	// 但是猫和狗吃的东西不同，所以需要抽象吃东西这件事
	// 父类抽象以后，子类对抽象方法进行重写，加入需要的功能
	// 这样可以增加代码的复用
}
