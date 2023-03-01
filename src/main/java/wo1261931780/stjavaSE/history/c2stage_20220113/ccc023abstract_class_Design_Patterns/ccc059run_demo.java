package wo1261931780.stjavaSE.history.c2stage_20220113.ccc023abstract_class_Design_Patterns;

public class ccc059run_demo {
	public static void main(String[] args) {
		// ccc057bank_huoqi x=new ccc057bank_huoqi();
		// x.caculate_rates();
		// 这里的账号还是在子类中创建，但是使用的get和set还是在父类
		// 那么就需要在子类中使用super等方法来调用有参构造对象
		ccc057bank_huoqi x = new ccc057bank_huoqi("111", 100000);
		x.caculate_rates();
		x.login("111", "100000");
		ccc058bank_dingqi x1 = new ccc058bank_dingqi("222", 100000);
		x1.caculate_rates();
	}
}
