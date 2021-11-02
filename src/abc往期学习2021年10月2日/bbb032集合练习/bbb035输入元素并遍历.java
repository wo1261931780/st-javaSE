package abc往期学习2021年10月2日.bbb032集合练习;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 先输入，然后将输入的对象存储到集合中，
 * 最后对集合中的元素进行遍历操作
 */

public class bbb035输入元素并遍历 {
    public static void main(String[] args) {
        ArrayList<String> xx = new ArrayList<>();
        Scanner zz = new Scanner(System.in);
        //        int x=0;
        System.out.println("开始循环");
        for (int x = 0; x < 5; x++) {
            System.out.println("请输入内容:");
            String x1 = zz.nextLine();
            xx.add(x1);
            // add是从末尾开始添加，比如开始是1，add2之后，就变成了[1,2]
        }
        System.out.println(xx);
        //结果：[1, 1, 1, 2, 2]

        for (int x = 0; x < xx.size(); x++) {
            System.out.println(xx.get(x));
        }
        //最近可能又做了一个错误决定，希望可以真香吧
        // 2021年11月2日20:20:46
        // 不管怎么样，代码是一定要写的
    }
}
