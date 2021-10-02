package abc往期学习2021年10月2日.ccc007私有变量无法重写;

public class ccc001fu {
    /**
     * 方法也可以私有化
     * 同时，私有的方法是不能被子类继承的
     */
    private void show() {//带有private的变量无法进行重写操作
        System.out.println("父类show方法-----------");
    }


    // public void start() {
    void start() {
        System.out.println("父类start方法++++++++++++++++");
    }
}
