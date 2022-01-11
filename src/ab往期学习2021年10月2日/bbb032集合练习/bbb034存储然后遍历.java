package ab往期学习2021年10月2日.bbb032集合练习;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb034存储然后遍历 {
    public static void main(String[] args) {
        // ArrayList<bbb033> arr=new ArrayList<>();
        // //这里相当于，<>中间是类，arr是对象，意思是，我在bbb033这个类中，创建了arr这个集合，集合是新创建的对象。
        // bbb033 xx=new bbb033();
        // //这个直接创建新的对象。
        // xx.bbb034("asd",123);
        // // xx.bbb034("bbbbb",333);
        // arr.add(xx);
        // for (int x=0;x<arr.size();x++) {
        //     System.out.println(arr.equals(x));
        //     arr.get(x);
        //     System.out.println(arr.get(x));
        // }
        // 这里可以理解为，创建了string类型的arr
        ArrayList<String> arr = new ArrayList<>();
        // Random xx=new Random();
        Scanner xx = new Scanner(System.in);
        // for (int x=0;x<5;x++){
        //   String x0=xx.nextLine();
        //   arr.add(x0);
        //   System.out.println(arr);
        // }
        String x1 = xx.nextLine();
        //直接使用，实现多次输入
        x1 = xx.nextLine();
        //但是必须多次添加进集合
        arr.add(x1);
        x1 = xx.nextLine();
        arr.add(x1);
        x1 = xx.nextLine();
        //这里只表示是否添加成功
        arr.add(x1);// true

        System.out.println(arr);
        //        arr.remove();//删指定内容
        //        arr.remove();//删指定位置
        //        arr.set();//设定指定位置的指定内容
        //        arr.get();//获得指定位置的内容
        //        arr.size();//获得集合中的数量
    }
}
