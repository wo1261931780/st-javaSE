package wo1261931780.stjavaSE.history.c2stage_20220502.ccc173reflect_class;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc173reflect_api
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-14-35  星期一
 */
public class ccc016object {
    private String name;
    private String address;
    private int age;

    private ccc016object() {
    }

    @Override
    public String toString() {
        return "ccc001{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ccc016object(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
}
