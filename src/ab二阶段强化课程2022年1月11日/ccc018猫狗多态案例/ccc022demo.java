package ab二阶段强化课程2022年1月11日.ccc018猫狗多态案例;

public class ccc022demo {
    public static void main(String[] args) {
        ccc021animal x = new ccc019cat();
        x.setName("cat1");
        x.setAge(11);
        System.out.println(x.getName() + "现在已经" + x.getAge() + "岁了");
        x.run();
        //向上。
        System.out.println("----------------");
        ccc019cat x1 = (ccc019cat) x;
        x1.run();
        ((ccc019cat) x).near();
        //实际上是x1.near();
        //因为x1=cat x；
        System.out.println("----------------");
        x = new ccc020dog();
        x.run();
        System.out.println("----------------");
        ccc020dog x2 = (ccc020dog) x;
        x2.run();
        x2.caught();
    }
}
