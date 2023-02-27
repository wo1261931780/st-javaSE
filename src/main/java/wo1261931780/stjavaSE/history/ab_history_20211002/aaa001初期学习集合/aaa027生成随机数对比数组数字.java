package wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合;

import java.util.Arrays;
import java.util.Random;

@SuppressWarnings("NonAsciiCharacters")
public class aaa027生成随机数对比数组数字 {
    //    public static void main(String[] args){
    //        System.out.println("xxxxxxxx终于来啦");
    public static void main(String[] args) {
        //设定数组长度(元素个数12)
        int[] arr = new int[12];
        //[I@16b98e56这是地址
        System.out.println(Arrays.toString(arr));
        //Arrays.toString(arr)把数组的地址转化成string类型的数组
        //这是里面的数值，因为是动态，所以是随机的。
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        arr[0] = 112;
        System.out.println(arr[0] + arr[5]);
        // 不展示默认数据，arr[0]=112，而arr[5]=0,
        // 上面结果为112
        System.out.println(arr[0] + "" + arr[5]);
        // 加入字符串以后，将二者拼接到一起，结果为1120
        Random b1 = new Random();
        arr[5] = b1.nextInt(100);
        int xx = b1.nextInt(100);
        if (xx > arr[5]) {
            System.out.println("随机数为：" + xx + "和" + arr[5]);
            System.out.println("随机数较大");
        } else if (xx < arr[5]) {
            System.out.println("随机数为：" + xx + "和" + arr[5]);
            System.out.println("随机数较小");
        } else {
            System.out.println("随机数为：" + xx + "和" + arr[5]);
            System.out.println("数据相等");
        }
        //下面都是测试。
        //        System.out.println("12323165465");
        //        System.out.println("12323165465");
        //        System.out.println("12323165465");
        //        System.out.println("12323165465");
        //        int i = 123;
        //        System.out.println("i:" + i);*/
    }
}
