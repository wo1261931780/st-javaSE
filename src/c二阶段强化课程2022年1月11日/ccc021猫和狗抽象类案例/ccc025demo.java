package c二阶段强化课程2022年1月11日.ccc021猫和狗抽象类案例;

import java.util.Scanner;

public class ccc025demo {
    public static void main(String[] args) {
        System.out.println("请输入猫的名称：");
        Scanner x = new Scanner(System.in);
        String namecat = x.nextLine();
        System.out.println("请输入猫的年龄：");
        Scanner xx = new Scanner(System.in);
        int agecat = xx.nextInt();
        ccc022animal catx = new ccc023Cat();
        System.out.println("开始写入...");
        catx.setName(namecat);
        catx.setAge(agecat);
//        ccc022animal xa=new ccc023Cat(agecat,namecat);
        System.out.println(catx.getName() + "已经" + catx.getAge() + "岁了");
        catx.eat();
    }
}
