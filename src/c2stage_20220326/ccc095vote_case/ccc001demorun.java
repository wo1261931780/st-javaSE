package c2stage_20220326.ccc095vote_case;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326.ccc095vote_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-17-46  星期日
 */
public class ccc001demorun {
    public static void main(String[] args) {
        Map<String, String> student = new HashMap<>();
        Map<String, Integer> pla = new HashMap<>();
        pla.put("A", 0);
        pla.put("B", 0);
        pla.put("C", 0);
        pla.put("D", 0);
        Scanner x = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("请输入姓名：");
            String name = x.nextLine();
            System.out.println("请输入地点：");
            String place = x.nextLine();
            vote1(student, name, place);
        }
        vote_result(student, pla);

    }

    public static void vote1(Map<String, String> student, String x1, String x2) {
        student.put(x1, x2);
    }

    public static void vote_result(Map<String, String> student, Map<String, Integer> pla) {
        // Set<Map.Entry<String, Integer>> ent_demo = pla.entrySet();
        student.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String integer) {
                System.out.println(s + "-----" + integer);
                Integer demo = pla.get(integer);
                if (demo != null) {
                    demo++;
                    pla.put(integer, demo);
                }
            }
        });
        System.out.println(pla);
    }
}
