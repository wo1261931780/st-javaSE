package wo1261931780.stjavaSE.history.c2stage_20220113.ccc010override;

public class ccc014zi extends ccc013fu {
    /*
    @Override
    //带有private的变量无法进行重写操作
    private void show() {
        System.out.println("fffffffff-----------");
    }
    */

    //    @Override
    //    public void start() {
    //        System.out.println("11");
    //        System.out.println("asdadadasdasdasdas");
    //    }

    @Override
    public void start() {
        //自带了默认的访问修饰符，但是权限不如public
        //public》void默认的》private
        // 意思是，public修饰的方法可以重写void方法，
        // 但是viod无法重写public方法

        System.out.println("11");
        System.out.println("asdadadasdasdasdas");
    }

}
