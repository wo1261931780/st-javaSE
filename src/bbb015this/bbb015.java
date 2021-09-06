package bbb015this;

public class bbb015 {
    private String name;
    private int age;

    public void setName(String name1) {
        this.name = name1;//这里用this把name转换成了实际参数，防止出现重复。
        //this的作用在于，指定具体的变量，防止出现重复
        //例如name1和private中的那么重复，那么this.name就代表了private中的name
        //同样的道理，使用于后面的super
    }

    public void setAge(int age1) {
        this.age = age1;
    }

    public void show() {
        System.out.println(name + "---" + age);
    }


}
