package wo1261931780.stjavaSE.history.c2stage_20220113.ccc013brother_constructor;

public class ccc024father {
    private String name;
    private int age;

    public ccc024father() {
    }

    public ccc024father(String name, int age) {
        this.name = name;
        this.age = age;
        // this(name,11);
    }
    public ccc024father(String name) {//兄弟构造器
        this(name,11);
        // 在构造的时候，默认设置了age的初试值为11
        // 需要说明的是，
        // 在构造的过程中，因为继承自object类
        // 所有的方法第一行默认都是用super命令
        // 但是this和super无法共用同一行，所以这里使用的是this
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
}
