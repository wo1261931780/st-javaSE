package c二阶段强化课程2022年1月11日.ccc109老师学生父类案例;

public class ccc004run {
    public static void main(String[] args) {
        System.out.println("programme start to run");
        ccc001teacher t1 = new ccc001teacher();
//        System.out.println();
        t1.setName();
        t1.setAge();
        t1.teach();
        System.out.println("姓名：" + t1.getName() + "---年龄为：" + t1.getAge());
        ccc002student s1 = new ccc002student();
        s1.setName();
        s1.setAge();
        s1.learn();
        System.out.println("姓名：" + s1.getName() + "---年龄为：" + s1.getAge());
    }
}
