package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc110猫和狗;

import java.util.Scanner;

public class ccc071testdog extends ccc069testanimal {
    public ccc071testdog() {
        Scanner d1 = new Scanner(System.in);
        Scanner d2 = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int dage = d1.nextInt();
        System.out.println("请输入姓名：");
        String dname = d2.nextLine();
        ccc069testanimal x2 = new ccc069testanimal(dage, dname);
        // ccc069testanimal x2 = new ccc069testanimal();
        // x2.setName(dname);
        // x2.setAge(dage);
    }

    public ccc071testdog(int age, String name) {
    }

    @Override
    public void eatsm() {
        System.out.println("我是狗吃肉，重写eat方法");
    }
}
