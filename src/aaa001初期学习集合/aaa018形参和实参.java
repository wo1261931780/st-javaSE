package aaa001初期学习集合;

public class aaa018形参和实参 {
    public static void main(String[] args) {
        //调用方法的时候是实参
        max(10, 20);
    }

    //下面定义方法int xx的时候是形参
    public static void max(int xx, int x2) {
        if (xx > x2) {
            System.out.println("最大值为" + xx);
        } else {
            System.out.println("最大值为" + x2);
        }
        //定义方法，方法的名称可以随便改
        /*Scanner xx = new Scanner(System.in);
        System.out.println("请输入数字：");
        int x1 = xx.nextInt();
        if(x1%2 == 0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
        System.out.println("运行结束");*/
        /*int[] arr = {131, 1, 233};
        int x = 0;
        int max = 0;
        for (System.out.println("开始比较"); x < arr.length; x++)
            if (x1 > arr[x]) {
                max = x1;
            } else {
                max = arr[x];
            }
        System.out.println("最大值为：" + max);*/
    }
}
