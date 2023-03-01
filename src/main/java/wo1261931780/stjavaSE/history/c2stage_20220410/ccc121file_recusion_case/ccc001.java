package wo1261931780.stjavaSE.history.c2stage_20220410.ccc121file_recusion_case;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220410.ccc121file_recusion_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-11-01  星期日
 */
public class ccc001 {
    public static void main(String[] args) {
        System.out.println("方法开始");
        System.out.println(f_show(3));
        // System.out.println();
    }

    public static int f_show(int x) {
        System.out.println("阶乘开始：");
        if (x > 1) {
            // int x1 = x - 1;
            // x *= x - 1;
            x *= f_show(x - 1);
        }
        return x;
    }
}
