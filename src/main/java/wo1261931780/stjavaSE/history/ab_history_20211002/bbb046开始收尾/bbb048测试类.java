package ab_history_20211002.bbb046开始收尾;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb048测试类 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String z1 = zz.nextLine();
        System.out.println("请输入年龄：");
        int z2 = zz.nextInt();
        ArrayList<bbb047类> xx = new ArrayList<>();
        bbb047类 x1 = new bbb047类("name", 11);
        //以前创建不了，因为x1不是一个对象，只是一个单独的变量
        xx.add(x1);
        bbb047类 x2 = new bbb047类(z1, z2);
        xx.add(x2);
        bbb047类 x3 = new bbb047类(z1, z2);
        xx.add(x3);
        System.out.println("开始遍历操作：");
        for (int s = 0; s < xx.size(); s++) {
            bbb047类 z = xx.get(s);
            System.out.println(z.getName() + z.getAge());
        }

        // ArrayList<String> zq=new ArrayList<>();
        // Scanner xx=new Scanner(System.in);
        // System.out.println("请开始输入姓名：");
        // String name=xx.nextLine();
        // System.out.println("请开始输入年龄：");
        // int age=xx.nextInt();
        // zq.add(name+age);
        // zq.add(name+age);
        // zq.add(name+age);
        // System.out.println(zq);
        // for (int x=0;x<zq.size();x++){
        //     String s=zq.get(x);
        //     System.out.println(s);
        // }上面都是已经完成的方法
    }
}
