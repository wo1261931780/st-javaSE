package abc往期学习2021年10月2日.bbb055自己写的学生管理系统;

public class bbb066lei {
    private String number;
    private String name;
    private String age;
    private String address;

    public bbb066lei() {
    }

    public bbb066lei(String number, String name, String age, String address) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.address = address;
    }
    //这里交了一个方法来一次性写完所有的命令，需要记好

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
