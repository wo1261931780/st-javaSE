package wo1261931780.stjavaSE.history.c2stage_20220113.ccc010override;

public class ccc013fu {
    /**
     * 方法也可以私有化
     * 同时，私有的方法是不能被子类继承的
     */
    private void show() {//带有private的变量无法进行重写操作
        System.out.println("父类show方法-----------");
    }


    void start() {
        System.out.println("父类start方法++++++++++++++++");
    }
}
