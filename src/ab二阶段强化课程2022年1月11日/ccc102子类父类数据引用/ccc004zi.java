package ab二阶段强化课程2022年1月11日.ccc102子类父类数据引用;

import java.util.Scanner;

public class ccc004zi extends ccc003fu {

    public int age = 11;
    //这里说明，同一变量，如果在类下面有定义，则使用给出的值
    //先使用方法中的值，
    // 然后是子类中的，
    // 最后是父类的

    public void zi() {
        Scanner xx = new Scanner(System.in);
        System.out.println("please text your height in the line:");
        int height = xx.nextInt();
        System.out.println("身高：" + height);
        //有static则无法使用
        System.out.println("age:" + age);
    }
}
