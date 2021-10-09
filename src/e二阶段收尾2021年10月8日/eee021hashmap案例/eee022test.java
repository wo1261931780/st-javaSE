package e二阶段收尾2021年10月8日.eee021hashmap案例;

import java.util.*;

public class eee022test {
    public static void main(String[] args) {
        Map<String, String> x = new HashMap<>();
        x.put("001", "a1");
        x.put("002", "a2");
        x.put("003", "a3");
        x.put("004", "a4");
        Set<String> x1 = x.keySet();
        Collection<String> x2 = x.values();
        for (String x3 : x1) {
            System.out.println(x.get(x3) + "***" + x3);
        }
        System.out.println("-----------------------------------");
        Set<Map.Entry<String, String>> x4 = x.entrySet();
        for (Map.Entry<String, String> x3 : x4) {
            System.out.println(x3.getKey() + "---" + x3.getValue());
        }
        System.out.println("结束");
    }
}
