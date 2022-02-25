package ab二阶段强化课程2022年1月11日.ccc024猫狗接口版课堂;

import ab二阶段强化课程2022年1月11日.ccc023猫狗接口版.ccc024cat;
import ab二阶段强化课程2022年1月11日.ccc023猫狗接口版.ccc026接口;

public class ccc028demo {
    public static void main(String[] args) {
        ccc026接口 cat = new ccc024cat();
        System.out.print("使用接口的方法：");
        cat.jump();//接口重写后的jump方法
        //这里这么理解：
        //jump方法原来是接口当中存在的，后来子类对jump方法进行了实现
        //所以接口通过多态的方法在子类中创建的对象cat，就可以调用jump方法
        System.out.println("-----------------------");
        ccc029animal a = new ccc026cat();
        a.setName("111");
        a.setAge(001);
        System.out.println("进行姓名和年龄设定后："+a.getName() +"的年龄是："+ a.getAge());
        //使用animal的方法
        //同理：
        //animal中才有带参构造
        //所以父类animal通过多态的方法在子类中创建的对象a，才能对a使用set和get方法
        System.out.println("带参构造使用的是animal的方法--------------------");
        System.out.print("使用animal里面的eat方法：");
        //没有ln的sout语句是，sout(xx)+后面的一个语句。
        a.eat();//animal重写后的eat方法
        System.out.println("继承和接口同时使用，减少了编译-----------------");
        ccc026cat cat2 = new ccc026cat();
        cat2.eat();
        cat2.jump();
        //同时使用的意思是，子类继承了父类animal，同时实现了接口，
        //所以子类有父类和接口当中的jump和eat方法
        //在子类中创建对象，可以直接使用两个方法，减少了代码量
    }
}
