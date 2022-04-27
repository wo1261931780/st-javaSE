package ab往期学习2021年10月2日.aaa001初期学习集合;

public class aaa018b参数传递2 {
    public static void main(String[] args) {
        //下面是引用类型的参数传递
        //静态初始化
        int[] x = {1, 2, 3, 4, 5, 6, 7};
        //堆内存的数据
        System.out.println("调用前" + x[2]);
        //将x的地址传递到方法中，进而引发堆内存的数据变化
        show(x);
        //堆内存的数据发生变化
        System.out.println("调用后" + x[2]);
    }

    public static void show(int[] x) {// 这里是引用类型的参数传递
        //通过内存地址，找到堆内存中的数据，然后进行赋值
        x[2] = 200;
        //最终修改的是堆内存中的数据
        System.out.println(x[2]);
    }
}
