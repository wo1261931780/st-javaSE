package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc028接口名的形参和返回;

public class ccc053demo {
	public static void main(String[] args) {
		ccc052测试 x = new ccc052测试();
		ccc050接口 xx = new ccc051子类();
		x.usejkk(xx);
		// 下面是第二种方法
		ccc050接口 sss = x.ret();
		// x.ret实际上是测试类中的x对象，使用ret方法，
		// 而ret方法又可以创建并返回一个子类中的新对象
		// 结果是，接口在子类中，用多态的方式新建子类对象sss，
		// sss可以直接使用子类的功能
		sss.jkk();
	}
}
