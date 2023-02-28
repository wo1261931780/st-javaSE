package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc109老师学生父类案例;

public class ccc064run {
    public static void main(String[] args) {
        System.out.println("programme start to run");
        ccc061teacher t1 = new ccc061teacher();
        t1.setName();
        t1.setAge();
        t1.teach();
        System.out.println("姓名：" + t1.getName() + "---年龄为：" + t1.getAge());
        ccc062student s1 = new ccc062student();
        s1.setName();
        s1.setAge();
        s1.learn();
        System.out.println("姓名：" + s1.getName() + "---年龄为：" + s1.getAge());
    }
}
