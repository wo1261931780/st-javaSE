package wo1261931780.stjavaSE.history.c2stage_20220202.ccc030Polymorphic_case;

/**
 * 目标：USB设备模拟
 * <p>
 * 1、定义USB接口：接入 拔出
 * <p>
 * 2、定义2个USB的实现类：鼠标、键盘。
 * <p>
 * 3、创建一个电脑对象，创建USB设备对象，安装启动。
 */
public class ddd016computer {
	public static void main(String[] args) {
		ddd017usb x = new ddd018mouse();
		install(x);
		ddd017usb x1 = new ddd019keyboard();
		install(x1);

	}

	public static void install(ddd017usb x) {
		System.out.println("computer install");
		x.get_in();
		x.get_out();
		choose(x);
		System.out.println("**************************");
	}
	// 下面是自己写的代码，其实完全没必要，因为方法体内，不需要创建对象
	// 只需要在创建好对象以后，传递过来就可以
	// public static void install() {
	//     System.out.println("computer install");
	//     ddd017usb x = new ddd018mouse();
	//     x.get_in();
	//     x.get_out();
	//     choose(x);
	//     System.out.println("**************************");
	//     ddd017usb x1 = new ddd019keyboard();
	//     x1.get_in();
	//     x1.get_out();
	//     choose(x1);
	//     System.out.println("**************************");
	// }

	public static void choose(ddd017usb x) {
		if (x instanceof ddd018mouse) {
			ddd018mouse xx = (ddd018mouse) x;
			xx.mouse_click();
		} else if (x instanceof ddd019keyboard) {
			ddd019keyboard xx = (ddd019keyboard) x;
			xx.type();
		}
		System.out.println("choose finish");
	}
}
