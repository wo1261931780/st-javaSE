package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc028接口名的形参和返回;

public class ccc052测试 {
	public void usejkk(ccc050接口 j) {
		// 传递完成以后，对象j直接使用jkk方法
		j.jkk();
	}

	/**
	 * 实际上是在接口中构建了一个方法，但是使用的是子类的功能
	 */
	public ccc050接口 ret() {
		ccc050接口 j2 = new ccc051子类();
		return j2;
	}
}
