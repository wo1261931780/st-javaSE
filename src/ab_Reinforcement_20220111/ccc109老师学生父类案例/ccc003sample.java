package ab_Reinforcement_20220111.ccc109老师学生父类案例;

import java.util.Scanner;
//使用快捷键进行操作，alt+inselt
//一旦给了带参，系统就不给无参，这时需要手动补充一个

public class ccc003sample {
    private String name = "";
    private int age = 0;
    Scanner xx = new Scanner(System.in);

//    public ccc003sample(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public void setName() {
        System.out.println("请输入姓名：");
        String name = xx.nextLine();
        this.name = name;
//        System.out.println(name1);
    }

    Scanner x1 = new Scanner(System.in);

    public void setAge() {
        System.out.println("请输入年龄：");
        int age = x1.nextInt();
        this.age = age;
//        System.out.println(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
