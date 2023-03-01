package wo1261931780.stjavaSE.history.c2stage_20220113.ccc023abstract_class_Design_Patterns;

public class ccc058bank_dingqi extends ccc056bank_abstract {
	public ccc058bank_dingqi(String account, double balances) {
		super(account, balances);
	}

	@Override
	public double caculate_rates() {
		double profits = getBalances() * 1.75 / 100;
		if (getBalances() <= 100000) {
			System.out.println("定期账户");
			System.out.println("收益为：" + profits);
		} else {
			System.out.println("收益为：" + profits);
		}
		return profits;
	}
}
