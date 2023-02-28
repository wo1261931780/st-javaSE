package wo1261931780.stjavaSE.history.ab_history_20211002.bbb054学生管理系统;

import lombok.extern.slf4j.Slf4j;
import wo1261931780.stjavaSE.history.ab_history_20211002.bbb054学生管理系统.bbb055类;

import java.util.ArrayList;
import java.util.Scanner;

@Slf4j
public class bbb056测试类 {
	public static void main(String[] args) {
		ArrayList<bbb055类> student = new ArrayList<>();// 集合，用来储存数据
		Scanner x0 = new Scanner(System.in);
		jm(student);
		int idea = x0.nextInt();
		// 根据指令判断功能模块-------------------------------------------
		// if (idea < 6 && idea > 0) {
		for (log.info("开始判断"); idea < 6 || idea > 0; idea = x0.nextInt()) {
			if (idea == 1) {
				// db(student);
				tj(student);
				jm(student);
			} else if (idea == 2) {
				sc(student);
				jm(student);
			} else if (idea == 3) {
				xg(student);
				jm(student);
			} else if (idea == 4) {
				ck(student);
				jm(student);
			} else if (idea == 5) {
				log.info("即将退出......");
				// log.info("感谢使用,退出完成");
				break;
			} else {
				Scanner x1 = new Scanner(System.in);
				log.info("指令错误，是否重新输入？yes/no");
				String z = x1.nextLine();
				if ("yes".equals(z)) {
					jm(student);
				} else {
					break;
				}
			}
		}
		log.info("感谢使用,系统退出");
	}

	// 界面
	public static void jm(ArrayList<bbb055类> student) {
		log.info("-----欢迎来到学生管理系统-----");
		log.info("1--添加学生");
		log.info("2--删除学生");
		log.info("3--修改学生信息");
		log.info("4--查看学生信息");
		log.info("5--退出");
		log.info("请输入管理员的指令：");
		// Scanner x0 = new Scanner(System.in);
		// int idea = x0.nextInt();
		// log.info("第一遍循环----------------------");
	}

	// 查找是否重复
	public static void db(ArrayList<bbb055类> student) {
		Scanner a3 = new Scanner(System.in);
		log.info("请输入你要添加的学号:");
		String xgxh = a3.nextLine();
		for (int q2 = 0; q2 < student.size(); q2++) {
			// 官方给出的方法是，先设定一个新的变量，然后对新变量直接复写旧变量。
			bbb055类 q3 = student.get(q2);
			if (q3.getNumber().equals(xgxh)) {
				log.info("学号已存在，请重新输入或者修改信息");
				// return;
			} else {
			}
		}
	}

	// 添加对象
	// 录入的数据是给成员变量，学生这个对象以后保存到集合里面去
	public static void tj(ArrayList<bbb055类> student) {
		Scanner a1 = new Scanner(System.in);
		log.info("请输入学生学号：");
		String xh = a1.nextLine();
		//------------------------------里面是防止重复的模块
		for (int q2 = 0; q2 < student.size(); q2++) {
			// 官方给出的方法是，先设定一个新的变量，然后对新变量直接复写旧变量。
			bbb055类 q3 = student.get(q2);
			if (q3.getNumber().equals(xh)) {
				log.info("学号已存在，请重新输入或者修改信息");
				return;
			} else {
			}
		}
		//--------------------------------------------------
		log.info("请输入学生姓名：");
		String xm = a1.nextLine();
		log.info("请输入学生年龄：");
		String nl = a1.nextLine();
		log.info("请输入学生地址：");
		String dz = a1.nextLine();
		log.info("输入成功!");
		// 在类中创建具体的对象/学生
		bbb055类 da = new bbb055类(xh, xm, nl, dz);
		student.add(da);// 把上面的具体对象添加到集合中
		// bbb055类 ren = student.get(0);//这里有问题
		// System.out.print(ren.getNumber() + ren.getName() + ren.getAge() + ren.getAddress());
	}

	// 删除信息
	public static void sc(ArrayList<bbb055类> student) {
		Scanner a2 = new Scanner(System.in);
		log.info("请输入你要删除的学号：");
		String scxh = a2.nextLine();
		for (int q = 0; q < student.size(); q++) {
			bbb055类 ren = student.get(q);
			// log.info(ren.getNumber());
			// log.info(scxh);
			if (ren.getNumber().equals(scxh)) {
				student.remove(q);
				// log.info(student.remove(q));
				log.info("删除成功");
			} else {
				log.info("学号不存在");
			}
		}
		// bbb055类 a22=new bbb055类();
		// student.remove(scxh);//这里有可能其他东西还在，只删除了学号
		// log.info(student.remove(0));
	}

	// 修改信息
	public static void xg(ArrayList<bbb055类> student) {
		Scanner a3 = new Scanner(System.in);
		log.info("请输入你要修改的学号:");
		String xgxh = a3.nextLine();
		for (int q2 = 0; q2 < student.size(); q2++) {
			// 官方给出的方法是，先设定一个新的变量，然后对新变量直接复写旧变量。
			bbb055类 q3 = student.get(q2);
			if (q3.getNumber().equals(xgxh)) {
				log.info("找到档案，开始修改：");
				log.info("请输入学生姓名：");
				q3.setName(a3.nextLine());
				log.info("请输入学生年龄：");
				q3.setAge(a3.nextLine());
				log.info("请输入学生地址：");
				q3.setAddress(a3.nextLine());
				log.info("修改完成");
				// bbb055类 q3 = new bbb055类(xgxh, xm, nl, dz);//在类中创建具体的对象/学生
				// 把上面的具体对象添加到集合中
				student.set(q2, q3);
				return;
			} else {
				log.info("档案未找到-------------------");
			}
		}
	}

	// 查看信息
	public static void ck(ArrayList<bbb055类> student) {
		if (student.size() == 0) {
			log.info("无信息，请先进行添加");
			// return,这里添加一个语句后，程序将不再继续执行
		} else {
			// tab键的快速表示
			log.info("学号\t姓名\t年龄\t居住地");
			// System.out.print("学号");
			// System.out.print("          ");
			// System.out.print("姓名");
			// System.out.print("          ");
			// System.out.print("年龄");
			// System.out.print("          ");
			// log.info("居住地");
			for (int q = 0; q < student.size(); q++) {
				bbb055类 ren = student.get(q);
				log.info(ren.getNumber() + "\t" + ren.getName() + "\t" + ren.getAge() + "\t" + ren.getAddress());
				// System.out.print(ren.getNumber());
				// System.out.print("          ");
				// System.out.print(ren.getName());
				// System.out.print("          ");
				// System.out.print(ren.getAge());
				// System.out.print("          ");
				// log.info(ren.getAddress());
				// 这里如何调整格式？
			}
		}
	}
}
