package aaa001初期学习集合;

public class aaa025调用方法获取数组最大值 {
    public static void main(String[] args) {
        int[] arr = {321, 135, 46, 156, 9684, 6156, 7, 56};
        b11(arr);
    }

    public static void b11(int[] arr) {
        int x = 0;
        //int mm = arr[x];
        int max = 0;
        for (System.out.println("开始对比："); x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            } else {
            }
        }
        System.out.println("数组最大值为：" + max);

    }

}
