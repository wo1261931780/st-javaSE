package abc往期学习2021年10月2日.aaa001初期学习集合;

public class aaa024b引用类型的参数传递 {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        int[] arr = {1, 1, 12, 1, 3, 12};
        System.out.println(arr[2]);
        demo1(arr);
        System.out.println("main中的元素：" + arr[2]);

    }

    public static void demo1(int[] arr) {
        arr[2] = 200;
        // 这里引用的是数组的地址，改变的是堆内存中的数组数据
        System.out.println("我是方法中的元素：" + arr[2]);
    }
}
