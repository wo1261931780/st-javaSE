package wo1261931780.stjavaSE.history.ab_history_20211002.bbb041类和重新学习;

public class bbb080学生类 {
	private String name = "";
	private int age;

	public bbb080学生类() {
	}

	// 000001无参构造方法
	// public void bbb080学生类(String name,int age){
	// this.name=name;
	// this.age=age;
	// System.out.println("bbb044中的学生"+name+age+"已经学习完成");
	// }
	// 000002这里是把bbb044作为一个方法进行定义
	// 1000001带参构造方法
	public bbb080学生类(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void show() {
		System.out.println(name + age);
	}
}
