package wo1261931780.stjavaSE.history.c2stage_20220113.ccc024implements;

public class ccc060demo {
	public static void main(String[] args) {
		// 在子类cat中创建对象x，x使用父类jump中的方法。
		ccc063jump x = new ccc061cat();
		// 结果是cat类中的jump方法
		x.jump();
		ccc063jump cc = new ccc064jumpimpl();
		// 结果是jumpimpl中的jump方法
		cc.jump();
		// 结果是10
		System.out.println("jump实现类，我是多态对象cc的num数据：" + ccc063jump.num);
		// 结果是20
		System.out.println("jump实现类，我是多态对象cc的num2数据：" + ccc063jump.num2);
		// 结果是10
		System.out.println("存在接口中，我是num数据：" + ccc063jump.num);
		// 可以直接访问，也说明这是通过静态修饰的
	}
}
