package wo1261931780.stjavaSE.history.ab_history_20211002.bbb055自己写的学生管理系统;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Scanner;

@Slf4j
public class bbb067 {
	public static void main(String[] args) {
		ArrayList<bbb066lei> ceshi = new ArrayList<>();
		bbb066lei cs = new bbb066lei();
		Scanner no0 = new Scanner(System.in);
		jm(ceshi);
		int sr = no0.nextInt();
		for (int cishu = 0; sr > 0 && sr < 6; sr = no0.nextInt()) {
			switch (sr) {
				case 1:
					tj(ceshi);
					jm(ceshi);
					break;
				case 2:
					sc(ceshi);
					jm(ceshi);
					break;
				case 3:
					xg(ceshi);
					jm(ceshi);
					break;
				case 4:
					ck(ceshi);
					jm(ceshi);
					break;
				case 5:
					log.info("感谢使用系统");
					return;
				default:
					log.info("数字错误，程序退出");
					break;
			}
		}
		log.info("程序退出成功");
	}

	public static void jm(ArrayList<bbb066lei> ceshi) {
		Scanner shuru = new Scanner(System.in);
		log.info("----------学生管理系统----------");
		log.info("1.添加学生");
		log.info("2.删除学生");
		log.info("3.修改学生");
		log.info("4.查看所有学生");
		log.info("5.退出");
		log.info("请输入你的选择：");
		//        int sr=shuru.nextInt();
	}

	// 11111111111111111
	public static void tj(ArrayList<bbb066lei> ceshi) {
		Scanner shuru = new Scanner(System.in);
		String srsz = "";
		////////////这一段不能理解
		while (true) {
			log.info("学号数字：");
			srsz = shuru.nextLine();
			boolean falg = cf(ceshi, srsz);
			if (falg) {
				log.info("...");
			} else {
				break;
			}
		}
		////////////这一段不能理解

		log.info("学生姓名：");
		String srxm = shuru.nextLine();
		log.info("学生年龄：");
		String srxl = shuru.nextLine();
		log.info("学生地址：");
		String srdz = shuru.nextLine();
		bbb066lei xs = new bbb066lei(srsz, srxm, srxl, srdz);
		//        bbb066lei x1=xs.getNumber();
		ceshi.add(xs);
		log.info(String.valueOf(xs));
		log.info(ceshi.get(0).getAddress());
	}

	public static boolean cf(ArrayList<bbb066lei> ceshi, String srsz) {
		boolean falg = false;
		for (int x = 0; x < ceshi.size(); x++) {
			bbb066lei x1 = ceshi.get(x);
			if (x1.getNumber().equals(srsz)) {
				log.info("学号已经存在，需要重新输入");
				falg = true;
				break;
			} else {
			}
		}
		return falg;
	}

	// 2222222222222222
	public static void sc(ArrayList<bbb066lei> ceshi) {
		Scanner shuru = new Scanner(System.in);
		log.info("请正确输入学生学号：");
		String sr = shuru.nextLine();
		for (int x = 0; x < ceshi.size(); x++) {
			bbb066lei xs = ceshi.get(x);
			if (xs.getNumber().equals(sr)) {
				log.info("发现数据" + xs.getName() + "执行删除");
				ceshi.remove(x);
			} else {
				log.info("学号不存在");
			}
		}
		log.info("删除执行完毕");
	}

	// 333333333333333{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{
	public static void xg(ArrayList<bbb066lei> ceshi) {
		Scanner shuru = new Scanner(System.in);
		log.info("请输入要修改的学生学号");
		String sr = shuru.nextLine();
		for (int x = 0; x < ceshi.size(); x++) {
			log.info("开始遍历");
			bbb066lei xs = ceshi.get(x);
			if (xs.getNumber().equals(sr)) {
				log.info("发现数据" + xs.getName() + "执行修改");
				log.info("修改学号为：");
				String srsz = shuru.nextLine();
				xs.setNumber(srsz);
				log.info("修改学生姓名为：");
				String srxm = shuru.nextLine();
				xs.setName(srxm);
				log.info("修改学生年龄：");
				String srxl = shuru.nextLine();
				xs.setAge(srxl);
				log.info("修改学生地址：");
				String srdz = shuru.nextLine();
				xs.setAddress(srdz);
				// 太复杂了---------------------
			} else {
				log.info("学号不存在");
			}
		}
		log.info("修改完成");
	}

	public static void ck(ArrayList<bbb066lei> ceshi) {
		if (ceshi.size() != 0) {
			for (int xx = 0; xx < ceshi.size(); xx++) {
				log.info("开始遍历");
				bbb066lei xs = ceshi.get(xx);
				log.info(xs.getNumber());
			}
		} else {
			log.info("无数据，请先输入学生信息！");
		}
	}


}
