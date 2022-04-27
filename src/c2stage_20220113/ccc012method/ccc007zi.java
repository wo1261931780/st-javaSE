package c2stage_20220113.ccc012method;

public class ccc007zi extends ccc006fu {
    public void zizi() {
        // super.show();
        // 如果直接使用super中的方法，那么一定会出现
        System.out.println("zizi-----------");
    }
    // public ccc007zi(){}


    public ccc007zi(String address) {
        //还是上面的问题，
        // 如果父类只有带参构造，子类会因为没有无参构造，从而无法完成数据初始化
        // 在代码中，子类的构造方法，默认会访问super.xx

        // 也有一个解决办法，
        super(address);// 直接设置一个子类的带参构造，然后把super调用出来
        // 这样，在完成子类数据初始化的过程中，还将具体的数据传递到父类中

    }
}
