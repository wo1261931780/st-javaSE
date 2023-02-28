package wo1261931780.stjavaSE.history.c2stage_20220113.ccc021abstract_catdog_case;

public class ccc049Cat extends ccc048animal {
	@Override
	public void eat() {
		System.out.println("cat类的eat方法------------");
	}

	public void cat1() {
	}

	public void cat1(int age, String name) {
		super.setAge(age);
		super.setName(name);
		// super(name,age);//官方教程
	}
}
