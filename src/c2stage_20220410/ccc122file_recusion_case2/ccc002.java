package c2stage_20220410.ccc122file_recusion_case2;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220410.ccc122file_recusion_case2
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-08  星期日
 */
public class ccc002 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(show(1));
    }

    public static int show(int x) {
        // x++;
        if (x == 10) {
            return 1;
        } else {
            return 2 * show(x + 1) + 2;
        }
        // 递归不需要设置数据的变化，在递归过程中，数据自身会发生改变
        // 2022年4月10日21:44:01，今天没搞明白递归。原来反而很清楚
        // 这么说吧，我只需要判断终节点的数据是多少
        // 后面的数据，直接按照公式计算就可以
        // 比如我第一天的数据，是第二天的数据2倍+2
        // 那么我在return的时候，直接2*f(x)+2就可以
        // 只要公式存在，x能走到终结点，那么就没问题
    }
}
