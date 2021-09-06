package ccc017多态的转型;

public class ccc020 {
    public static void main(String[] args) {
        ccc018animal x = new ccc019cat();
        //把子类对象赋值给父类使用
        //在cat子类中创建x，使用父类animal的功能
        //这里的x对象实际上是子类cat中存在的，但是x是多态的，可以使用父类的功能
        x.run();//不过这里显示的还是“cat类中的run方法”
        System.out.println("-------------------------------");
        ccc019cat c = (ccc019cat) x;//向下转型，把cat x(父类)给cat c(子类)。
        c.coach();
        c.run();
        System.out.println("-------------------------------");
        ccc019cat d1=new ccc019cat();//上面做的c和创建一个新的cat对象没有差别，
        //都可以直接调用cat中的方法
        d1.run();
        d1.coach();
        System.out.println("-------------------------------");
        x=new ccc021dog();//向下转型，让父类变量可以使用子类的功能
        //这里把x从子类cat中，变到子类dog中，从而使用dog的功能
        //因为需要使用重写，所以功能的名称不能改，必须是run
        x.run();
    }
}
