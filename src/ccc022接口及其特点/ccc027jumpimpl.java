package ccc022接口及其特点;

public class ccc027jumpimpl implements ccc026jump {//接口名+impl=接口后面的实现类

    @Override
    public void jump() {
        System.out.println("jumpimpl中的jump方法");
        //实现的过程中，如果有任何抽象方法，就必须重写一次，没有则不用
    }

    @Override
    public void eat() {
        System.out.println("jumpimpl的eat方法");
    }

    @Override
    public void run() {
        System.out.println("jumpimpl中的run方法");
    }
}
