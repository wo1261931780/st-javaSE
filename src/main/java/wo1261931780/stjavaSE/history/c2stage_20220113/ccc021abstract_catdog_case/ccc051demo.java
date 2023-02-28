package wo1261931780.stjavaSE.history.c2stage_20220113.ccc021abstract_catdog_case;

import java.util.Scanner;

public class ccc051demo {
	public static void main(String[] args) {
		System.out.println("请输入猫的名称：");
		Scanner x = new Scanner(System.in);
		String namecat = x.nextLine();
		System.out.println("请输入猫的年龄：");
		Scanner xx = new Scanner(System.in);
		int agecat = xx.nextInt();
		ccc048animal catx = new ccc049Cat();
		System.out.println("开始写入...");
		catx.setName(namecat);
		catx.setAge(agecat);
		// ccc048animal xa=new ccc049Cat(agecat,namecat);
		System.out.println(catx.getName() + "已经" + catx.getAge() + "岁了");
		catx.eat();
	}
}
