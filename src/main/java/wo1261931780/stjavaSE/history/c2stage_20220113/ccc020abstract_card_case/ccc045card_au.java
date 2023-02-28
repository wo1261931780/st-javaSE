package wo1261931780.stjavaSE.history.c2stage_20220113.ccc020abstract_card_case;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ccc045card_au extends ccc044card {

	@Override
	public void pay(double prices) {
		log.info(getName() + "的账户为金卡，余额" + getBalance() + "，消费" + prices * 0.8 + "，当前剩余" +
				         (getBalance() - prices * 0.8));
	}

	// public static void main(String[] args) {
	//     ccc045card_au x = new ccc045card_au();
	//     Scanner x1 = new Scanner(System.in);
	//     x.setName(x1.nextLine());
	//     log.info("--------------");
	//     Scanner x2 = new Scanner(System.in);
	//     x.setBalance(x2.nextInt());
	//     // x.card();
	//     // x.card_info();
	//     x.pay(100);
	// }

}
