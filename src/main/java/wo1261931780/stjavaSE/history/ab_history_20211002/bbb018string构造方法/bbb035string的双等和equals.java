package wo1261931780.stjavaSE.history.ab_history_20211002.bbb018string构造方法;

import java.util.Scanner;

public class bbb035string的双等和equals {
    public static void main(String[] args) {
        String name = "11A";
        String paw = "22A";
        Scanner x = new Scanner(System.in);
        System.out.println("账号");
        String x1 = x.nextLine();
        System.out.println("密码：");
        String x2 = x.nextLine();
        // if (name == x1 && paw == x2) {//双等号比较的是地址，如果比较内容必须用equals方法
        // equals括号内为object，表示可以是任意内容
        // 这里会区分大小写
        if (name.equals(x1) && paw.equals(x2)) {
            System.out.println("correct");
        } else {
            System.out.println("please try again");
        }
        // 忽略大小写比较内容的Api: 一般用于比较验证码这样的业务逻辑
        if (name.equalsIgnoreCase(x1) && paw.equalsIgnoreCase(x2)) {
            System.out.println("不区分大小写，内容正确");
        }
        // 基本数据类型用双等，引用数据类型用equals
    }
}
