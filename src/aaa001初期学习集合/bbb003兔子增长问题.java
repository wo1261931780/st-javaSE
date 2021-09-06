package aaa001初期学习集合;

public class bbb003兔子增长问题 {
    public static void main(String[] args) {
        //第一次代码-------------------
        /*int x1=1;
        int x2=1;
        int xx = 3;
        int x3 = 0;
        for(System.out.println("开始计算:");xx<21;xx++){
            x3=x1+x2;
            x1=x2;
            x2=x3;
            System.out.println("第"+xx+"个月的时候，数量是："+x3);
        }*/

        int[] xx = new int[20];
        xx[0] = 1;
        xx[1] = 1;
        //xx[2] = xx[0] + xx[1];
        int x = 2;
        for (System.out.println("开始计算:"); x < xx.length; x++) {
            xx[x] = xx[x - 2] + xx[x - 1];
            //xx[x - 2] = xx[x - 1];
            //xx[x - 1] = xx[x];
            System.out.println("第" + x + "个月的时候，数量是：" + xx[x]);
        }
    }
}
