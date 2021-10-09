package e二阶段收尾2021年10月8日.eee032统计字符串次数;

import java.util.*;

public class eee033统计字符串次数 {
    public static void main(String[] args) {
        // HashMap<Character, Integer> x = new HashMap<>();
        // 储存格式为hashmap，
        // 字符作为键，次数作为值
        // 最终展示为x=22;
        TreeMap<Character, Integer> x = new TreeMap<>();
        // TreeMap的好处在于，对键进行了排序
        // ---------------------------------------------------------
        Scanner x1 = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String zfc = x1.nextLine();
        // String[] x2 = zfc.split("");
        for (int i = 0; i < zfc.length(); i++) {
            Character x3 = zfc.charAt(i);
            Integer value = x.get(x3);
            // 直接使用int定义会出错，必须使用完整的包装类
            if (value == null) {
                x.put(x3, 1);
            } else {
                // x.put(x3, value++);
                value++;
                x.put(x3, value);
                // 如果直接运行，就会报错
            }
        }
        System.out.println(x);
        Set<Character> x4 = x.keySet();
        StringBuilder x6 = new StringBuilder();
        for (Character i : x4) {
            x6.append(i).append("(").append(x.get(i)).append(")").append("-");
        }
        System.out.println(x6);

    }
}
