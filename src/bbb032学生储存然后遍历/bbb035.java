package bbb032学生储存然后遍历;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb035 {
    public static void main(String[] args) {
        ArrayList<String> xx = new ArrayList<>();
        Scanner zz = new Scanner(System.in);
//        int x=0;
        System.out.println("开始循环");
        for (int x = 0; x < 5; x++) {
            System.out.println("请输入内容:");
            String x1 = zz.nextLine();
            xx.add(x1);
            //add是从末尾开始添加，比如开始是1，add2之后，就变成了[1,2]
        }
        System.out.println(xx);
        //结果：[1, 1, 1, 2, 2]

        for (int x = 0; x < xx.size(); x++) {
            System.out.println(xx.get(x));
        }
    }
}
