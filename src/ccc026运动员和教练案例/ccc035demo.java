package ccc026运动员和教练案例;

public class ccc035demo {
    public static void main(String[] args) {
        ccc031乒乓球运动员 p1 = new ccc031乒乓球运动员(11, "aaa");
        System.out.println("player information-------------");
        System.out.println("队员姓名：" + p1.getName() + "---队员年龄：" + p1.getAge());
        p1.eat();
        p1.study();
        p1.learn();
        System.out.println("guide information-------------");
        ccc033乒乓球教练 g1 = new ccc033乒乓球教练(35, "ggg");
        System.out.println("教练姓名：" + g1.getName() + "---教练年龄：" + g1.getAge());
        g1.eat();
        g1.teach();
        g1.learn();
        System.out.println("-------------------------------------");
        System.out.println("player information-------------");
        ccc032篮球运动员 p2 = new ccc032篮球运动员(22, "bbb");
        System.out.println("队员姓名：" + p2.getName() + "---队员年龄：" + p2.getAge());
        p2.eat();
        p2.study();
        System.out.println("guide information-------------");
        ccc034篮球教练 g2 = new ccc034篮球教练(45, "wwwww");
        System.out.println("教练姓名：" + g2.getName() + "---教练年龄：" + g2.getAge());
        g2.eat();
        g2.teach();
    }
}
