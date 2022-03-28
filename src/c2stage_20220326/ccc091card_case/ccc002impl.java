package c2stage_20220326.ccc091card_case;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326.ccc091card_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-22-12  ÐÇÆÚÁù
 */
public class ccc002impl {
    public static List<ccc001card> demo3 = new ArrayList<>();

    static {
        String[] x1 = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2",};
        String[] x2 = {"?", "?", "?", "?"};
        int index = 0;
        for (String demo : x1) {
            index++;
            for (String demo2 : x2) {
                ccc001card x = new ccc001card(demo, demo2, index);
                demo3.add(x);
            }
        }
        System.out.println("ÐÂÅÆ£º" + demo3);
    }

    public static void main(String[] args) {
        Collections.shuffle(demo3);
        List<ccc001card> x1 = new ArrayList<>();
        List<ccc001card> x2 = new ArrayList<>();
        List<ccc001card> x3 = new ArrayList<>();
        for (int i = 0; i < demo3.size() - 3; i++) {
            ccc001card demo = demo3.get(i);
            if (i % 3 == 0) {
                x1.add(demo);
            } else if (i % 3 == 1) {
                x2.add(demo);
            } else {
                x3.add(demo);
            }
        }
        List<ccc001card> lastcard = demo3.subList(demo3.size() - 3, demo3.size());
    }

    public static void show(List<ccc001card> demo) {
        Collections.sort(demo, new Comparator<ccc001card>() {
            @Override
            public int compare(ccc001card o1, ccc001card o2) {
                return o2.getIndex() - o1.getIndex();
            }
        });
    }
}
