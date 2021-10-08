package e二阶段收尾2021年10月8日.eee009可变参数;

public class eee010可变参数和参数混合 {
    public static void main(String[] args) {
        System.out.println(sum(1, 16857));
        System.out.println(sum(1, 1, 1468));
        System.out.println(sum(1, 123, 123123, 5647571));


    }


    // public static int sum(int a, int b) {
    //     return a + b;
    // }
    //
    // public static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }
    //
    // public static int sum(int a, int b, int c, int d) {
    //     return a + b + c + d;
    // }

    /**
     * 这里相当于把所有的参数统一设置为一个对象（数组）
     * 参数较多，并且单个参数和可变参数都存在的时候，
     * 需要将可变参数后移
     */
    public static int sum(int x, int... a) {
        // public static int sum(int... a) {
        // return 0;
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

}
