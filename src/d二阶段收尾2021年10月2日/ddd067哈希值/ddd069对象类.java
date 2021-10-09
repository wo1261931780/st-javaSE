package d二阶段收尾2021年10月2日.ddd067哈希值;

import java.util.HashSet;

public class ddd069对象类 {
    private String name;
    private int age;

    public ddd069对象类() {
    }

    public ddd069对象类(String name, int age) {
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

    /**
     * 默认情况下，哈希数据之间不重复
     * 可以进行重写操作，使得返回的所有hashcode都等于0
     */
    // @Override
    // public int hashCode() {
    //     return 0;
    // }
}
