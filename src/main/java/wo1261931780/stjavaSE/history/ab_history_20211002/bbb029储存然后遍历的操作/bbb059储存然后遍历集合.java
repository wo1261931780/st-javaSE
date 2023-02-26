package wo1261931780.stjavaSE.history.ab_history_20211002.bbb029储存然后遍历的操作;

import java.util.ArrayList;

public class bbb059储存然后遍历集合 {
    public static void main(String[] args) {
        //         Random zz=new Random();
        //         int z1=zz.nextInt(1000);
        //         ArrayList<String> xx=new ArrayList<>();
        //         xx.add("11");
        //         xx.add("22");
        //         xx.add("33");
        // //        String zq="xx";
        // //        xx.add(zq);
        // //        ArrayList<int> z=new ArrayList<int>();
        // //        xx.add("z1");
        //         System.out.println("开始遍历");
        //         for (int x=0;x<xx.size();x++){
        //             System.out.println("输出");
        //             System.out.println(xx.get(x));
        //         }
        ArrayList<String> x = new ArrayList<>();
        x.add("111");
        x.add("222");
        x.add("333");
        System.out.print("[");
        for (int i = 0; i < x.size(); i++) {
            System.out.print("第" + (i + 1) + "个数据为：" + x.get(i) + "--");
        }
        System.out.print("]");
    }
}
