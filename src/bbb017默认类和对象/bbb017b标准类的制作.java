package bbb017默认类和对象;

/**
 * 成员变量
 * 使用private修饰
 * 构造方法
 * 提供一个无参构造方法
 * 提供一个带多个参数的构造方法
 * 成员方法
 * 提供每一个成员变量对应的setXxx()/getXxx()
 * 提供一个显示对象信息的show()
 */
public class bbb017b标准类的制作 {
    private int age;
    private String name;

    public bbb017b标准类的制作() {
        System.out.println("我是无参构造方法");
    }

    /**
     * public void bbb017b标准类的制作(int age, String name) {}
     * 上面的方法不算构造方法，因为设定了返回值void
     */
    public bbb017b标准类的制作(int age, String name) {
        System.out.println("带参构造");
        this.age = age;
        this.name = name;
        System.out.println("-----------------------------");
    }

    public void show1() {
        System.out.println(name + "的年龄为：" + age);
        System.out.println("信息展示结束");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
