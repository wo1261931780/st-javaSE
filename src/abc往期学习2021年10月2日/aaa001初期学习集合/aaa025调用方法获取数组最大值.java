package abc往期学习2021年10月2日.aaa001初期学习集合;

public class aaa025调用方法获取数组最大值 {
    // public static void main(String[] args) {
    //     int[] arr = {321, 135, 46, 156, 9684, 6156, 7, 56};
    //     b11(arr);
    // }
    //
    // public static void b11(int[] arr) {
    //     int x = 0;
    //     //int mm = arr[x];
    //     int max = 0;
    //     for (System.out.println("开始对比："); x < arr.length; x++) {
    //         if (arr[x] > max) {
    //             max = arr[x];
    //         }
    //     }
    //     System.out.println("数组最大值为：" + max);
    // }
    public static void main(String[] args) {
        System.out.println("----------------------");
        int[] xx = {2, 12, 12, 123, 1, 31, 56, 5};
        int x1 = demo1(xx);
        System.out.println("最大值为：" + x1);
    }

    public static int demo1(int[] arr) {
        // int max = 0;
        //默认使用arr[0]位的参数，否则可能出现0大于数组所有元素的情况
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + i + "次遍历");
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
