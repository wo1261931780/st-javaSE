package c2stage_20220228.ccc078hash_duplication;

import java.util.Objects;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220228.ccc078hash_duplication
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-18  星期三
 */
public class ccc002st_object {
    private String name;
    private int age;
    private String address;

    public ccc002st_object() {
    }

    public ccc002st_object(String name, int age, String address) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ccc002st_object)) {
            return false;
        }
        ccc002st_object that = (ccc002st_object) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }

    @Override
    public String toString() {
        return "ccc002st_object{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
    // 重写了tostring方法，使得本身不展示对象地址，直接展示内容
}
