package wo1261931780.stjavaSE.history.c2stage_20220202.ccc033Anonymous_internal_classe;

public class ddd033swim_run {
	public static void main(String[] args) {
		ddd032swim students = new ddd032swim() {
			@Override
			public void swim() {
				System.out.println("学生游泳");
			}
		};
		competition(students);// 注意，这里必须是静态的才可以调用
		// 非静态的无法使用
		System.out.println("***************************");
		competition(new ddd032swim() {
			@Override
			public void swim() {
				System.out.println("老师游泳");
			}
		});
		System.out.println("***************************");
		((ddd032swim) () -> System.out.println("lambda表达式简化")).swim();// 这个就是lambda表达式，进一步简化匿名内部类
		//(ddd032swim) () -> System.out.println("lambda表达式简化")，直接作为一个对象
		//(ddd032swim) ()表示新建了一个swim中的对象
		// -> System.out.println("lambda表达式简化")对方法重写

		System.out.println("***************************");
		new ddd032swim() {
			@Override
			public void swim() {
				System.out.println("未使用lambda表达式");
			}
		}.swim();
		System.out.println("***************************");
		competition((ddd032swim) () -> System.out.println("运动员游泳"));
	}

	public static void competition(ddd032swim x) {
		System.out.println("开始");
		x.swim();
		System.out.println("结束");
	}
}
