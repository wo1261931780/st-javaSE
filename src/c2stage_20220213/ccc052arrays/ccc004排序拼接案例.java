package c2stage_20220213.ccc052arrays;

public class ccc004排序拼接案例 {
    public static void main(String[] args) {
        System.out.println("我是测试类");
        // int[] xx = {1, 32, 165, 4, 15, 156, 4, 46, 4};
        int[] xx = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0, temp = 0; i < (xx.length - 1); i++) {
            // 只遍历一次的情况下，只会将i位的数据和前后数据对比，其他数据往前平移
            // 最终只能得到[8,7,6,5,4,3,2,1,9]
            // 即9会到最后，其他的数据顺序不变
            for (int x = 0; x < xx.length - 1 - i; x++) {
                // 我们每次遍历，需要排序的数字都会减少一位
                // 第一次排序，结果为：[8,7,6,5,4,3,2,1,9]
                // 第二次排序，结果为：[7,6,5,4,3,2,1,8,9]
                // 往后以此类推
                // 第i次排序，需要排序的数据长度为（xx.length-1-i）
                if (xx[x] < xx[x + 1]) {
                } else {
                    temp = xx[x + 1];
                    xx[x + 1] = xx[x];
                    xx[x] = temp;
                    System.out.println(sortsm(xx));
                }
            }
            System.out.println("---");
            // 2021年10月2日10:31:56
            // 考虑过合并循环，但是嵌套的循环，合并后导致只排序五次
        }
        System.out.println(sortsm(xx));
        // System.out.println(xx.toString());

    }

    // 数组拼接模块
    public static String sortsm(int[] x) {
        StringBuilder x1 = new StringBuilder();
        x1.append("[");
        for (int i = 0; i < x.length; i++) {
            if (i == x.length - 1) {
                x1.append(x[i]);
            } else {
                x1.append(x[i]).append(",");
            }
        }
        x1.append("]");
        return x1.toString();
    }
}
