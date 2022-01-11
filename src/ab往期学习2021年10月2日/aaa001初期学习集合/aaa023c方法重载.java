package ab往期学习2021年10月2日.aaa001初期学习集合;

public class aaa023c方法重载 {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        int xx1 = demo1(10, 10);
        System.out.println(xx1);
        float xx2 = demo1(10, 10, 10);
        System.out.println(xx2);
        double xx3 = demo1(10, 10, 10, 10);
        System.out.println(xx3);
        // 根据参数，来判断到底是哪个方法
    }

    /**
     * 三个方法之间，相互构成方法重载
     * 1.多个方法在同一个类中
     * 2.多个方法的方法名相同
     * 3.参数/类型/数量有一个不相同
     */
    public static int demo1(int x1, int x2) {
        return x1 + x2;
    }

    public static float demo1(int x1, int x2, int x3) {
        return x1 + x2 + x3;
    }

    public static double demo1(int x1, int x2, int x3, int x4) {
        return x1 + x2 + x3 + x4;
    }
}
