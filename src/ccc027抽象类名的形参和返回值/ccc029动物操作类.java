package ccc027抽象类名的形参和返回值;

public class ccc029动物操作类 {
    public void use(ccc028animal a) {//因为抽象无法创建，所以在子类中new了一个x
        //括号内相当于ccc028animal a=new ccc028animal。
        a.eat();
        System.out.println(a);//这里出现的是地址值，而不是变量x
    }

    public ccc028animal getanimal() {
        ccc028animal a = new ccc031子类();//在animal中创建方法，
        // 因为无法创建对象，所以方法内部多态的方式创建新的对象
        return a;//创建完了需要返回
    }
}
