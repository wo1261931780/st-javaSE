package c2stage_20220113.ccc020abstract_card_case;

import java.util.Scanner;

public class ccc004run_demo {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("ÇëÊäÈë¿ª¿¨½ğ¶î£º");
        int recharge = x.nextInt();
        if (recharge >= 10000) {
            ccc002card_au x1 = new ccc002card_au();
            x1.setBalance(recharge);
            x1.setName("11");
            x1.pay(100);
            System.out.println("end");
        } else if (recharge >= 5000 && recharge < 10000) {
            ccc003card_silver x1 = new ccc003card_silver();
            x1.setName("22");
            x1.setBalance(recharge);
            x1.pay(100);
            System.out.println("end2");
        } else {
            System.out.println("ÆÕ¿¨");
        }
    }
}
