package ab_Reinforcement_20220111.ccc027抽象类名的形参和返回值;

public class ccc031demo {
    public static void main(String[] args) {
        //创建操作类对象，调用方法
        ccc030动物操作类 xx = new ccc030动物操作类();
        //因为操作类中的use方法是带参的，参数必须是animal类中的对象
        ccc028animal x = new ccc029子类();
        // 上面这条语句，和xx.getanimal();的效果完全相同
        // 都是创建对象
        xx.use(x);
        //这里use里面必须有一个animal中的对象，
        //但是animal是抽象类型的，不能创建对象，
        //所以必须用子类，通过多态的方式创建，
        //ccc028animal x=new ccc031子类();这里相当于在子类中创建了一个对象x，
        //而x具备animal这个抽象类的属性
        //这时把子类对象x传递回use方法中，
        //实现的效果是――操作类中的xx使用use方法，
        //而use方法实现了animal中的对象x.eat
        //最后的结果是：animal中的x使用了eat方法
        //相当于animal a2=new 子类
        ccc028animal a2 = xx.getanimal();
        a2.eat();
        //两个方式的差别在于无参的方法中，自带了创建对象的操作
    }
}
