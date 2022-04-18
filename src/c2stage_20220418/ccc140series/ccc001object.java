package c2stage_20220418.ccc140series;

import java.io.Serializable;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220418
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-20-50  星期一
 */
public class ccc001object implements Serializable {
    // 必须实现该接口，才可以进行序列化操作
    // 实际上是一个信号，告诉jvm，请将对象以序列化的形式进行存储操作
    // 反过来说，是不是类似的接口还有很多，根据接口，还可以判断对象存储的类型和格式
    // 设置序列化的版本号，序列化和反序列化，必须保持版本一致，否则反序列化报错

    private static final long serialVersionUID = 1;
    private String name;
    private int age;
    private transient String address;// 加上透明前缀，最后不会参与序列化，防止被反向破译，
    // 如果直接读取文件，只会得到一个address为null的结果

    public ccc001object(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public ccc001object() {
    }

    @Override
    public String toString() {
        return "ccc001object{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
