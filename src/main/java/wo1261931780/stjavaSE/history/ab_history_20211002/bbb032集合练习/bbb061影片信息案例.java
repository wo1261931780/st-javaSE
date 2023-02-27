package wo1261931780.stjavaSE.history.ab_history_20211002.bbb032集合练习;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb061影片信息案例 {
	public static void main(String[] args) {
		ArrayList<bbb062电影类> x = new ArrayList<>();
		x.add(show());
		x.add(show());
		x.add(show());
		x.add(new bbb062电影类("测试", 10, 9));// 也可以这样直接新建一个对象

		for (int i = 0; i < x.size(); i++) {
			System.out.println("名称：" + x.get(i).getName() + "，价格：" + x.get(i).getPrice() + "，分数：" + x.get(i).getScore());
		}

	}

	public static bbb062电影类 show() {
		bbb062电影类 x = new bbb062电影类();
		Scanner x1 = new Scanner(System.in);
		Scanner x2 = new Scanner(System.in);
		x.setName(x1.nextLine());
		x.setScore(x2.nextInt());
		x.setPrice(x2.nextInt());
		return x;
	}
}
