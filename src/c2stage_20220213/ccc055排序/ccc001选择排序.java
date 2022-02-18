package c2stage_20220213.ccc055ÅÅÐò;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc055ÅÅÐò
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-19-33  ÐÇÆÚËÄ
 */
public class ccc001Ñ¡ÔñÅÅÐò {
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
