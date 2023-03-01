package wo1261931780.stjavaSE.history.c2stage_20220213.ccc055排序;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc055排序
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-19-33  星期四
 */
public class ccc001选择排序 {
    public static void main(String[] args) {
        int[] x = {13, 54, 64, 7, 8};
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                // int mid = 0;
                if (x[i] > x[j]) {
                    int mid = x[i];
                    x[i] = x[j];
                    x[j] = mid;
                }
            }
        }
        System.out.println(Arrays.toString(x));
    }
}
