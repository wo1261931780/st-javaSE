package ccc007私有变量无法重写;

public class ccc002zi {
    /*
    @Override
    //带有private的变量无法进行重写操作
    private void show() {
        System.out.println("fffffffff-----------");
    }*/

//    @Override
//    public void start() {
//        System.out.println("11");
//        System.out.println("asdadadasdasdasdas");
//    }

//    @Override
    void start() {//自带了默认的访问修饰符，但是权限不如public
        //public》void默认的》private
        System.out.println("11");
        System.out.println("asdadadasdasdasdas");
    }

}
