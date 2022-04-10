package c2stage_20220410.ccc122file_recusion_case2;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220410.ccc122file_recusion_case2
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-20-52  ÐÇÆÚÈÕ
 */
public class ccc001 {
    public static void main(String[] args) {
        show(2);
    }

    public static int show(int x) {
        // int demo = x == 1 ? 1 : x - 1;
        // x += x == 1 ? 1 : x - 1;
        if (x != 1) {
            x += show(x - 1);
        }
        return x;
    }
}
