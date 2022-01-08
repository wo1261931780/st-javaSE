package abc往期学习2021年10月2日.bbb032集合练习;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb002影片信息案例 {
    public static void main(String[] args) {
        ArrayList<bbb002电影类> x = new ArrayList<>();
        x.add(show());
        x.add(show());
        x.add(show());
        x.add(new bbb002电影类("测试", 10, 9));//也可以这样直接新建一个对象

        for (int i = 0; i < x.size(); i++) {
            System.out.println("名称：" + x.get(i).getName() + "，价格：" + x.get(i).getPrice() + "，分数：" + x.get(i).getScore());
        }

    }

    public static bbb002电影类 show() {
        bbb002电影类 x = new bbb002电影类();
        Scanner x1 = new Scanner(System.in);
        Scanner x2 = new Scanner(System.in);
        x.setName(x1.nextLine());
        x.setScore(x2.nextInt());
        x.setPrice(x2.nextInt());
        return x;
    }
}
