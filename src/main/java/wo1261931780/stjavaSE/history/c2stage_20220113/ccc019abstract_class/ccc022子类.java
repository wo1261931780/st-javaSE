package wo1261931780.stjavaSE.history.c2stage_20220113.ccc019abstract_class;

public class ccc022子类 extends ccc021抽象 {

	@Override
	public void test() {
		System.out.println("子类中的test");
	}
	// 这里重写必须是抽象方法，否则无法进行
	// 继承抽象类之后，
	// 1.子类必须重写所有抽象方法，
	// 因为继承的时候，把所有抽象方法也继承过来，如果没有全部重写一遍，
	// 那么导致，非抽象的子类中，存在抽象的方法，导致报错
	// 2.子类本身就是抽象类，否则报错
	// 原因同上，类和方法，在抽象与否这一方面，必须保持一致
	// 同时，对抽象方法重写后，就成为了具体方法，不再保留抽象abstract
}
