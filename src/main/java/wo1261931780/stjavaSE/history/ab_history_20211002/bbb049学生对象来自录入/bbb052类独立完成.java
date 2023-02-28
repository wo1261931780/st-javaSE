package wo1261931780.stjavaSE.history.ab_history_20211002.bbb049学生对象来自录入;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class bbb052类独立完成 {
	private String name = "";
	private int age = 0;

	public bbb052类独立完成() {
	}

	public bbb052类独立完成(String name, int age) {
		this.name = name;
		this.age = age;
		log.info(name + age);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}
