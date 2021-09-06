package ccc016多态的好坏;

public class ccc019animaloperate {
    //    public void use(ccc018dog x){
//        x.eat();
//    }
    public void use(ccc017animal x) {
        System.out.println("操作类中开始调用use方法");
        x.eat();
        //这里，虽然是dog类中的对象x，使用了dog类中的eat方法，
        //但是上面的sout无论如何还是会走一遍
    }
}
