package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc018猫狗多态案例;

public class ccc019demo {
    public static void main(String[] args) {
        ccc018animal x = new ccc016cat();
        x.setName("cat1");
        x.setAge(11);
        System.out.println(x.getName() + "现在已经" + x.getAge() + "岁了");
        x.run();
        //向上。
        System.out.println("----------------");
        ccc016cat x1 = (ccc016cat) x;
        x1.run();
        ((ccc016cat) x).near();
        //实际上是x1.near();
        //因为x1=cat x；
        System.out.println("----------------");
        x = new ccc017dog();
        x.run();
        System.out.println("----------------");
        ccc017dog x2 = (ccc017dog) x;
        x2.run();
        x2.caught();
    }
}
