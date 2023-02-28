package wo1261931780.stjavaSE.history.c2stage_20220113.ccc009super_this;

public class ccc012zi extends ccc011fu {
    public int age = 22;

    public void show() {
        int age = 33;
        //使用的是方法中的33
        System.out.println(age);
        //使用本类中成员变量的22
        System.out.println(this.age);
        //使用父类中的11
        System.out.println(super.age);
    }
}
