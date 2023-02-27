package wo1261931780.stjavaSE.history.ab_history_20211002.bbb056学生管理系统2021;


import java.util.ArrayList;
import java.util.Scanner;

public class bbb058学生测试类 {
	public static void main(String[] args) {
		// while (true){};
		// 这里直接用while循环改进，暂定为死循环，直到选择程序结束
		// System.out.println("--------------");
		// Scanner x = new Scanner(System.in);
		// int x1 = x.nextInt();
		// def();
		ArrayList<bbb057学生类> xx1 = new ArrayList<>();
		// switch (def()) {
		//     case 1:
		//         adds(xx1);
		//         def();
		//         break;
		//     case 2:
		//         del(xx1);
		//         def();
		//         break;
		//     case 3:
		//         changeme(xx1);
		//         def();
		//         break;
		//     case 4:
		//         showme(xx1);
		//         def();
		//         break;
		//     case 5:
		//         quits();
		//         break;
		//     default:
		//         def();
		// }
		for (int i = 1; i > 0 && i < 5; ) {
			// def();
			// System.out.println("***");
			i = def();
			if (i == 1) {
				adds(xx1);
			} else if (i == 2) {
				del(xx1);
			} else if (i == 3) {
				changeme(xx1);
			} else if (i == 4) {
				showme(xx1);
			} else if (i == 5) {
				// quits();
				System.exit(0);
				// 这里是jvm虚拟机退出命令
			} else {
			}
		}
		System.out.println("程序结束");
	}

	// 管理界面
	public static int def() {
		System.out.println("-----------------欢迎来到学生管理系统-----------------");
		System.out.println("1.添加学生");
		System.out.println("2.删除学生");
		System.out.println("3.修改学生");
		System.out.println("4.查看所有学生");
		System.out.println("5.退出");
		System.out.println("请输入你的选择：");
		Scanner x = new Scanner(System.in);
		int x1 = x.nextInt();
		if (x1 < 0 || x1 > 6) {
			System.out.println("错误代码，程序退出");
		}
		return x1;
	}

	/**
	 * 添加方法
	 * 键盘录入学生对象所需要的数据,显示提示信息，提示要输入何种信息
	 * 为了让sid在while循环外面被访问到，我们就把它定义在了循环外
	 * 为了让程序能够回到这里，我们使用循环实现
	 * 创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
	 * 将学生对象添加到集合中
	 * 给出添加成功提示
	 */
	// public static void adds(ArrayList<bbb057学生类> xx1) {
	public static void adds(ArrayList<bbb057学生类> xx1) {
		Scanner x0 = new Scanner(System.in);
		Scanner x1 = new Scanner(System.in);
		Scanner x2 = new Scanner(System.in);
		Scanner x3 = new Scanner(System.in);
		bbb057学生类 a1 = new bbb057学生类();
		System.out.println("请输入学号：");
		int nun = x0.nextInt();
		//-----------------------------
		// 虚线内的可以提取出来，作为一个方法封装
		int demo = 0;
		// 教程内使用的方法，需要在结果重复的情况下，返回输入学号过程
		for (int i = 0; i < xx1.size(); i++) {
			if (xx1.get(i).getNun() == nun) {
				System.out.println("学号已存在，请重新输入");
				demo = 1;
				break;
			}
		}
		if (demo == 1) {
		} else {
			//-----------------------------
			a1.setNun(nun);
			System.out.println("请输入姓名：");
			String xname = x1.nextLine();
			a1.setName(xname);
			System.out.println("请输入年龄：");
			int xage = x2.nextInt();
			a1.setAge(xage);
			System.out.println("请输入居住地：");
			String xcity = x3.nextLine();
			a1.setCity(xcity);
			xx1.add(a1);
			System.out.println("添加结束------------------");
		}
	}

	// 删除方法
	public static void del(ArrayList<bbb057学生类> xx1) {
		Scanner x = new Scanner(System.in);
		System.out.println("请输入学生学号：");
		int x1 = x.nextInt();
		// 判断是否找到对应账号，找到就设置=1，否则设置为0
		int u = 0;
		for (int i = 0; i < xx1.size(); i++) {
			bbb057学生类 x2 = xx1.get(i);
			if (x1 == x2.getNun()) {
				xx1.remove(i);
				System.out.println("找到账号，执行删除操作");
				u = 1;
				break;
			}
		}
		if (u == 0) {
			System.out.println("删除失败，未找到学号");
		} else {
			System.out.println("删除成功");
		}

	}

	// 修改方法
	public static void changeme(ArrayList<bbb057学生类> xx1) {
		Scanner xx0 = new Scanner(System.in);
		Scanner xx2 = new Scanner(System.in);
		Scanner xx3 = new Scanner(System.in);
		Scanner xx4 = new Scanner(System.in);
		// 这里其实可以只用一个输入命令，int类型全部使用textline操作
		System.out.println("请输入学号：");
		int x1 = xx0.nextInt();
		for (int i = 0; i < xx1.size(); i++) {
			if (x1 == xx1.get(i).getNun()) {
				// 这里可以先接收结果，然后使用equals方法去判断和x1是否相等
				System.out.println("请重新输入姓名");
				String x2 = xx2.nextLine();
				xx1.get(i).setName(x2);
				System.out.println("请重新输入年龄");
				int x3 = xx3.nextInt();
				xx1.get(i).setAge(x3);
				System.out.println("请重新输入居住地");
				String x4 = xx4.nextLine();
				xx1.get(i).setCity(x4);
				System.out.println("修改成功,回到首页");
				// 找到就直接退出，不需要继续遍历
				break;
			}
		}
		System.out.println("搜索结束");
	}

	// 查看所有学生
	public static void showme(ArrayList<bbb057学生类> xx1) {
		System.out.println("执行集合遍历");
		if (xx1.size() == 0) {
			System.out.println("无信息，请先执行添加操作");
			// return;
			// 给出return，程序就不再往下执行
		} else {
			System.out.println("学号\t" + "姓名\t" + "年龄\t" + "居住地\t");
			for (int i = 0; i < xx1.size(); i++) {
				bbb057学生类 a = xx1.get(i);
				System.out.println(a.getNun() + "\t" + a.getName() + "\t" + a.getAge() + "\t" + a.getCity());
			}
		}
	}

	// public static void quits() {
	//     System.out.println("退出程序--------");
	// }

}
