package c2stage_20220502.ccc171Junit_test;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc171Junit_test
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-13-50  星期一
 */
public class ccc001 {
    public static void main(String[] args) {
        showres();
    }

    public static String login(String login_name, String login_paw) {
        if (login_name.equals("admin") && login_paw.equals("123")) {
            return "登录成功";
        } else {
            return "登录失败";
        }
    }

    public static void showres() {
        System.out.println(10 / 0);
    }
}
