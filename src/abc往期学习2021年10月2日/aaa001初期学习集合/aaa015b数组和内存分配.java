package abc往期学习2021年10月2日.aaa001初期学习集合;

public class aaa015b数组和内存分配 {
    public static void main(String[] args) {
        System.out.println("输出测试");
        int[] arr = new int[5];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        arr[0] = 100;
        arr[2] = 100;
        System.out.println("--------------------------");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("--------------------------");
        // 多个数组的指向相同
        int[] xx1 = arr;
        // 把数组arr的地址发给xx1，然后xx1访问的时候，直接找到arr的数组所在地，再查出arr的数字
        System.out.println(xx1);
        System.out.println(xx1[0]);
        System.out.println(xx1[1]);
        System.out.println(xx1[2]);
        // 后续不管是查看数组的值，还是修改数组的值，再次访问的时候，结果都相同
    }
}
