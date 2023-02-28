package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc027抽象类名的形参和返回值;

public class ccc048动物操作类 {
	/**
	 * 因为抽象无法创建，所以在子类中new了一个x
	 */
	public void use(ccc046animal a) {
		// 括号内相当于ccc028animal a=new ccc046animal。
		// 这里的animal是抽象类，所以其实是通过多态来创建的
		a.eat();
		// 这里出现的是地址值，而不是变量x
		System.out.println(a);
	}

	/**
	 * 我们通常设置的是void，意味着返回是默认类型
	 * 这里设置animal，意味着我必须返回一个animal类型的对象
	 */
	public ccc046animal getanimal() {
		// 在animal中创建方法，
		ccc046animal a = new ccc047子类();
		// 因为无法创建对象，所以方法内部多态的方式创建新的对象
		// 创建完了需要返回
		return a;
	}

}
