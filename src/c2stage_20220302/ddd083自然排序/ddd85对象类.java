package c2stage_20220302.ddd083自然排序;

//import org.jetbrains.annotations.NotNull;

public class ddd85对象类 implements Comparable<ddd85对象类> {
    private String name;
    private int age;

    public ddd85对象类() {
    }

    public ddd85对象类(String name, int age) {
        this.name = name;
        this.age = age;
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
    public int compareTo( ddd85对象类 o) {
        // 注意一下这里的对象类型
        // return 0;
        // return 1;
        // 返回0，表示添加不成功，也就不存在比较
        // 返回1，表示一定比前个数据大
        // 这时按照数据的添加顺序去储存
        // return -1;
        // 表示一定比前个数据小。结果倒序输出
        int num = this.age - o.age;
        // 比较两个数据的大小，正数就按照升序排列
        int num2 = num == 0 ? this.name.compareTo(o.name) : num;
        // num == 0
        // 1.判断年龄是否相等，相等就根据姓名顺序判断
        // this.name.compareTo(o.name)
        // 2.用name和对象name对比内容是否相同
        // 3.name不相同的时候，根据年龄差距排序
        return num2;
    }
}
