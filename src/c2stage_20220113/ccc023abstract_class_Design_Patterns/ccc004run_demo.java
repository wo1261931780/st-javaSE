package c2stage_20220113.ccc023abstract_class_Design_Patterns;

public class ccc004run_demo {
    public static void main(String[] args) {
        // ccc002bank_huoqi x=new ccc002bank_huoqi();
        // x.caculate_rates();
        // 这里的账号还是在子类中创建，但是使用的get和set还是在父类
        // 那么就需要在子类中使用super等方法来调用有参构造对象
        ccc002bank_huoqi x=new ccc002bank_huoqi("111",100000);
        x.caculate_rates();
        x.login("111","100000");
        ccc003bank_dingqi x1=new ccc003bank_dingqi("222",100000);
        x1.caculate_rates();
    }
}
