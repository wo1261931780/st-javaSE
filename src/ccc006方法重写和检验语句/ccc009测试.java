package ccc006方法重写和检验语句;

public class ccc009测试 {
    public static void main(String[] args) {
        ccc007fu x1 = new ccc007fu();
        x1.call("1114");//先把参数传递给父类，然后调用父类的方法
        System.out.println("+++++++++++");
        ccc008zi x2 = new ccc008zi();
        x2.call("123");
        //传递给子类，因为子类重写了方法，所以有子类的内容出现
        //子类中，调用了父类的方法，所以也会显示父类方法的内容
    }
}
