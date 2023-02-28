package wo1261931780.stjavaSE.history.c2stage_20220113.ccc011Constructors;

public class ccc019zi extends ccc018fu {
	public ccc019zi() {
		// super()//这里默认都有一条无参构造方法，作用在于完成父类的数据初始化
		// 一旦父类的无参方法消失，那么子类也会报错--因为没有数据初始化的过程
		// 子类必须初始化一次，这里可以加入父类的带参构造，从而解决
		super(33);
		System.out.println("子类：无参构造");
	}

	public ccc019zi(int age) {
		// super();//这里默认是使用了一条父类的无参构造方法，写不写出来都一样。
		System.out.println("子类：带参构造");
	}
}
