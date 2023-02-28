package wo1261931780.stjavaSE.history.ab_history_20211002.bbb011商城案例;

import java.util.Scanner;

public class bbb016bag {
	public static void main(String[] args) {
		bbb015商品类[] x = new bbb015商品类[100];
		while (true) {
			int i = interfaceRoot();
			switch (i) {
				case 1:
					add(x);
					break;
				case 2:
					del(x);
					break;
				case 3:
					change(x);
					break;
				case 4:
					show(x);
					settlement(x);
					clsAll(x);
					break;
				case 5:
					clsAll(x);
					break;
				default:
					show(x);
					System.out.println("请重新输入");
					System.out.println("*****************************");
					return;
			}
		}
	}
	// 这里也可以将方法设置在main中
	// 这样方法内部出现的scanner等指令，直接可以传递给后续的方法

	public static int interfaceRoot() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("欢迎进入");
		System.out.println("1--添加商品");
		System.out.println("2--删除商品");
		System.out.println("3--修改商品信息");
		System.out.println("4--全部结算");
		System.out.println("5--清空购物车");
		System.out.println("--请输入对应指令--");
		int command = scanner.nextInt();
		System.out.println("*****************************");
		return command;
	}

	public static void add(bbb015商品类[] s) {
		Scanner goods = new Scanner(System.in);
		System.out.println("请输入商品名称：");
		String addname = goods.nextLine();
		System.out.println("请输入商品价格：");
		int addprice = goods.nextInt();
		System.out.println("请输入商品数量：");
		int addnum = goods.nextInt();
		System.out.println("请输入商品id：");
		int addid = goods.nextInt();
		bbb015商品类 x = new bbb015商品类(addname, addprice, addnum, addid);
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = x;
				System.out.println("添加完毕");
				return;
			}
		}
	}

	public static void del(bbb015商品类[] s) {
		Scanner x = new Scanner(System.in);
		String delname = x.nextLine();
		for (int i = 0; i < s.length; i++) {
			if (s[i].name.equals(delname)) {
				s[i] = null;
				System.out.println("删除成功");
				return;
			}
		}
		System.out.println("没有该商品，请重新输入");
	}

	public static void change(bbb015商品类[] s) {
		Scanner x = new Scanner(System.in);
		int chid = x.nextInt();
		for (int i = 0; i < s.length; i++) {
			if (s[i].id == chid) {
				System.out.println("请输入name：");
				s[i].name = x.nextLine();
				System.out.println("请输入price：");
				s[i].price = x.nextInt();
				System.out.println("请输入num：");
				s[i].num = x.nextInt();
				return;
			}
		}
		System.out.println("没有该商品，请重新输入");
	}

	public static void settlement(bbb015商品类[] s) {
		int tol = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				break;
			} else {
				tol += s[i].price * s[i].num;
			}
		}
		System.out.println("总价格是：" + tol);
	}

	public static void clsAll(bbb015商品类[] s) {
		for (int i = 0; i < s.length; i++) {
			s[i] = null;
		}
		System.out.println("清空完成");
	}

	public static void show(bbb015商品类[] s) {
		System.out.println("id名" + "\t" + "名称" + "\t" + "价格" + "\t" + "数量");
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				System.out.println("查询结束");
				return;
			} else {
				System.out.println(s[i].id + "\t\t" + s[i].name + "\t" + s[i].price + "\t" + s[i].num);
			}
		}
		// System.out.println("清空完成");
	}
}
