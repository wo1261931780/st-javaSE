package wo1261931780.stjavaSE.history.c2stage_20220302.ddd092随机数案例;


import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ddd093随机数 {
    public static void main(String[] args) {
        // Set<Integer> x = new HashSet<>();
        Set<Integer> x = new TreeSet<>();
        // treeset集合可以执行排序
        while (x.size() < 10) {
            // int x1 = (int) Math.random() * 10;
            // x.add(x1);
            // 为什么上面这个不可以
            Random x1 = new Random();
            int x2 = x1.nextInt(20) + 1;
            x.add(x2);
        }
        for (int i : x) {
            System.out.println(i);
        }
        System.out.println("结束");
    }
    // for (int i = 0; i < 10; i++) {
    //     int x = (int) (Math.random() * 20);
    //     System.out.println(x);
    // }
    // 常规方法获取的数据，会出现重复问题
    // 下面是错误方法
    // public static void mathrandom() {
    //     TreeSet<Integer> x = new TreeSet<>(new Comparator<Integer>() {
    //         @Override
    //         public int compare(Integer o1, Integer o2) {
    //             int num = o1 - o2;
    //             int num2 = num == 0 ? num : 0;
    //             return num2;
    //         }
    //     });
    //     for (int i = 0; i < 10; i++) {
    //         int x1 = (int) Math.random() * 20;
    //         System.out.println(x1);
    //         x.add(x1);
    //     }
    //     System.out.println("-----------------");
    //     for (int i : x) {
    //         System.out.println(i);
    //     }
    // }
}
