package wo1261931780.stjavaSE.history.ab_history_20211002.bbb020输入学校人数;

import java.util.Scanner;

public class bbb045自己测试输入学校人数 {
    public static void main(String[] args) {
        bbb039 z = new bbb039();
        Scanner z0 = new Scanner(System.in);
        System.out.println("请输入人数");
        int z1 = z0.nextInt();
        z.setSchool("111111");
        z.setAbound(z1);
        z.show();

        System.out.println("------------------");
        bbb039 zz = new bbb039("2222", z1);
    }
}
