package c2stage_20220502.ccc177reflect_framework;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc177reflect_framework
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-16-50  星期一
 */
public class ccc001 {
    private String name;
    private String age;
    private String address;

    public ccc001() {
    }

    public ccc001(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ccc001{" + "name='" + name + '\'' + ", age='" + age + '\'' + ", address='" + address + '\'' + '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
