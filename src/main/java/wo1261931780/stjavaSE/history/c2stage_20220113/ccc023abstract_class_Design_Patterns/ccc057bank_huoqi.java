package wo1261931780.stjavaSE.history.c2stage_20220113.ccc023abstract_class_Design_Patterns;

public class ccc057bank_huoqi extends ccc056bank_abstract {
	public ccc057bank_huoqi(String acc, double cash) {
		super(acc, cash);
	}

	@Override
	public double caculate_rates() {
		System.out.println("override");
		double profits = getBalances() * 0.35 / 100;
		System.out.println("ÊÕÒæÎª£º" + profits);
		return profits;
	}


}
