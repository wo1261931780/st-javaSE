package ab_history_20211002.bbb014输入姓名和成绩;

public class bbb013a关键字private {
    private int age;
    private String name;

    public void showdemo() {
        System.out.println("showdemo---------");
    }

    public int getAge() {
        System.out.println(age);
        return age;

    }

    public void setAge(int age) {
        this.age = age;
        /*
        age = 1;
        this.age = 1;
        这里需要注意，不能直接设置age=1。
        因为age和this.age不同，age指向的是方法内部定义的局部变量，存在于栈内存中。
        this.age指向的是堆内存中的成员变量。
        只有将数据赋值给堆内存中的变量，才有可能实现数据修改――get方法才会生效
        */
        // System.out.println(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // this.name = name;
        name = "naasd";
        // System.out.println(name);
    }
}
