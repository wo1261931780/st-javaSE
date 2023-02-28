package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc023猫狗接口版;

public class ccc021Test_dog implements ccc020test_animal {
	public String name = "111";
	public int age = 222;

	public ccc021Test_dog() {
	}

	public ccc021Test_dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void jump() {
		System.out.println("我是狗中的跳高");
	}
}
