package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc023猫狗接口版;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class ccc027demo {
	public static void main(String[] args) {
		log.info("please type name of your cat");
		Scanner name1 = new Scanner(System.in);
		// 输入猫的姓名
		String namecat = name1.nextLine();
		log.info("please type age of your cat");
		Scanner age1 = new Scanner(System.in);
		// 输入猫的年龄
		int agecat = age1.nextInt();
		// 带参构造猫对象
		ccc026接口 cat = new ccc024cat(agecat, namecat);
		log.info(namecat + "已经" + agecat + "岁了");
		// 猫的jump方法
		cat.jump();
		// 向下转型，把父类对象cat给子类对象a
		ccc024cat a = (ccc024cat) cat;
		// 相当于a.eat
		((ccc024cat) cat).eat();
		log.info("-----------------stripe");
		log.info("-----------------stripe");
		log.info("-----------------stripe");
		log.info("please type name of your dog");
		Scanner name2 = new Scanner(System.in);
		String namedog = name2.nextLine();
		log.info("please type age of your dog");
		Scanner age2 = new Scanner(System.in);
		int agedog = age2.nextInt();
		ccc026接口 dog = new ccc025dog(agedog, namedog);
		log.info(namedog + "已经" + agedog + "岁了");
		dog.jump();
		ccc025dog b = (ccc025dog) dog;
		// ((ccc025dog) dog).eat();
		b.eat();
	}
}
