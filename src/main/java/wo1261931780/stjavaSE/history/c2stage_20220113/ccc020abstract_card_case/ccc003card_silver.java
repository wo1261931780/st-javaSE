package c2stage_20220113.ccc020abstract_card_case;

public class ccc003card_silver extends ccc001card {
    @Override
    public void pay(double prices) {
        System.out.println(getName() + "的银卡，当前余额" + getBalance() + "消费" + prices*0.85 + "剩余：" + (getBalance() - prices*0.85));
    }
}
