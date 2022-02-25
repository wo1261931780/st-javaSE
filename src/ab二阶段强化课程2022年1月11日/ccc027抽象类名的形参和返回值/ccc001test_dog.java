package ab二阶段强化课程2022年1月11日.ccc027抽象类名的形参和返回值;

public class ccc001test_dog extends ccc001test_pet {
    public String name;
    public int age;

    public ccc001test_dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    void eatsm() {
        System.out.println("我是dog子类中的eat方法");
    }

    public void usedog(ccc001test_dog x) {
        x.eatsm();
        System.out.println(x);
    }

    public ccc001test_dog getdog() {
        ccc001test_dog x = new ccc001test_dog();
        return x;
        // 这里返回的是一个地址/对象
    }
}
