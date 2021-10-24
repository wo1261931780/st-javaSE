package abc往期学习2021年10月2日.aaa001初期学习集合;

public class aaa016遍历数组数字 {
    public static void main(String[] args) {
        System.out.println("开始定义数组:");
        //int[] xx = new int[10];动态初始化。
        //int[] xx = new int[]{123,13545,16541,6546748};
        //静态初始化，相当于直接给数组数字
        int[] xx = {111, 222, 333, 44, 6854, 654, 564, 31, 65, 4896, 74, 61, 4, 867, 6};
        // 这里只会显示数组的地址
        System.out.println(xx);
        // System.out.println(xx[1]);
        // System.out.println(xx[2]);
        // System.out.println(xx[0]);数组都是从0开始计数
        //xx.length表示的是，数组长度是一个数字，[]中的数字也可以直接定义.
        System.out.println(xx.length);
        int x = 0;
        for (System.out.println("开始输出："); x < xx.length; x++) {
            System.out.println("第" + x + "个数是：" + xx[x]);
            //System.out.println(xx[x]);
            System.out.println("重复显示--------------------");
        }
    }
}
