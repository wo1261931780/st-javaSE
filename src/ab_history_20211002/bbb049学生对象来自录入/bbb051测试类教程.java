package ab_history_20211002.bbb049学生对象来自录入;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb051测试类教程 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<bbb050类教程> xx = new ArrayList<bbb050类教程>();
        System.out.println("创建对象");
        //调用ff方法，xx作为对象
        ff(xx);
        System.out.println("创建对象");
        ff(xx);
        System.out.println("创建对象");
        ff(xx);
        for (int z = 0; z < xx.size(); z++) {
            System.out.println("开始遍历：");
            //对象必须在类中创建
            bbb050类教程 q = xx.get(z);
            //使用类中的getname方法获取具体数据。
            System.out.println(q.getName() + q.getAge());
        }
    }

    public static void ff(ArrayList<bbb050类教程> xx) {
        //录入数据------------------------
        Scanner x = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String x1 = x.nextLine();
        System.out.println("请输入年龄：");
        int x2 = x.nextInt();
        //创建学生对象
        bbb050类教程 z1 = new bbb050类教程(x1, x2);
        //把x1赋值给name
        z1.setName(x1);
        //同理赋值age
        z1.setAge(x2);
        //往集合中添加对象-----------------------
        xx.add(z1);
        //和数组不同，arraylist是集合，
        //相比数组的储存数字，arraylist可以储存单个元素x1的所有信息，
        //例如，x1.getname和x1.getage，
    }
}
