package abc往期学习2021年10月2日.bbb015this构造方法封装;

public class bbb015this {
    private String name;
    private int age;

    public void setName(String name1) {
        //这里用this把name转换成了实际参数，防止出现重复。
        this.name = name1;
        //this的作用在于，指定具体的变量，防止出现重复
        // 成员变量，就是类中的变量name
        // this.name指代成员变量，而默认输入的name，指代局部变量
        //例如name1和private中的name重复，那么this.name就代表了private中的name
        //同样的道理，使用于后面的super
    }

    public void setAge(int age1) {
        this.age = age1;
    }

    public void show() {
        System.out.println(name + "---" + age);
    }
}
