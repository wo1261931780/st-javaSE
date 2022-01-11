package c二阶段强化课程2022年1月11日.ccc010猫和狗;

import java.util.Scanner;

//这个类实现的功能是，输入猫的姓名和年龄，从而获得带参数的抓老鼠功能
public class ccc015demotype {
    public static void main(String[] args) {
//        System.out.println("please type name of your cat:");
//        Scanner x1=new Scanner(System.in);
//        System.out.println("please type age of your cat:");
//        x1=new Scanner(System.in);
        Scanner xx = new Scanner(System.in);
        System.out.println("please type name of your cat:");
        String x1 = xx.nextLine();
        System.out.println("please type age of your cat:");
        int x2 = xx.nextInt();
        ccc011cat c2 = new ccc011cat(x1, x2);
        System.out.println("cat's name:" + c2.getName() + ",cat's age:" + c2.getAge());
//        System.out.println("please type name of your dog:");
//        Scanner x2=new Scanner(System.in);
//        System.out.println("please type age of your dog:");
//        x2=new Scanner(System.in);
        Scanner xxx = new Scanner(System.in);
        System.out.println("please type name of your dog:");
        String x3 = xxx.nextLine();
        System.out.println("please type age of your dog:");
        int x4 = xxx.nextInt();

        ccc012dog d2 = new ccc012dog(x3, x4);

        System.out.println("dog's name:" + d2.getName() + ",dog's age:" + d2.getAge());
    }
}
