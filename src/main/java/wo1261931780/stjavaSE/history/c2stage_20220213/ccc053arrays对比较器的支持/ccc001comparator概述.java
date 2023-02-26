package c2stage_20220213.ccc053arrays对比较器的支持;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc052arrays
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-23-08  星期二
 */
public class ccc001comparator概述 {
    public static void main(String[] args) {
        int[] x = {1, 21, 3, 156, 4, 64, 874, 8, 7};// 默认使用int数组类型，可以进行升序排序
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        // *************************************
        Integer[] x1 = {54, 123, 54, 65, 46, 8, 7, 987, 9, 78};//如果是对象类型，则需要指定比较器和比较规则
        Arrays.sort(x1, new Comparator<Integer>() {//需要排序的数组，排序规则
            // 匿名内部类
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        ccc002对象类[] x2 = new ccc002对象类[5];
        x2[0] = new ccc002对象类("刘1", 33, "测试1");
        x2[1] = new ccc002对象类("刘2", 21, "测试2");
        x2[2] = new ccc002对象类("刘3", 12, "测试3");
        x2[3] = new ccc002对象类("刘4", 1, "测试4");
        x2[4] = new ccc002对象类("刘5", 5, "测试5");
        System.out.println(Arrays.toString(x2));
        // ************************************
        Arrays.sort(x2, new Comparator<ccc002对象类>() {
            @Override
            public int compare(ccc002对象类 s1, ccc002对象类 s2) {
                return s1.getAge() - s2.getAge();
                // 如果上面不是整数，是double类型的
                //使用Double.compare(x1.getAge(),x2.getAge())就可以完成比较
                //二者直接返回对比的结果
            }
        });
        System.out.println(Arrays.toString(x2));

    }
}
