package d_review_20221221;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:d_review_20221221
 *
 * @author liujiajun_junw
 * @Date 2022-12-20-40  星期四
 * @description
 */
public class ddd009 {
	String name;
	int age;

	public void show() {
		System.out.println("我是show方法");
		System.out.println("姓名：" + name + "，年龄是：" + age);
	}

	public ddd009() {
	}

	public ddd009(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
