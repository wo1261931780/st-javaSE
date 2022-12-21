package ab_history_20211002.aaa001初期学习集合;

public class aaa018d引用类型的参数传递 {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        int[] arr = {1, 1, 12, 1, 3, 12};
        // 静态初始化一个数组
        System.out.println(arr[2]);
        // 获取指定位置的数据
        demo1(arr);
        // 使用方法对指定位置的数据进行改写
        System.out.println("main中的元素：" + arr[2]);
        // 展示改写后的结果
    }

    public static void demo1(int[] arr) {
        arr[2] = 200;
        // 这里引用的是数组的地址，改变的是堆内存中的数组数据
        System.out.println("我是方法中的元素：" + arr[2]);
    }
}
