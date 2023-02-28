package wo1261931780.stjavaSE.history.c2stage_20220113.ccc020abstract_card_case;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class ccc047run_demo {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		log.info("ÇëÊäÈë¿ª¿¨½ğ¶î£º");
		int recharge = x.nextInt();
		if (recharge >= 10000) {
			ccc045card_au x1 = new ccc045card_au();
			x1.setBalance(recharge);
			x1.setName("11");
			x1.pay(100);
			System.out.println("end");
		} else if (recharge >= 5000 && recharge < 10000) {
			ccc046card_silver x1 = new ccc046card_silver();
			x1.setName("22");
			x1.setBalance(recharge);
			x1.pay(100);
			System.out.println("end2");
		} else {
			System.out.println("ÆÕ¿¨");
		}
	}
}
