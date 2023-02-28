package wo1261931780.stjavaSE.history.ab_history_20211002.bbb049学生对象来自录入;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Scanner;

@Slf4j
public class bbb053测试类独立完成 {
	public static void main(String[] args) {
		ArrayList<bbb052类独立完成> xx = new ArrayList<>();
		sr(xx);
		sr(xx);
		sr(xx);
		log.info("-----------------添加结束");
		for (int x = 0; x < xx.size(); x++) {
			bbb052类独立完成 zz = xx.get(x);
			log.info(zz.getName() + zz.getAge());
		}
	}

	public static void sr(ArrayList<bbb052类独立完成> xx) {
		Scanner zz = new Scanner(System.in);
		log.info("请输入姓名：");
		String z1 = zz.nextLine();
		log.info("请输入年龄：");
		int z2 = zz.nextInt();
		bbb052类独立完成 x1 = new bbb052类独立完成(z1, z2);
		// x1.setName(z1);
		// x1.setAge(z2);
		xx.add(x1);
		log.info("添加完成----------------");
	}
}
