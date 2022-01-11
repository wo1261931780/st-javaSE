package c二阶段强化课程2022年1月11日.ccc032常用api;

public class ccc035object {
    /**
     * 默认里面有extends object
     * public class ccc035object extends object{
     */
    int age;
    String name;

    public ccc035object() {
    }

    public ccc035object(int age, String name) {
        this.age = age;
        this.name = name;
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
    //因为调用的是这里的object命令，所以在此重写

    /**
     * 下面的tostring命令，在不重写的情况下，
     * 我直接得到结果：“c二阶段强化课程2022年1月11日.ccc032常用api.ccc035object@776ec8df”
     * 为了方便展示，一般需要重写一次
     */
    @Override
    public String toString() {
        return "ccc035object{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
    //结果是：“ccc035object{age=20, name='junw'}”

}
