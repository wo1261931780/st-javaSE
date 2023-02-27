package wo1261931780.stjavaSE.history.c2stage_20220502.ccc174reflect_variable;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc174reflect_variable
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-15-05  星期一
 */
public class ccc001 {
    private String name;
    private String address;
    private int age;
    public static String cl;
    public static final String cl2 = "我是常量";

    public ccc001() {
    }

    public ccc001(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ccc001{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", age=" + age + '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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


//~ Formatted by Jindent --- http://www.jindent.com
