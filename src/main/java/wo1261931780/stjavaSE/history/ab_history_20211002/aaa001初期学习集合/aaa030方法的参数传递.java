package wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合;

public class aaa030方法的参数传递 {
	public static void main(String[] args) {
		// 这里是实参
		int x = 100;
		System.out.println(x);
		// 调用方法中的参数，这里是形参
		show(x);
		// 实际参数不发生改变
		System.out.println(x);
		System.out.println("end");
	}

	public static void show(int xx) {// 这里的xx也是形参
		xx = 200;
		// 形参发生了变化
		System.out.println(xx);
	}
}
