package abc往期学习2021年10月2日.bbb017默认类和对象;

public class bbb018 {
    private String name;
    private int age;

    //构造方法一定要用类的名称吗？2021年9月15日17:17:42，是的
    public bbb018() {
        System.out.println("测试结果");
    }

    //    public bbb018(String zz){
    // 如果给出了方法，上面就会消失，需要按给出的方法定义变量。
    //        System.out.println("zzz");
    //    }
    public bbb018(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
