package c2stage_20220213.ccc053arrays对比较器的支持;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc053arrays对比较器的支持
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-22-28  星期三
 */
public class ccc002对象类 {
    private String name;
    private int age;
    private String address;

    public ccc002对象类() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ccc002对象类(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //2022年2月16日23:12:06，重写一个tostring方法，避免自动出现对象地址

    @Override
    public String toString() {
        return "ccc002对象类{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
